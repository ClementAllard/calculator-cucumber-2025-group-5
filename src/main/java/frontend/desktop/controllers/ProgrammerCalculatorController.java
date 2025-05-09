package frontend.desktop.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.util.Pair;

import java.util.ArrayList;

public class ProgrammerCalculatorController extends StandardCalculatorController {


    @FXML
    public ChoiceBox<String> baseSetting;

    @FXML
    public ChoiceBox<String> shiftSetting;

    private String prevBase = "DEC";
    private String currBase = "DEC";

    private String shiftType;

    private final String[] shiftTypes = {"Arithmetic", "Logical", "Rotate", "Rotate through carry"};
    private final String[] baseTypes = {"BIN", "OCT", "DEC", "HEX"};



    Pair<String, String> popLastNumber() {
        String currentInput = inputLabel.getText();
        StringBuilder lastNumber = new StringBuilder();
        while (!currentInput.isEmpty() && (Character.isDigit(currentInput.charAt(currentInput.length() - 1))
                || String.valueOf(currentInput.charAt(currentInput.length() - 1)).matches("[,A-Fa-f]"))) {
            lastNumber.insert(0, currentInput.charAt(currentInput.length() - 1));
            currentInput = currentInput.substring(0, currentInput.length() - 1);
        }
        return new Pair<>(currentInput, lastNumber.toString());
    }

    private void initializeRightGridPane() {
        // Initialize the right grid pane with buttons and their actions
        rightGridPane.getChildren().forEach(node -> {
            if (node instanceof Button button) {
                switch (button.getText()) {
                    case "<<" -> button.setOnAction(event -> handleSymbolButton("Lsh"));
                    case ">>" -> button.setOnAction(event -> handleSymbolButton("Rsh"));
                    case "⇒" -> button.setOnAction(event -> handleSymbolButton("Imp"));
                    case "⇔" -> button.setOnAction(event -> handleSymbolButton("Iff"));
                    default -> button.setOnAction(event -> handleSymbolButton(button.getText()));
                }
            }
        });
    }

    private void changeNumbersToBase() {
        // Change the numbers in the calculator to the specified base
        String currentInput = inputLabel.getText();
        ArrayList<String> numbers = new ArrayList<>();
        StringBuilder number = new StringBuilder();
        // Extract numbers from the current input
        for (int i = 0; i < currentInput.length(); i++) {
            char c = currentInput.charAt(i);
            if (Character.isDigit(c) || String.valueOf(c).matches("[A-Fa-f]")) {
                number.append(c);
            } else {
                if (!number.isEmpty()) {
                    numbers.add(number.toString());
                    number.setLength(0);
                }
            }
        }
        if (!number.isEmpty()) {
            numbers.add(number.toString());
        }
        // Replace the numbers in the current input with their equivalent in the specified base
        int oldRadix = getRadixFromBase(prevBase);
        int newRadix = getRadixFromBase(currBase);
        for (String num : numbers) {
            try {
                int decimalValue = Integer.parseInt(num, oldRadix);
                String newValue = Integer.toString(decimalValue, newRadix);
                currentInput = currentInput.replace(num, newValue);
            } catch (NumberFormatException e) {
                // Handle an invalid number format
                outputLabel.setText("INVALID NUMBER");
            }
        }

        inputLabel.setText(currentInput);
    }

    private int getRadixFromBase(String prevBase) {
        int radix;
        switch (prevBase) {
            case "BIN" -> radix = 2;
            case "OCT" -> radix = 8;
            case "DEC" -> radix = 10;
            case "HEX" -> radix = 16;
            default -> throw new IllegalStateException("Unexpected value: " + prevBase);
        }
        return radix;
    }


    private void handleBaseChange() {
        // Handle the base change logic here
        switch (currBase) {
            case "BIN" -> {
                // Update the calculator to binary mode
                leftGridPane.getChildren().forEach(node -> {
                    if (node instanceof Button button) {
                        button.setDisable(!button.getText().matches("[01%]"));
                    }
                });
            }
            case "OCT" -> {
                // Update the calculator to octal mode
                leftGridPane.getChildren().forEach(node -> {
                    if (node instanceof Button button) {
                        button.setDisable(!button.getText().matches("[0-7%]"));
                    }
                });
            }
            case "DEC" -> {
                // Update the calculator to decimal mode
                leftGridPane.getChildren().forEach(node -> {
                    if (node instanceof Button button) {
                        button.setDisable(!button.getText().matches("[\\d%]"));
                    }
                });
            }
            case "HEX" -> {
                // Update the calculator to hexadecimal mode
                leftGridPane.getChildren().forEach(node -> {
                    if (node instanceof Button button) {
                        button.setDisable(!button.getText().matches("[0-9A-Fa-f%]"));
                    }
                });
            }
            default -> {
                // Handle invalid base
                outputLabel.setText("INVALID BASE");}
        }
        changeNumbersToBase();
    }


    @Override
    void initialize() {
        // Initialize the base setting choice box
        baseSetting.getItems().addAll(baseTypes);
        baseSetting.setValue(baseTypes[2]);
        baseSetting.setOnAction(_ -> {
            currBase = baseSetting.getValue();
            if (!prevBase.equals(currBase)) {
                handleBaseChange();
                prevBase = currBase;
            }
        });
        handleBaseChange();
        // Initialize the shift setting choice box
        shiftSetting.getItems().addAll(shiftTypes);
        shiftSetting.setValue(shiftTypes[0]);
        setShiftType(shiftSetting.getValue());
        shiftSetting.setOnAction(_ -> setShiftType(shiftSetting.getValue()));

        initializeLeftGridPane();
        initializeCenterGridPane();
        initializeRightGridPane();

    }

    public String getShiftType() {
        return shiftType;
    }

    public void setShiftType(String shiftType) {
        this.shiftType = shiftType;
    }
}

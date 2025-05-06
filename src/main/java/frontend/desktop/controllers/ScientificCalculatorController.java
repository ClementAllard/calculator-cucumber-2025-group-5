package frontend.desktop.controllers;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Spinner;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.util.Pair;

public class ScientificCalculatorController extends StandardCalculatorController {

    @FXML
    public GridPane firstTab;

    @FXML
    public GridPane secondTab;

    @FXML
    public GridPane thirdTab;

    @FXML
    public ChoiceBox<String> angleSetting;

    private boolean radianMode = false;

    @FXML
    public HBox convertBox;

    @FXML
    public Button integerButton;

    @FXML
    public Spinner<Integer> handSpinner;

    @FXML
    public Button rationalButton;

    @FXML
    public Spinner<Integer> rationalSpinner;

    @FXML
    public Button realButton;

    @FXML
    public Spinner<Integer> realSpinner;

    @FXML
    public Button complexButton;

    @FXML
    public Spinner<Integer> complexSpinner;

    Pair<String, String> popLastNumber() {
        String currentInput = inputLabel.getText();
        StringBuilder lastNumber = new StringBuilder();
        while (!currentInput.isEmpty() && (Character.isDigit(currentInput.charAt(currentInput.length() - 1))
                || currentInput.charAt(currentInput.length() - 1) == '.'
                || currentInput.charAt(currentInput.length() - 1) == 'I'
                || currentInput.charAt(currentInput.length() - 1) == 'P'
                || currentInput.charAt(currentInput.length() - 1) == 'e')) {
            lastNumber.insert(0, currentInput.charAt(currentInput.length() - 1));
            currentInput = currentInput.substring(0, currentInput.length() - 1);
        }
        return new Pair<>(currentInput, lastNumber.toString());
    }

    void handleInverseButton() {
        Pair<String, String> result = popLastNumber();
        String currentInput = result.getKey();
        String lastNumber = result.getValue();
        inputLabel.setText(currentInput + "1/" + lastNumber);
    }

    void handleConvertButton(String conversionType) {
        Pair<String, String> result = popLastNumber();
        String currentInput = result.getKey();
        String lastNumber = result.getValue();
        if (conversionType.equals("to rad")) {
            inputLabel.setText(currentInput + "rad(" + lastNumber + ")");
        }
        else if (conversionType.equals("to deg")) {
            inputLabel.setText(currentInput + "deg(" + lastNumber + ")");
        }
    }

    void handleXExpButton(String x) {
        Pair<String, String> result = popLastNumber();
        String currentInput = result.getKey();
        String lastNumber = result.getValue();
        inputLabel.setText(currentInput + x);
        handleExpButton(lastNumber);
    }

    void handleIntegerGeneration(String upperBound) {
        // TODO : Implement integer generation logic
    }

    void handleRationalGeneration(String upperBound) {
        // TODO : Implement rational generation logic
    }

    void handleRealGeneration(String precision) {
        // TODO : Implement real generation logic
    }

    void handleComplexGeneration(String precision) {
        // TODO : Implement complex generation logic
    }

    private void initializeLeftGridPane() {
        leftGridPane.getChildren().forEach(node -> {
            if (node instanceof Button button) {
                button.setOnAction(event -> handleSymbolButton(button.getText()));
            }
        });
    }

    private void initializeCenterGridPane() {
        centerGridPane.getChildren().forEach(node -> {
        if (node instanceof Button button) {
            switch (button.getText()) {
                case "DEL" -> button.setOnAction(event -> handleDeleteButton());
                case "Reset" -> button.setOnAction(event -> handleClearButton());
                case "×" -> button.setOnAction(event -> handleSymbolButton("*"));
                case "÷" -> button.setOnAction(event -> handleSymbolButton("/"));
                case "+" -> button.setOnAction(event -> handleSymbolButton("+"));
                case "−" -> button.setOnAction(event -> handleSymbolButton("−"));
                case "=" -> button.setOnAction(event -> handleEqualButton());
                default -> button.setOnAction(event -> handleSymbolButton(""));
            }
        }
    });}

    private void initializeRightGridPane() {
        rightGridPane.getChildren().forEach(node -> {
            if (node instanceof Button button) {
                switch (button.getText()) {
                    case "(", ")", "e" -> button.setOnAction(event -> handleSymbolButton(button.getText()));
                    case "π" -> button.setOnAction(event -> handlePiButton());
                    case "log" -> button.setOnAction(event -> handleSymbolButton("log("));
                    case "1/x" -> button.setOnAction(event -> handleInverseButton());
                    case "ln" -> button.setOnAction(event -> handleSymbolButton("ln("));
                    case "mod" -> button.setOnAction(event -> handleSymbolButton("mod("));
                    default -> button.setOnAction(event -> handleSymbolButton(""));
                }
            }
        });
    }

    private void initializeFirstTab() {
        firstTab.getChildren().forEach(node -> {
            if (node instanceof Button button) {
                switch (button.getText()) {
                    case "sin" -> button.setOnAction(event -> handleSymbolButton("sin("));
                    case "cos" -> button.setOnAction(event -> handleSymbolButton("cos("));
                    case "tan" -> button.setOnAction(event -> handleSymbolButton("tan("));
                    case "x²" -> button.setOnAction(event -> handleExpButton("2"));
                    case "²√x" -> button.setOnAction(event -> handleSQRTButton("2"));
                    case "10 ˣ" -> button.setOnAction(event -> handleXExpButton("10"));
                    default -> button.setOnAction(event -> handleSymbolButton(""));
                }
            }
        });
    }


    private void initializeSecondTab() {
        secondTab.getChildren().forEach(node -> {
            if (node instanceof Button button) {
                switch (button.getText()) {
                    case "arccos" -> button.setOnAction(event -> handleSymbolButton("arccos("));
                    case "arcsin" -> button.setOnAction(event -> handleSymbolButton("arcsin("));
                    case "arctan" -> button.setOnAction(event -> handleSymbolButton("arctan("));
                    case "x³" -> button.setOnAction(event -> handleExpButton("3"));
                    case "³√x" -> button.setOnAction(event -> handleSQRTButton("3"));
                    case "2 ˣ" -> button.setOnAction(event -> handleXExpButton("2"));
                    default -> button.setOnAction(event -> handleSymbolButton(""));
                }
            }
        });
    }

    private void initializeThirdTab() {
        thirdTab.getChildren().forEach(node -> {
            if (node instanceof Button button) {
                switch (button.getText()) {
                    case "cosh" -> button.setOnAction(event -> handleSymbolButton("cosh("));
                    case "sinh" -> button.setOnAction(event -> handleSymbolButton("sinh("));
                    case "tanh" -> button.setOnAction(event -> handleSymbolButton("tanh("));
                    case "xʸ" -> button.setOnAction(event -> handleExpButton(""));
                    case "ʸ√x" -> button.setOnAction(event -> handleSQRTButton(""));
                    case "e ˣ" -> button.setOnAction(event -> handleXExpButton("e"));
                    default -> button.setOnAction(event -> handleSymbolButton(""));
                }
            }
        });
    }

    private void initializeFourthTab() {
        handSpinner.setPromptText("Bound");
        rationalSpinner.setPromptText("Bound");
        realSpinner.setPromptText("Digits");
        complexSpinner.setPromptText("Digits");
        integerButton.setOnAction(event -> handleIntegerGeneration(handSpinner.getValue().toString()));
        rationalButton.setOnAction(event -> handleRationalGeneration(rationalSpinner.getValue().toString()));
        realButton.setOnAction(event -> handleRealGeneration(realSpinner.getValue().toString()));
        complexButton.setOnAction(event -> handleComplexGeneration(complexSpinner.getValue().toString()));
    }

    private void initializeConvertBox() {
        convertBox.getChildren().forEach(node -> {
            if (node instanceof Button button) {
                switch (button.getText()) {
                    case "to rad" -> button.setOnAction(event -> handleConvertButton("to rad"));
                    case "to deg" -> button.setOnAction(event -> handleConvertButton("to deg"));
                    default -> button.setOnAction(event -> handleSymbolButton(""));
                }
            }
        });
    }

    @Override
    void initialize() {
        angleSetting.setItems(FXCollections.observableArrayList("DEG", "RAD"));
        angleSetting.setValue("DEG");
        angleSetting.getSelectionModel().selectedItemProperty().addListener((_, _, newValue) -> {
            if (newValue.equals("DEG")) {
                radianMode = false;
            } else if (newValue.equals("RAD")) {
                radianMode = true;
            }
        });
        initializeLeftGridPane();
        initializeCenterGridPane();
        initializeRightGridPane();
        initializeFirstTab();
        initializeSecondTab();
        initializeThirdTab();
        initializeFourthTab();
        initializeConvertBox();
    }

    public boolean isRadianMode() {
        return radianMode;
    }

    public void setRadianMode(boolean radianMode) {
        this.radianMode = radianMode;
    }
}

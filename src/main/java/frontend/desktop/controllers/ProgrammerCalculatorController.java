package frontend.desktop.controllers;

import calculator.expression.Expression;
import helper.IllegalSyntax;
import helper.MyExpressionParser;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.GridPane;
import javafx.util.Pair;
import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProgrammerCalculatorController extends StandardCalculatorController {
    /**
     * This class is the controller for the programmer calculator.
     * It extends the StandardCalculatorController class and adds functionality for programmer mode.
     * It handles the user interface and the logic for the programmer calculator.
     */

    private static final String BASE_ERROR = "INVALID BASE";

    @FXML
    public ChoiceBox<String> baseSetting;

    @FXML
    public ChoiceBox<String> shiftSetting;

    private String prevBase = "DEC";
    private String currBase = "DEC";

    private final ObservableList<String> baseTypes = FXCollections.observableArrayList("BIN", "OCT", "DEC", "HEX");

    @FXML
    public GridPane rightGridPane2;

    /**
     * This method pops the last number from the input label.
     * It removes the last number from the input label and returns it as a string.
     * "Numbers" also include the symbols ",", "A", "B", "C", "D", "E", and "F" for hexadecimal representation.
     * Lowercase letters are also accepted to prevent errors.
     * @return a Pair containing the current input minus the last number and the last number
     */
    Pair<String, String> popLastNumber() {
        String currentInput = inputLabel.getText();
        StringBuilder lastNumber = new StringBuilder();
        while (!currentInput.isEmpty() && (Character.isDigit(currentInput.charAt(currentInput.length() - 1))
                || String.valueOf(currentInput.charAt(currentInput.length() - 1)).matches("[.A-Fa-f]"))) {
            lastNumber.insert(0, currentInput.charAt(currentInput.length() - 1));
            currentInput = currentInput.substring(0, currentInput.length() - 1);
        }
        return new Pair<>(currentInput, lastNumber.toString());
    }

    /**
     * This method initializes the right grid pane with buttons and their actions.
     */
    private void initializeRightGridPane() {
        // Initialize the right grid pane with buttons and their actions
        rightGridPane.getChildren().forEach(node -> {
            if (node instanceof Button button) {
                switch (button.getText()) {
                    case "⇒" -> button.setOnAction(event -> handleSymbolButton(" => "));
                    case "⇔" -> button.setOnAction(event -> handleSymbolButton(" <=> "));
                    default -> button.setOnAction(event -> handleSymbolButton(" " + button.getText() + " "));
                }
            }
        });
    }

    /**
     * This method initializes the right grid pane (tab 2) with buttons and their actions.
     */
    private void initializeRightGridPane2() {
        // Initialize the right grid pane with buttons and their actions
        rightGridPane2.getChildren().forEach(node -> {
            if (node instanceof Button button) {
                switch (button.getText()) {
                    case "<<" -> button.setOnAction(event -> handleSymbolButton(" << "));
                    case ">>" -> button.setOnAction(event -> handleSymbolButton(" >> "));
                    case "AND" -> button.setOnAction(event -> handleSymbolButton(" & "));
                    case "OR" -> button.setOnAction(event -> handleSymbolButton(" | "));
                    case "XOR" -> button.setOnAction(event -> handleSymbolButton(" ^^ "));
                    case "NOT" -> button.setOnAction(event -> handleSymbolButton(" ~ "));
                    case "NAND" -> button.setOnAction(event -> handleSymbolButton(" ~& "));
                    case "NOR" -> button.setOnAction(event -> handleSymbolButton(" ~| "));
                    default -> button.setOnAction(event -> handleSymbolButton(button.getText()));
                }
            }
        });
    }


    /**
     * This method changes the numbers in the calculator to the specified base.
     * It extracts the numbers from the current input and replaces them with their equivalent in the specified base.
     * It also handles invalid number formats.
     * The method uses the getRadixFromBase method to convert the numbers to the specified base.
     */
    public void changeNumbersToBase() {
        // Change the numbers in the calculator to the specified base
        String currentInput = inputLabel.getText();
        List<String> numbers = new ArrayList<>();
        StringBuilder number = new StringBuilder();
        // Extract numbers from the current input
        for (int i = 0; i < currentInput.length(); i++) {
            char c = currentInput.charAt(i);
            if (Character.isDigit(c)) {
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

    /**
     * From a given string with numbers and letter, add the base in front of numbers and leave the operator as
     * they are. Use pattern matching to detected '_operator' (_ is a space otherwise for base 32 we have AND can be a number)
     * from the list of operators:
     * {"AND", "OR", "NOT", "XOR", "NOR", "NAND"};
     * @param input the string to parse to change the base.
     * @param base the base as integer.
     * @return the new string with (hopefully) numbers with the base in front and operators untouched.
     */
    private String formatNumbersWithBase(String input, int base) {
        if (base == 10){
            return inputLabel.getText();
        }

        String baseStr;
        switch (currBase) {
            case "BIN" -> baseStr = "2b";
            case "OCT" -> baseStr = "8b";
            case "DEC" -> baseStr = "";
            case "HEX" -> baseStr = "16b";
            default -> {
                // Handle invalid base
                outputLabel.setText(BASE_ERROR);
                return inputLabel.getText();
            }
        }
        // Check the base is between 2 and 32.
        if (base < 2 || base > 32) {
            throw new IllegalArgumentException("Base must be between 2 and 32.");
        }

        // List of operators to not translate into number.
        String[] operators = {"AND", "OR", "NOT", "XOR", "NOR", "NAND"};

        // Regex to match operators.
        // To remove the space before the operator matching, remove \\b from "\\b(".
        String operatorRegex = "\\b(" + String.join("|", operators) + ")";

        // Regex to match everything else.
        String numberRegex = "[a-zA-Z0-9]+";

        // Compile patterns.
        Pattern operatorPattern = Pattern.compile(operatorRegex, Pattern.CASE_INSENSITIVE);
        Pattern numberPattern = Pattern.compile(numberRegex);

        // Initialize the matcher/parser and the buffer.
        Matcher matcher = numberPattern.matcher(input);
        StringBuilder result = new StringBuilder();

        // for each pattern we match.
        while (matcher.find()) {
            String word = matcher.group();

            // Check for operator
            Matcher opMatcher = operatorPattern.matcher(word);
            if (opMatcher.find()) {
                matcher.appendReplacement(result, word); // leave operator
            } else {
                matcher.appendReplacement(result, baseStr + word); // add base in front of number
            }
        }

        matcher.appendTail(result);

        return result.toString();
    }

    private String addBaseToNumbers() {
        String currentInput = inputLabel.getText();
        int baseInt;
        switch (currBase) {
            case "BIN" -> baseInt = 2;
            case "OCT" -> baseInt = 8;
            case "DEC" -> baseInt = 10;
            case "HEX" -> baseInt = 16;
            default -> {
                // Handle invalid base
                outputLabel.setText(BASE_ERROR);
                return currentInput;
            }
        }
        return formatNumbersWithBase(inputLabel.getText(), baseInt);
    }

    @Override
    public void handleEqualButton() {
        String currentInput = addBaseToNumbers();
        if (currentInput.isEmpty()) {
            outputLabel.setText("");
            return;
        }
        try {
            Expression e = MyExpressionParser.parseExpression(currentInput);
            String result = calculator.eval(e);
            outputLabel.setText(String.valueOf(result));
        } catch (IllegalSyntax _) {
            outputLabel.setText("SYNTAX ERROR");
        } catch (ExecutionControl.NotImplementedException e) {
            outputLabel.setText("CALCULATOR ERROR");
        }
        catch (UnsupportedOperationException e) {
            outputLabel.setText("Bitwise operations only support binary numbers");
        } catch (IllegalArgumentException e) {
            outputLabel.setText(e.toString());
        }
    }

    /**
     * This method gets the radix (base) from the specified base string.
     * It uses a switch statement to determine the radix based on the base string.
     * @param prevBase The base string (e.g., "BIN", "OCT", "DEC", "HEX") that was previously set
     * @return The radix (base) as an integer
     */
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

    /**
     * This method handles the base change logic.
     * It updates the calculator to the selected base and disables buttons that are not valid for the selected base.
     * It also calls the changeNumbersToBase method to update the numbers in the calculator.
     * It uses a switch statement to determine the base and updates the buttons accordingly.
     * @see #changeNumbersToBase()
     */
    public void handleBaseChange() {
        // Handle the base change logic here
        String regex;
        switch (currBase){
            case "BIN" -> regex = "[01%]";
            case "OCT" -> regex = "[0-7%]";
            case "DEC" -> regex = "[\\d%]";
            case "HEX" -> regex = "[0-9A-Fa-f%]";
            default -> regex = "";
        }
        if (regex.isEmpty()) {outputLabel.setText(BASE_ERROR);}
        else {
            final String finalRegex = regex;
            leftGridPane.getChildren().forEach(node -> {
                if (node instanceof Button button) {
                    button.setDisable(!button.getText().matches(finalRegex));
                }
            });
        }
        changeNumbersToBase();
    }


    /**
     * This method is called when the controller is initialized.
     * It initializes the base and shift settings and sets their actions.
     * It also initializes the left, center, and right grid panes.
     * @see #initializeLeftGridPane()
     * @see #initializeCenterGridPane()
     * @see #initializeRightGridPane()
     */
    @Override
    public void initialize() {
        // Initialize the base setting choice box
        baseSetting.setItems(baseTypes);
        baseSetting.setValue(baseTypes.get(2));
        baseSetting.setOnAction(_ -> {
            currBase = baseSetting.getValue();
            if (!prevBase.equals(currBase)) {
                handleBaseChange();
                prevBase = currBase;
            }
        });
        handleBaseChange();

        initializeLeftGridPane();
        initializeCenterGridPane();
        initializeRightGridPane();
        initializeRightGridPane2();

    }

    /**
     * This method returns the previous base as a string ("BIN", "OCT", "DEC", "HEX").
     * @return The previous base as a String
     */
    public String getPrevBase() {
        return prevBase;
    }

    /**
     * This method sets the previous base to the specified value.
     * Inputs are not verified because the choices are limited to the choice box.
     * Unknown values will be handled in other methods.
     * @param prevBase The previous base to set ("BIN", "OCT", "DEC", "HEX")
     */
    public void setPrevBase(String prevBase) {
        this.prevBase = prevBase;
    }

    /**
     * This method returns the current base as a string ("BIN", "OCT", "DEC", "HEX").
     * @return The current base as a String
     */
    public String getCurrBase() {
        return currBase;
    }

    /**
     * This method sets the current base to the specified value.
     * Inputs are not verified because the choices are limited to the choice box.
     * Unknown values will be handled in other methods.
     * @param currBase The current base to set ("BIN", "OCT", "DEC", "HEX")
     */
    public void setCurrBase(String currBase) {
        this.currBase = currBase;
    }

}

package frontend.desktop.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.util.Pair;

import java.util.Random;

public class ScientificCalculatorController extends StandardCalculatorController {
    /**
     * This class is the controller for the scientific calculator.
     * It extends the StandardCalculatorController class and adds additional functionality for scientific calculations.
     * It handles the user interface and the logic for the scientific calculator interface.
     */

    @FXML
    public GridPane firstTab;

    @FXML
    public GridPane secondTab;

    @FXML
    public GridPane thirdTab;

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
    public Button complexButton;


    /**
     * This method pops the last number from the input label.
     * It removes the last number from the input label and returns it as a string.
     * "Numbers" also include the symbols ",", "I", "P", and "e" for PI and Euler's number.
     * @return a Pair containing the current input minus the last number and the last number
     */
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

    /**
     * This method handles the inverse button click for the calculator.
     * It adds the symbol "1/" to the input label before the last number.
     * It is used to calculate the inverse of a number.
     */
    public void handleInverseButton() {
        Pair<String, String> result = popLastNumber();
        String currentInput = result.getKey();
        String lastNumber = result.getValue();
        inputLabel.setText(currentInput + "1/" + lastNumber);
    }

    /**
     * This method handles the angle conversion button click for the calculator.
     * It adds the symbol "rad(" or "deg(" to the input label before the last number.
     * It is used to convert angles between radians and degrees.
     * @param conversionType the type of conversion (to rad or to deg)
     */
    public void handleConvertButton(String conversionType) {
        Pair<String, String> result = popLastNumber();
        String currentInput = result.getKey();
        String lastNumber = result.getValue();
        if (!lastNumber.isEmpty()) {
            if ("to rad".equals(conversionType)) {
                inputLabel.setText(currentInput + "rad(" + lastNumber + ")");
            }
            else if ("to deg".equals(conversionType)) {
                inputLabel.setText(currentInput + "deg(" + lastNumber + ")");
            }
        }
        else {
            if ("to rad".equals(conversionType)) {
                inputLabel.setText(currentInput + "rad(");
            }
            else if ("to deg".equals(conversionType)) {
                inputLabel.setText(currentInput + "deg(");
            }
        }
    }

    /**
     * This method handles EXP buttons for the calculator.
     * It sets the last number to the exponent of the current input.
     * Ex: If the current input is "2" and the last number is "3", it will set the input to "2^3".
     * @param x the exponent to be set
     * @see #handleExpButton(String)
     */
    public void handleXExpButton(String x) {
        Pair<String, String> result = popLastNumber();
        String currentInput = result.getKey();
        String lastNumber = result.getValue();
        inputLabel.setText(currentInput + x);
        handleExpButton(lastNumber);
    }

    /**
     * This method handles the generation of random integers.
     * @param upperBound the upper bound for the random integer generation.
     */
    void handleIntegerGeneration(String upperBound) {
        String currentInput = inputLabel.getText();
        String randInt = "rInteger(" + upperBound + ")";
        if (currentInput.isEmpty()) {
            inputLabel.setText(randInt);
        } else {
            inputLabel.setText(currentInput + randInt);
        }
    }

    /**
     * This method handles the generation of random rational numbers.
     * @param upperBound the upper bound for the random rational generation.
     */
    void handleRationalGeneration(String upperBound) {
        String currentInput = inputLabel.getText();
        String randRational = "rRational(" + upperBound + ")";
        if (currentInput.isEmpty()) {
            inputLabel.setText(randRational);
        } else {
            inputLabel.setText(currentInput + randRational);
        }
    }

    /**
     * This method handles the generation of random real numbers.
     */
    void handleRealGeneration() {
        String currentInput = inputLabel.getText();
        String randReal = "rReal(" + new Random().nextInt(1, 3000) + ")";     //NOSONAR
        if (currentInput.isEmpty()) {
            inputLabel.setText(randReal);
        } else {
            inputLabel.setText(currentInput + randReal);
        }
    }

    /**
     * This method handles the generation of random complex numbers.
     */
    void handleComplexGeneration() {
        String currentInput = inputLabel.getText();
        String randComplex = "rComplex(" + new Random().nextInt(1, 3000) + ")";     //NOSONAR
        if (currentInput.isEmpty()) {
            inputLabel.setText(randComplex);
        } else {
            inputLabel.setText(currentInput + randComplex);
        }
    }

    /**
     * This method initializes the right grid pane with buttons and their actions.
     */
    private void initializeRightGridPane() {
        rightGridPane.getChildren().forEach(node -> {
            if (node instanceof Button button) {
                switch (button.getText()) {
                    case "(", ")", "e" -> button.setOnAction(event -> handleSymbolButton(button.getText()));
                    case "π" -> button.setOnAction(event -> handlePiButton());
                    case "log" -> button.setOnAction(event -> handleSymbolButton("log("));
                    case "1/x" -> button.setOnAction(event -> handleInverseButton());
                    case "ln" -> button.setOnAction(event -> handleSymbolButton("ln("));
                    case "log2" -> button.setOnAction(event -> handleSymbolButton("log(2,"));
                    case "mod" -> button.setOnAction(event -> handleSymbolButton("mod("));
                    case "," -> button.setOnAction(event -> handleSymbolButton(","));
                    default -> button.setOnAction(event -> handleSymbolButton(""));
                }
            }
        });
    }

    /**
     * This method initializes the first tab with buttons and their actions.
     */
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


    /**
     * This method initializes the second tab with buttons and their actions.
     */
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

    /**
     * This method initializes the third tab with buttons and their actions.
     */
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

    /**
     * This method initializes the fourth tab with buttons and their actions.
     */
    private void initializeFourthTab() {
        handSpinner.setPromptText("Bound");
        handSpinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 100, 1));
        integerButton.setOnAction(event -> handleIntegerGeneration(handSpinner.getValue().toString()));
        rationalSpinner.setPromptText("Bound");
        rationalSpinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 100, 1));
        rationalButton.setOnAction(event -> handleRationalGeneration(rationalSpinner.getValue().toString()));
        realButton.setOnAction(event -> handleRealGeneration());
        complexButton.setOnAction(event -> handleComplexGeneration());
    }

    /**
     * This method initializes the convert box with buttons and their actions.
     */
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

    /**
     * This method initializes the angle setting choice box.
     * It sets the default value to "DEG" and adds a listener to change the radian mode.
     * It also initializes the left, center, and right grid panes as well as the four tabs.
     * @see #initializeLeftGridPane()
     * @see #initializeCenterGridPane()
     * @see #initializeRightGridPane()
     * @see #initializeFirstTab()
     * @see #initializeSecondTab()
     * @see #initializeThirdTab()
     * @see #initializeFourthTab()
     * @see #initializeConvertBox()
     */
    @Override
    public void initialize() {
        initializeLeftGridPane();
        initializeCenterGridPane();
        initializeRightGridPane();
        initializeFirstTab();
        initializeSecondTab();
        initializeThirdTab();
        initializeFourthTab();
        initializeConvertBox();
    }
}

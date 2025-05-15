package frontend.desktop.controllers;
import calculator.Calculator;
import calculator.expression.Expression;
import helper.IllegalSyntax;
import helper.MyExpressionParser;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import jdk.jshell.spi.ExecutionControl;

public class StandardCalculatorController extends Controller {
    /**
     * This class is the controller for the standard calculator.
     * It handles the user interface and the logic for the calculator interface.
     * It is responsible for managing the buttons, input, and output of the standard calculator.
     * It also handles the events triggered by the user.
     * It uses the Calculator class to perform calculations.
     * It is a subclass of the Controller class.
     */

    @FXML
    public Label inputLabel;

    @FXML
    public Label outputLabel;

    @FXML
    public GridPane leftGridPane;

    @FXML
    public GridPane rightGridPane;

    @FXML
    public GridPane centerGridPane;

    static final Calculator calculator = new Calculator();

    static final String helptext = "Inputs are displayed in the bar above. The calculator will try to solve that expression when the \"=\" button is pressed.";

    /**
     * This method handles the default button clicks for the calculator.
     * It adds the symbol to the input label.
     * @param symbol the symbol to be added to the input label
     */
    public void handleSymbolButton(String symbol) {
        String currentInput = inputLabel.getText();
        inputLabel.setText(currentInput + symbol);
    }

    /**
     * This method handles the delete button click for the calculator.
     * It removes the last character from the input label.
     */
    public void handleDeleteButton() {
        String currentInput = inputLabel.getText();
        if (!currentInput.isEmpty()) {
            inputLabel.setText(currentInput.substring(0, currentInput.length() - 1));
        }
    }

    /**
     * This method handles the clear button click for the calculator.
     * It clears the input and output labels.
     */
    public void handleClearButton() {
        inputLabel.setText("");
        outputLabel.setText("");
    }

    /**
     * This method handles the pi button click for the calculator.
     * It adds the symbol "PI" to the input label.
     */
    public void handlePiButton() {
        String currentInput = inputLabel.getText();
        inputLabel.setText(currentInput + "PI");
    }

    /**
     * This method handles the square root button click for the calculator.
     * It adds the symbol "SQRT(" to the input label with the second parameter if provided, and ",".
     * If the second parameter is empty, it adds "SQRT(" to the input label.
     * @param second the second parameter for the square root function
     */
    public void handleSQRTButton(String second) {
        String currentInput = inputLabel.getText();
        if (!second.isEmpty()) {
            inputLabel.setText(currentInput + "SQRT(" + second + ",");

        } else {
            inputLabel.setText(currentInput + "SQRT(");
        }
    }

    /**
     * This method handles the exponentiation button click for the calculator.
     * It adds the symbol "^" to the input label with the second parameter if provided.
     * If the second parameter is empty, it adds "^" to the input label.
     * @param second the second parameter for the exponentiation function
     */
    public void handleExpButton(String second) {
        String currentInput = inputLabel.getText();
        if (!second.isEmpty()) {
            inputLabel.setText(currentInput + " ^ " + second);

        } else {
            inputLabel.setText(currentInput + " ^ ");
        }
    }

    /**
     * This method handles the equal button click for the calculator.
     * It evaluates the expression in the input label and displays the result in the output label.
     * If there is a syntax error, it displays "SYNTAX ERROR" in the output label.
     * @see Calculator
     */
    public void handleEqualButton() {
        String currentInput = inputLabel.getText();
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
    }

    /**
     * Initializes the left grid pane with button actions.
     * For the standard calculator, it sets the action for each button to handle the symbol button click.
     * This method is called in the initialize() method.
     * @see #initialize()
     * @see #handleSymbolButton(String)
     */
    void initializeLeftGridPane() {
        leftGridPane.getChildren().forEach(node -> {
            if (node instanceof Button button) {
                button.setOnAction(event -> handleSymbolButton(button.getText()));
            }
        });
    }

    /**
     * Initializes the center grid pane with corresponding button actions.
     * This method is called in the initialize() method.
     * @see #initialize()
     * @see #handleSymbolButton(String)
     * @see #handleDeleteButton()
     * @see #handleClearButton()
     * @see #handleEqualButton()
     */
    void initializeCenterGridPane() {
        centerGridPane.getChildren().forEach(node -> {
            if (node instanceof Button button) {
                switch (button.getText()) {
                    case "DEL" -> button.setOnAction(event -> handleDeleteButton());
                    case "Reset" -> button.setOnAction(event -> handleClearButton());
                    case "×" -> button.setOnAction(event -> handleSymbolButton(" * "));
                    case "÷" -> button.setOnAction(event -> handleSymbolButton(" / "));
                    case "+" -> button.setOnAction(event -> handleSymbolButton(" + "));
                    case "−" -> button.setOnAction(event -> handleSymbolButton(" - "));
                    case "=" -> button.setOnAction(event -> handleEqualButton());
                    case "Help" -> button.setOnAction(event -> outputLabel.setText(helptext));
                    default -> button.setOnAction(event -> handleSymbolButton(""));
                }
            }
        });}

    /**
     * This method is called when the controller is initialized.
     * It initializes the buttons and sets their actions.
     * @see #initializeLeftGridPane()
     * @see #initializeCenterGridPane()
     * @see #handleExpButton(String)
     * @see #handleSQRTButton(String)
     */
    @Override
    public void initialize() {
        // Initialize buttons and set their actions
        initializeLeftGridPane();

        initializeCenterGridPane();

        rightGridPane.getChildren().forEach(node -> {
            if (node instanceof Button button) {
                switch (button.getText()) {
                    case "(", ")" -> button.setOnAction(event -> handleSymbolButton(button.getText()));
                    case "π" -> button.setOnAction(event -> handlePiButton());
                    case "x²" -> button.setOnAction(event -> handleExpButton("2"));
                    case "xʸ" -> button.setOnAction(event -> handleExpButton(""));
                    case "²√x" -> button.setOnAction(event -> handleSQRTButton("2"));
                    case "ʸ√x" -> button.setOnAction(event -> handleSQRTButton(""));
                    case "%" -> button.setOnAction(event -> handleSymbolButton("%"));
                    default -> button.setOnAction(event -> handleSymbolButton(""));
                }
            }
        });
    }
}

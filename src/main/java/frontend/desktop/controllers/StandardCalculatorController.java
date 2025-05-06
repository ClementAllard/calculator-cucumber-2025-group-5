package frontend.desktop.controllers;
import calculator.Calculator;
import calculator.expression.Expression;
import helper.IllegalSyntax;
import helper.MyExpressionParser;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class StandardCalculatorController extends Controller {

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

    private static final Calculator calculator = new Calculator();

    void handleSymbolButton(String symbol) {
        String currentInput = inputLabel.getText();
        inputLabel.setText(currentInput + symbol);
    }

    void handleDeleteButton() {
        String currentInput = inputLabel.getText();
        if (!currentInput.isEmpty()) {
            inputLabel.setText(currentInput.substring(0, currentInput.length() - 1));
        }
    }

    void handleClearButton() {
        inputLabel.setText("");
        outputLabel.setText("");
    }

    void handlePiButton() {
        String currentInput = inputLabel.getText();
        inputLabel.setText(currentInput + "PI");
    }

    void handleSQRTButton(String second) {
        String currentInput = inputLabel.getText();
        if (!second.isEmpty()) {
            inputLabel.setText(currentInput + "SQRT(" + second + ",");

        } else {
            inputLabel.setText(currentInput + "SQRT(");
        }
    }

    void handleExpButton(String second) {
        String currentInput = inputLabel.getText();
        if (!second.isEmpty()) {
            inputLabel.setText(currentInput + "^" + second);

        } else {
            inputLabel.setText(currentInput + "^");
        }
    }

    void handleEqualButton() {
        String currentInput = inputLabel.getText();
        try {
            Expression e = MyExpressionParser.parseExpression(currentInput);
            Number result = calculator.eval(e);
            outputLabel.setText(String.valueOf(result));
        } catch (IllegalSyntax _) {
            outputLabel.setText("SYNTAX ERROR");
        }
    }

    @Override
    void initialize() {
        // Initialize buttons and set their actions
        leftGridPane.getChildren().forEach(node -> {
            if (node instanceof Button button) {
                button.setOnAction(event -> handleSymbolButton(button.getText()));
            }
        });

        centerGridPane.getChildren().forEach(node -> {
            if (node instanceof Button button) {
                switch (button.getText()) {
                    case "DEL" -> button.setOnAction(event -> handleDeleteButton());
                    case "Reset" -> button.setOnAction(event -> handleClearButton());
                    case "×" -> button.setOnAction(event -> handleSymbolButton("*"));
                    case "÷" -> button.setOnAction(event -> handleSymbolButton("/"));
                    case "+" -> button.setOnAction(event -> handleSymbolButton("+"));
                    case "-" -> button.setOnAction(event -> handleSymbolButton("-"));
                    case "=" -> button.setOnAction(event -> handleEqualButton());
                    default -> button.setOnAction(event -> handleSymbolButton(""));
                }
            }
        });

        rightGridPane.getChildren().forEach(node -> {
            if (node instanceof Button button) {
                switch (button.getText()) {
                    case "π" -> button.setOnAction(event -> handlePiButton());
                    case "x²" -> button.setOnAction(event -> handleExpButton("2"));
                    case "xʸ" -> button.setOnAction(event -> handleExpButton(""));
                    case "²√x" -> button.setOnAction(event -> handleSQRTButton("2"));
                    case "ʸ√x" -> button.setOnAction(event -> handleSQRTButton(""));
                    default -> button.setOnAction(event -> handleSymbolButton(""));
                }
            }
        });
    }
}

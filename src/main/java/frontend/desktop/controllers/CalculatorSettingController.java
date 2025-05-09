package frontend.desktop.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

import java.util.Objects;

public class CalculatorSettingController extends Controller {

    @FXML
    MenuButton calculatorTypeMenuButton;

    @FXML
    Label calculatorTypeLabel;

    @FXML
    public ChoiceBox<String> operationOrderSetting;

    private String OPERATION_ORDER = "INFIX";

    /*
        * This method is called when the user selects a menu item from the calculator type menu button.
     */
    private void handleMenuItemSelection(MenuItem item) {
        if (item != null) {
            String selectedType = item.getText();
            switch (selectedType) {
                case "Standard":
                    // Load Standard Calculator
                    if (Objects.equals(calculatorMainController.getCurrentView(), "StandardCalculator")) {
                        break;
                    } else {
                        calculatorTypeLabel.setText("Standard");
                        calculatorMainController.showMe( "StandardCalculator");
                    }
                    break;
                case "Scientific":
                    // Load Scientific Calculator
                    if (Objects.equals(calculatorMainController.getCurrentView(), "ScientificCalculator")) {
                        break;
                    } else {
                        calculatorTypeLabel.setText("Scientific");
                        calculatorMainController.showMe( "ScientificCalculator");
                    }
                    break;
                case "Programmer":
                    // Load Programmer Calculator
                    if (Objects.equals(calculatorMainController.getCurrentView(), "ProgrammerCalculator")) {
                        break;
                    } else {
                        calculatorTypeLabel.setText("Programmer");
                        calculatorMainController.showMe( "ProgrammerCalculator");
                    }
                    break;
                default:
                    break;
            }
        }
    }

    /**
     * Sets the handler for the menu items in the calculator type menu button.
     */
    private void handleTypeSelection() {
        for (MenuItem item : calculatorTypeMenuButton.getItems()) {
            item.setOnAction(event -> handleMenuItemSelection(item));
        }
    }

    private void initializeOperationOrderSetting() {
        operationOrderSetting.getItems().addAll("INFIX", "POSTFIX", "PREFIX");
        operationOrderSetting.setValue("INFIX");
        operationOrderSetting.setOnAction(_ -> setOPERATION_ORDER(operationOrderSetting.getValue()));
    }

    @Override
    void initialize() {
        handleTypeSelection();
        initializeOperationOrderSetting();
    }

    public String getOPERATION_ORDER() {
        return OPERATION_ORDER;
    }

    public void setOPERATION_ORDER(String OPERATION_ORDER) {
        this.OPERATION_ORDER = OPERATION_ORDER;
    }
}


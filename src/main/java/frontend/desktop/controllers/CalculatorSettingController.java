package frontend.desktop.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;


import java.util.Objects;

public class CalculatorSettingController extends Controller {
    /**
     * Class responsible for managing the calculator settings.
     * It allows the user to select the type of calculator (Standard, Scientific, Programmer)
     * and the order of operations (Infix, Postfix, Prefix).
     */

    @FXML
    public MenuButton calculatorTypeMenuButton;

    @FXML
    public Label calculatorTypeLabel;


    /**
     * This method is called when the user selects a menu item from the calculator type menu button.
     * @param item the selected menu item (Standard, Scientific, Programmer)
     */
    public void handleMenuItemSelection(MenuItem item) {
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

    /**
     * Initializes the calculator settings controller.
     * This method is called when the controller is loaded.
     */
    @Override
    public void initialize() {
        handleTypeSelection();
    }

    /**
     * Gets the current calculator type.
     * @return the current calculator type (Standard, Scientific, Programmer)
     */
    public String getCalculatorType() {
        return calculatorTypeLabel.getText();
    }
}


package desktopInterface;
import frontend.desktop.controllers.StandardCalculatorController;


import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(ApplicationExtension.class)
class StandardCalculatorControllerTest {

    private AnchorPane calculator;
    private StandardCalculatorController standardCalculatorController;

    @Start
    private void start(Stage stage) {
        FXMLLoader loader = new FXMLLoader();
        try {
            loader.setLocation(StandardCalculatorController.class.getResource("/desktopScenes/StandardCalculator.fxml"));
            calculator = loader.load();
            standardCalculatorController = loader.getController();
        } catch (IOException _) {
            fail();
        }
        stage.setScene(new javafx.scene.Scene(calculator));
    }

    @Test
    void testHandleSymbolButton() {
        standardCalculatorController.handleSymbolButton("5");
        assertEquals("5", standardCalculatorController.inputLabel.getText());

        standardCalculatorController.handleSymbolButton("+");
        assertEquals("5+", standardCalculatorController.inputLabel.getText());

        standardCalculatorController.handleSymbolButton("3");
        assertEquals("5+3", standardCalculatorController.inputLabel.getText());
    }

    @Test
    void testHandleDeleteButton() {
        standardCalculatorController.inputLabel.setText("5+3");
        standardCalculatorController.handleDeleteButton();
        assertEquals("5+", standardCalculatorController.inputLabel.getText());

        standardCalculatorController.handleDeleteButton();
        assertEquals("5", standardCalculatorController.inputLabel.getText());

        standardCalculatorController.handleDeleteButton();
        assertEquals("", standardCalculatorController.inputLabel.getText());
    }

    @Test
    void testHandleClearButton() {
        standardCalculatorController.inputLabel.setText("5+3");
        standardCalculatorController.outputLabel.setText("8");

        standardCalculatorController.handleClearButton();

        assertEquals("", standardCalculatorController.inputLabel.getText());
        assertEquals("", standardCalculatorController.outputLabel.getText());
    }

    @Test
    void testHandlePiButton() {
        standardCalculatorController.inputLabel.setText("5+");
        standardCalculatorController.handlePiButton();
        assertEquals("5+PI", standardCalculatorController.inputLabel.getText());
    }

    @Test
    void testHandleSQRTButton() {
        standardCalculatorController.inputLabel.setText("5+");
        standardCalculatorController.handleSQRTButton("");
        assertEquals("5+SQRT(", standardCalculatorController.inputLabel.getText());

        standardCalculatorController.inputLabel.setText("5+");
        standardCalculatorController.handleSQRTButton("9");
        assertEquals("5+SQRT(9,", standardCalculatorController.inputLabel.getText());
    }

    @Test
    void testHandleExpButton() {
        standardCalculatorController.inputLabel.setText("5+");
        standardCalculatorController.handleExpButton("");
        assertEquals("5+^", standardCalculatorController.inputLabel.getText());

        standardCalculatorController.inputLabel.setText("5+");
        standardCalculatorController.handleExpButton("3");
        assertEquals("5+^3", standardCalculatorController.inputLabel.getText());
    }

    @Test
    void testHandleDeleteButtonWithEmptyInput() {
        standardCalculatorController.inputLabel.setText("");
        standardCalculatorController.handleDeleteButton();
        assertEquals("", standardCalculatorController.inputLabel.getText());
    }

    @Test
    void testHandleClearButtonWithEmptyInput() {
        standardCalculatorController.inputLabel.setText("");
        standardCalculatorController.outputLabel.setText("");

        standardCalculatorController.handleClearButton();

        assertEquals("", standardCalculatorController.inputLabel.getText());
        assertEquals("", standardCalculatorController.outputLabel.getText());
    }

    @Test
    void testHandleEqualButton() {
        standardCalculatorController.inputLabel.setText("5+3");
        standardCalculatorController.handleEqualButton();
        assertEquals("8", standardCalculatorController.outputLabel.getText());

        standardCalculatorController.inputLabel.setText("5+");
        standardCalculatorController.handleEqualButton();
        assertEquals("SYNTAX ERROR", standardCalculatorController.outputLabel.getText());
    }

}

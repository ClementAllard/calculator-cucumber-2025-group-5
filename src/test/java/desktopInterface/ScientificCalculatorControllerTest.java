package desktopInterface;

import frontend.desktop.controllers.ScientificCalculatorController;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(ApplicationExtension.class)
class ScientificCalculatorControllerTest {

    private AnchorPane calculator;
    private ScientificCalculatorController scientificCalculatorController;

    @Start
    private void start(Stage stage) {
        FXMLLoader loader = new FXMLLoader();
        try {
            loader.setLocation(ScientificCalculatorController.class.getResource("/desktopScenes/ScientificCalculator.fxml"));
            calculator = loader.load();
            scientificCalculatorController = loader.getController();
        } catch (IOException _) {
            fail();
        }
        stage.setScene(new javafx.scene.Scene(calculator));
    }

    @Test
    void testHandleInverseButton() {
        scientificCalculatorController.handleSymbolButton("5");
        assertEquals("5", scientificCalculatorController.inputLabel.getText());

        scientificCalculatorController.handleSymbolButton("1");
        assertEquals("51", scientificCalculatorController.inputLabel.getText());

        scientificCalculatorController.handleInverseButton();
        assertEquals("1/51", scientificCalculatorController.inputLabel.getText());

        scientificCalculatorController.handleInverseButton();
        assertEquals("1/1/51", scientificCalculatorController.inputLabel.getText());

        scientificCalculatorController.inputLabel.setText("");
        scientificCalculatorController.handleInverseButton();
        assertEquals("1/", scientificCalculatorController.inputLabel.getText());

        scientificCalculatorController.inputLabel.setText("");
        scientificCalculatorController.handlePiButton();
        assertEquals("PI", scientificCalculatorController.inputLabel.getText());
        scientificCalculatorController.handleInverseButton();
        assertEquals("1/PI", scientificCalculatorController.inputLabel.getText());

        scientificCalculatorController.inputLabel.setText("");
        scientificCalculatorController.handleSymbolButton("e");
        assertEquals("e", scientificCalculatorController.inputLabel.getText());
        scientificCalculatorController.handleInverseButton();
        assertEquals("1/e", scientificCalculatorController.inputLabel.getText());

        scientificCalculatorController.inputLabel.setText("");
        scientificCalculatorController.handleSymbolButton("3,14");
        assertEquals("3,14", scientificCalculatorController.inputLabel.getText());
        scientificCalculatorController.handleInverseButton();
        assertEquals("1/3,14", scientificCalculatorController.inputLabel.getText());
    }

    @Test
    void testHandleConvertButton() {
        scientificCalculatorController.handleSymbolButton("5");
        assertEquals("5", scientificCalculatorController.inputLabel.getText());

        scientificCalculatorController.handleConvertButton("to rad");
        assertEquals("rad(5)", scientificCalculatorController.inputLabel.getText());

        scientificCalculatorController.inputLabel.setText("");
        scientificCalculatorController.handleSymbolButton("3,14");
        scientificCalculatorController.handleConvertButton("to deg");
        assertEquals("deg(3,14)", scientificCalculatorController.inputLabel.getText());

        scientificCalculatorController.inputLabel.setText("");
        scientificCalculatorController.handleSymbolButton("e");
        scientificCalculatorController.handleConvertButton("to rad");
        assertEquals("rad(e)", scientificCalculatorController.inputLabel.getText());
    }

    @Test
    void testHandleXExpButton() {
        scientificCalculatorController.inputLabel.setText("5+3");
        scientificCalculatorController.handleXExpButton("10");
        assertEquals("5+10^3", scientificCalculatorController.inputLabel.getText());

        scientificCalculatorController.inputLabel.setText("5+3");
        scientificCalculatorController.handleXExpButton("2");
        assertEquals("5+2^3", scientificCalculatorController.inputLabel.getText());

        scientificCalculatorController.inputLabel.setText("5+3");
        scientificCalculatorController.handleXExpButton("e");
        assertEquals("5+e^3", scientificCalculatorController.inputLabel.getText());
    }

}

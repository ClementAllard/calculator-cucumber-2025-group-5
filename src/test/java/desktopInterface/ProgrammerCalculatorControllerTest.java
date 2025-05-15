package desktopInterface;
import frontend.desktop.controllers.ProgrammerCalculatorController;
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
class ProgrammerCalculatorControllerTest {

    private AnchorPane calculator;
    private ProgrammerCalculatorController programmerCalculatorController;

    /**
     * This method is called before each test method in the class.
     * @param stage the stage to be used for the test (used by TestFX)
     */
    @Start
    private void start(Stage stage) {
        FXMLLoader loader = new FXMLLoader();
        try {
            loader.setLocation(ProgrammerCalculatorController.class.getResource("/desktopScenes/ProgrammerCalculator.fxml"));
            calculator = loader.load();
            programmerCalculatorController = loader.getController();
        } catch (IOException _) {
            fail();
        }
        stage.setScene(new javafx.scene.Scene(calculator));
    }

    /**
     * Tests the base setting of the programmer calculator.
     */
    @Test
    void testHandleBaseSetting() {
        programmerCalculatorController.baseSetting.setValue("BIN");
        assertEquals("BIN", programmerCalculatorController.baseSetting.getValue());

        programmerCalculatorController.baseSetting.setValue("OCT");
        assertEquals("OCT", programmerCalculatorController.baseSetting.getValue());

        programmerCalculatorController.baseSetting.setValue("DEC");
        assertEquals("DEC", programmerCalculatorController.baseSetting.getValue());

        programmerCalculatorController.baseSetting.setValue("HEX");
        assertEquals("HEX", programmerCalculatorController.baseSetting.getValue());
    }

    /**
     * Tests the shift setting of the programmer calculator.
     */
    @Test
    void testHandleShiftSetting() {
        programmerCalculatorController.shiftSetting.setValue("Arithmetic");
        assertEquals("Arithmetic", programmerCalculatorController.shiftSetting.getValue());

        programmerCalculatorController.shiftSetting.setValue("Logical");
        assertEquals("Logical", programmerCalculatorController.shiftSetting.getValue());

        programmerCalculatorController.shiftSetting.setValue("Rotate");
        assertEquals("Rotate", programmerCalculatorController.shiftSetting.getValue());

        programmerCalculatorController.shiftSetting.setValue("Rotate through carry");
        assertEquals("Rotate through carry", programmerCalculatorController.shiftSetting.getValue());
    }

    /**
     * Tests the handling of the base change in the programmer calculator.
     * @see #programmerCalculatorController
     */
    @Test
    void testHandleBaseChange() {
        programmerCalculatorController.handleSymbolButton("17");
        assertEquals("17", programmerCalculatorController.inputLabel.getText());

        programmerCalculatorController.baseSetting.setValue("BIN");
        assertEquals("BIN", programmerCalculatorController.baseSetting.getValue());
        assertEquals("BIN", programmerCalculatorController.getCurrBase());
        assertEquals("10001", programmerCalculatorController.inputLabel.getText());
        assertEquals("BIN", programmerCalculatorController.getPrevBase());

        programmerCalculatorController.baseSetting.setValue("OCT");
        assertEquals("OCT", programmerCalculatorController.baseSetting.getValue());
        assertEquals("OCT", programmerCalculatorController.getCurrBase());
        assertEquals("21", programmerCalculatorController.inputLabel.getText());
        assertEquals("OCT", programmerCalculatorController.getPrevBase());

        programmerCalculatorController.baseSetting.setValue("DEC");
        assertEquals("DEC", programmerCalculatorController.baseSetting.getValue());
        assertEquals("DEC", programmerCalculatorController.getCurrBase());
        assertEquals("17", programmerCalculatorController.inputLabel.getText());
        assertEquals("DEC", programmerCalculatorController.getPrevBase());

        programmerCalculatorController.baseSetting.setValue("HEX");
        assertEquals("HEX", programmerCalculatorController.baseSetting.getValue());
        assertEquals("HEX", programmerCalculatorController.getCurrBase());
        assertEquals("11", programmerCalculatorController.inputLabel.getText());
        assertEquals("HEX", programmerCalculatorController.getPrevBase());
    }
}

package frontend.desktop;

import frontend.desktop.controllers.CalculatorMainController;
import javafx.application.Application;
import javafx.stage.Stage;


public class DesktopInterface extends Application {
    /**
     * This class is the main entry point for the JavaFX application.
     */
    private CalculatorMainController calculatorMainController;

    public static void main(String[] args) {
        launch(args);
    }

    /**
     * This method is the entry point of the JavaFX application.
     * @param primaryStage the primary stage for this application, onto which the application scene can be set.
     */
    @Override
    public void start(Stage primaryStage) {
        calculatorMainController = new CalculatorMainController(primaryStage);
    }

    /**
     * This method returns the calculatorMainController instance.
     * @return the calculatorMainController instance.
     */
    public CalculatorMainController getCalculatorMainController() {
        return calculatorMainController;
    }
}

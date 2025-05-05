package frontend.desktop;

import frontend.desktop.controllers.CalculatorMainController;
import javafx.application.Application;
import javafx.stage.Stage;


public class DesktopInterface extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        new CalculatorMainController(primaryStage);
    }
}

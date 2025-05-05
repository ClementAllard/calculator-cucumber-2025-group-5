package frontend.desktop.controllers;

import frontend.desktop.DesktopInterface;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * DISCLAIMER: code written by the author in a previous project was used as a reference for this code.
 * (Author: Simon MICHEL)
 */
public class CalculatorMainController {
    // This class is the main controller for the calculator application.
    // It is responsible for initializing the application and managing the main view.
    // It will also handle the navigation between different calculator modes (Standard, Scientific, Programmer).

    private static final String TITLE = "Calculator";
    private BorderPane calculator;
    private CalculatorSettingController calculatorSettingController;
    private final Stage primaryStage;

    private final Map<String, Controller> controllers = new HashMap<>();

    private String currentView;
    public CalculatorMainController(Stage primaryStage) {
        this.primaryStage = primaryStage;
        primaryStage.setTitle(TITLE);
        initCalculator();
        showStandardCalculator();

    }

    /**
     * This method initializes the calculator application.
     */
    public void initCalculator() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(DesktopInterface.class.getResource("/desktopScenes/Calculator.fxml"));
            calculator = loader.load();
            StackPane basePane = new StackPane();
            basePane.getChildren().add(calculator);
            Scene scene = new Scene(basePane);
            primaryStage.setScene(scene);
            primaryStage.show();

            // Initialize the calculatorSettingController
            calculatorSettingController = loader.getController();
            calculatorSettingController.setCalculatorMainController(this);
            calculatorSettingController.handleTypeSelection();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showMe(String name) {
        // This method is used to show a specific view in the calculator application.
        // It will load the view from the specified path and set it as the main view.
        try {
            AnchorPane anchorPane;
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(DesktopInterface.class.getResource("/desktopScenes/" + name + ".fxml"));
            anchorPane = loader.load();
            calculator.setCenter(anchorPane);
            Controller controller = loader.getController();
            controller.setCalculatorMainController(this);
            controllers.put(name, controller);
            currentView = name;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Settings

    public void showStandardCalculator() {
        // This method is used to show the standard calculator view.
        // It will load the view from the specified path and set it as the main view.
        showMe("StandardCalculator");
    }

    public void showScientificCalculator() {
        // This method is used to show the scientific calculator view.
        // It will load the view from the specified path and set it as the main view.
        showMe("ScientificCalculator");
    }

    public void showProgrammerCalculator() {
        // This method is used to show the programmer calculator view.
        // It will load the view from the specified path and set it as the main view.
        showMe("ProgrammerCalculator");
    }

    public String getCurrentView() {
        return currentView;
    }
}

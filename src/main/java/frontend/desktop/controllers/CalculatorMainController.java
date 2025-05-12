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
    /**
     * This class is the main controller for the calculator application.
     * It initializes the calculator and manages the different views (Standard, Scientific, Programmer).
     */

    private static final String TITLE = "Calculator";
    private BorderPane calculator;
    private CalculatorSettingController calculatorSettingController;
    private final Stage primaryStage;

    private final Map<String, Controller> controllers = new HashMap<>();

    private String currentView;

    /**
     * Constructor for the CalculatorMainController.
     *
     * @param primaryStage The primary stage for this application.
     */
    public CalculatorMainController(Stage primaryStage) {
        this.primaryStage = primaryStage;
        primaryStage.setTitle(TITLE);
        initCalculator();
        showStandardCalculator();

    }

    /**
     * This method initializes the calculator application.
     * It loads the calculator settings view and sets up the primary stage.
     * It also initializes the calculatorSettingController and sets it up.
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
            calculatorSettingController.initialize();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is used to show a specific view in the calculator application.
     * It will load the view from the specified path and set it as the main view.
     *
     * @param name The name of the view to be shown.
     */
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
            controller.initialize();
            controllers.put(name, controller);
            currentView = name;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Settings

    /**
     * This method is used to show the Standard calculator view.
     * @see #showMe(String)
     */
    public void showStandardCalculator() {
        // This method is used to show the standard calculator view.
        // It will load the view from the specified path and set it as the main view.
        showMe("StandardCalculator");
    }

    /**
     * This method is used to show the Scientific calculator view.
     * @see #showMe(String)
     */
    public void showScientificCalculator() {
        // This method is used to show the scientific calculator view.
        // It will load the view from the specified path and set it as the main view.
        showMe("ScientificCalculator");
    }

    /**
     * This method is used to show the Programmer calculator view.
     * @see #showMe(String)
     */
    public void showProgrammerCalculator() {
        // This method is used to show the programmer calculator view.
        // It will load the view from the specified path and set it as the main view.
        showMe("ProgrammerCalculator");
    }

    /**
     * This method is used to get the current view of the calculator application.
     */
    public String getCurrentView() {
        return currentView;
    }

    /**
     * This method is used to get the settings controller of the calculator application.
     */
    public CalculatorSettingController getCalculatorSettingController() {
        return calculatorSettingController;
    }
}

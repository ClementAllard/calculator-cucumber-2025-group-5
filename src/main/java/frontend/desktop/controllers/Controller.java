package frontend.desktop.controllers;

public abstract class Controller {
    /**
     * This class is the base controller for the calculator application.
     * It is abstract and should be extended by other controllers.
     */
    protected CalculatorMainController calculatorMainController;

    /**
     * This method is used to set the calculator main controller.
     * @param calculatorMainController the calculator main controller to set
     */
    public void setCalculatorMainController(CalculatorMainController calculatorMainController) {
        this.calculatorMainController = calculatorMainController;
    }
    /**
     * This method is used to get the calculator main controller.
     * @return the calculator main controller
     */
    public CalculatorMainController getCalculatorMainController() {
        return calculatorMainController;
    }

    /**
     * This method is used to initialize the controller.
     * It should be overridden by subclasses to provide specific initialization logic.
     */
    public abstract void initialize();
}

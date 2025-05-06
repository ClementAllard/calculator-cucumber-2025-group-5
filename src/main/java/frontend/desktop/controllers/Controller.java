package frontend.desktop.controllers;

public abstract class Controller {
    protected CalculatorMainController calculatorMainController;

    public void setCalculatorMainController(CalculatorMainController calculatorMainController) {
        this.calculatorMainController = calculatorMainController;
    }

    /*
        * This method is used to initialize the controller.
        * It should be overridden by subclasses to provide specific initialization logic.
     */
    abstract void initialize();
}

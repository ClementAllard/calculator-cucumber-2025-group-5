package frontend.desktop.controllers;

public abstract class Controller {
    protected CalculatorMainController calculatorMainController;

    public void setCalculatorMainController(CalculatorMainController calculatorMainController) {
        this.calculatorMainController = calculatorMainController;
    }
}

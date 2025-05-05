module calculator.cucumber {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires org.antlr.antlr4.runtime;

    exports frontend.desktop to javafx.graphics;
    exports frontend.desktop.controllers to javafx.fxml;
    opens frontend.desktop.controllers to javafx.fxml;
}

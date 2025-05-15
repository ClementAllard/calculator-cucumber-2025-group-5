module calculator.cucumber {
    requires javafx.base;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires org.antlr.antlr4.runtime;
    requires jdk.jshell;

    exports frontend.desktop to javafx.graphics;
    exports frontend.desktop.controllers to javafx.fxml;
    opens frontend.desktop.controllers to javafx.fxml;
}

module ru.mono.lab9 {
    requires javafx.controls;
    requires javafx.fxml;
    requires atlantafx.base;


    opens ru.mono.lab9 to javafx.fxml;
    exports ru.mono.lab9;
}
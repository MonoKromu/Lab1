package ru.mono.lab9;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ThrowerController {
    @FXML
    private Button button;
    @FXML
    private TextField leftField;
    @FXML
    private TextField rightField;

    @FXML
    protected void throwText() {
        button.setRotate(button.getRotate()+180);
        String temp = leftField.getText();
        leftField.setText(rightField.getText());
        rightField.setText(temp);
    }

}
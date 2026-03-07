package ru.mono.lab9;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController {
    @FXML
    protected void open(ActionEvent e) throws IOException {
        Button srs = (Button)e.getSource();
        String progName = (String)srs.getUserData();
        Stage stage = (Stage) ((javafx.scene.Node) e.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource(progName));
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.setMinWidth(stage.getWidth());
        stage.setMinHeight(stage.getHeight());
    }
}

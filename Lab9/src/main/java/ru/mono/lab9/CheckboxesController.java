package ru.mono.lab9;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Slider;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.ImageView;

public class CheckboxesController {
    @FXML
    private CheckBox imageCheck;
    @FXML
    private CheckBox sliderCheck;
    @FXML
    private CheckBox toggleCheck;

    @FXML
    private ImageView image;
    @FXML
    private Slider slider;
    @FXML
    private ToggleButton toggle;

    @FXML
    protected void onCheckImage(){
        image.setVisible(imageCheck.isSelected());
    }
    @FXML
    protected void onCheckSlider(){
        slider.setVisible(sliderCheck.isSelected());
    }
    @FXML
    protected void onCheckToggle(){
        toggle.setVisible(toggleCheck.isSelected());
    }

    @FXML
    protected void onToggleButton(){
        toggleCheck.setVisible(toggle.isSelected());
    }
}

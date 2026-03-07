package ru.mono.lab9;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.util.ArrayList;
import java.util.HashMap;

public class RestaurantController {

    @FXML
    TextArea textArea;

    HashMap<Integer, Food> foodTable = new HashMap<>();
    {
        foodTable.put(1,Food.STEAK);
        foodTable.put(2,Food.CAKE);
        foodTable.put(3,Food.PUMPKIN_PIE);
        foodTable.put(4,Food.BAKED_POTATO);
        foodTable.put(5,Food.BORSCH);
    }


    @FXML
    protected void addFood(ActionEvent e){
        Button source = (Button)e.getSource();
        int id = Integer.parseInt((String)source.getUserData());
        foodTable.get(id).count++;
        updateCheck();
    }

    @FXML
    protected void removeFood(ActionEvent e){
        Button source = (Button)e.getSource();
        int id = Integer.parseInt((String)source.getUserData());
        if(foodTable.get(id).count>0) foodTable.get(id).count--;
        updateCheck();
    }

    protected void updateCheck(){
        StringBuilder check = new StringBuilder();
        int finalPrice=0;
        check.append("Check:\n\n");
        for(Food f : foodTable.values()){
            if(f.count>0) check.append("(")
                    .append(f.count)
                    .append(") ")
                    .append(f.getName())
                    .append("\tprice:")
                    .append(f.getPrice())
                    .append("\tprice for ")
                    .append(f.count)
                    .append(": ")
                    .append(f.getPrice() * f.count)
                    .append("\n\n");
            finalPrice+=f.getPrice()*f.count;
        }
        check.append("Final price: ")
                .append(finalPrice);
        textArea.setText(check.toString());
    }
}

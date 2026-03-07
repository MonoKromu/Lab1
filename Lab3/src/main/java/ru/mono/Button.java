package ru.mono;

public class Button {
    private int clickCount;
    Button(){
        System.out.println("Created new button");
    }
    public void click(){
        clickCount++;
        System.out.println("Button was clicked " + clickCount + " times");
    }
}

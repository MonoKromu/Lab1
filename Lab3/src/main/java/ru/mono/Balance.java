package ru.mono;

public class Balance {
    private int left = 0;
    private int right = 0;
    Balance(){
        System.out.println("Created new balance");
    }
    public void addLeft(int w){
        System.out.println("Added " + w + " to left");
        left+=w;
    }
    public void addRight(int w){
        System.out.println("Added " + w + " to right");
        right+=w;
    }
    public void result(){
        System.out.print("Res: ");
        if(left>right) System.out.println("L");
        else if (right>left) System.out.println("R");
        else System.out.println("=");
    }
}

package ru.mono;

public class Bell {
    private static boolean ding = true;
    public static void sound(){
        if(ding){
            System.out.print("ding ");
            ding = false;
        }
        else{
            System.out.print("dong ");
            ding = true;
        }
    }
}

package ru.mono;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        Button myButton = new Button();
        int n = 10;
        System.out.println("Doing " + n + " clicks");
        for(int i=1; i<=n; i++) myButton.click();

        System.out.println("\nTask 2");
        Balance balance = new Balance();
        balance.result();
        balance.addLeft(30);
        balance.result();
        balance.addRight(35);
        balance.result();

        System.out.println("\nTask 3");
        n = 7;
        for(int i=1; i<=n; i++) Bell.sound();

        System.out.println("\n\nTask 4");
        OddEvenSeparator sep = new OddEvenSeparator();
        int[] numbers = new int[]{3,-10,23,5,0,30,75,5,55,21,22,23,18,-125,-1,-2};
        System.out.println("Adding numbers to separator: "+ Arrays.toString(numbers));
        for(int i : numbers) sep.addNumber(i);
        sep.even();
        sep.odd();

        System.out.println("\nTask 5");
        Table table = new Table(3,3);
        table.setValue(0,0,9);
        table.setValue(1,1,9);
        table.setValue(2,2,9);
        System.out.println("Value at row 2, col 2: " + table.getValue(1,1));
        System.out.print("Full table:\n" + table);
        System.out.println("Average of all numbers: " + table.average());
    }
}
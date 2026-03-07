package ru.mono;

import java.util.ArrayList;
import java.util.List;

public class OddEvenSeparator {
    private List<Integer> oddNumbers;
    private List<Integer> evenNumbers;
    OddEvenSeparator(){
        oddNumbers = new ArrayList<>();
        evenNumbers = new ArrayList<>();
    }
    public void addNumber(int n){
        if(n==0) evenNumbers.add(n);
        else if(Math.abs(n)%2==0) evenNumbers.add(n);
        else oddNumbers.add(n);
    }
    public void odd(){
        System.out.print("Odd: ");
        for(int i : oddNumbers) System.out.print(i+" ");
        System.out.println();
    }
    public void even(){
        System.out.print("Even: ");
        for(int i : evenNumbers) System.out.print(i+" ");
        System.out.println();
    }
}

package ru.mono;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int N = 35;
        System.out.println("N = "+N);
        ArrayList<String> numbers = printNumbers(N);
        for (String n : numbers) {
            System.out.println(n);
        }

        System.out.println("\nTask 2");
        String text = "make install";
        System.out.println("Text: "+text);
        System.out.println("Reversed text: "+flipString(text));

        System.out.println("\nTask 3");
        int a=1;
        int b=-5;
        int c=4;
        double[] roots = quadraticEquation(a,b,c);
        System.out.println("Equation: "+a+"x^2 + "+b+"x + "+c);
        if(roots.length==0) System.out.println("No roots");
        else{
                System.out.println("Roots: ");
                for(double r : roots){
                System.out.println(new DecimalFormat("#0.00").format(r));
            }
        }

        System.out.println("\nTask 4");
        double minPart = 0.000001;
        System.out.println("Sum of 1/(n^2 + n - 2), starting n=2, while part>"+minPart);
        System.out.println(sumOfSeries(minPart));

        System.out.println("\nTask 5");
        ArrayList<String> pals = new ArrayList<>();
        pals.add("ASD f DSA");
        pals.add("12321");
        pals.add("bread");
        for(String s : pals){
            System.out.println("\""+s+"\" is palindrome: "+isPalindrome(s));
        }
    }

    public static ArrayList<String> printNumbers(int n){
        ArrayList<String> numbers = new ArrayList<>();
        if(n<1) return numbers;
        for(int i=1; i<=n; i++){
            if (i%(5*7)==0){
                numbers.add("fizzbuzz");
                continue;
            }
            if (i%(5)==0){
                numbers.add("fizz");
                continue;
            }
            if (i%(7)==0){
                numbers.add("buzz");
                continue;
            }
            numbers.add(String.valueOf(i));
        }
        return numbers;
    }

    public static String flipString(String txt){
        int length = txt.length();
        StringBuilder newTxt = new StringBuilder();
        for(int i=1; i<=length; i++){
            newTxt.append(txt.charAt(length-i));
        }
        return newTxt.toString();
    }

    public static double[] quadraticEquation(int a, int b, int c){
        double[] roots;
        int D = b*b-(4*a*c);
        if(D<0){
            roots = new double[0];
        }
        else if(D==0){
            roots = new double[1];
            double x = ((double) -b/(2*a));
            roots[0] = (double)Math.round(x * 100) /100; //Rounding root to .00
        }
        else{
            roots = new double[2];
            double Dq = Math.sqrt(D);
            double x1 = (-b-Dq)/(2*a);
            double x2 = (-b+Dq)/(2*a);
            roots[0] = (double)Math.round(x1 * 100) /100;
            roots[1] = (double)Math.round(x2 * 100) /100;
        }
        return roots;
    }

    public static double sumOfSeries(double minPart){
        int n=2;
        double part = 1/(Math.pow(n,2)+n-2);
        double sum=0;
        if(minPart<=0) minPart = 1;
        if(minPart>0&&minPart<1e-15) minPart=1e-15;

        while(part>minPart)
        {
            part = 1/(Math.pow(n,2)+n-2);
            sum+=part;
            n++;
        }
        return sum;
    }

    public static boolean isPalindrome(String s){
        int length = s.length();
        if(length<2) return true;
        for(int i=0; i<length/2; i++){
            if(s.charAt(i) != s.charAt(length-i-1)) return false;
        }
        return true;
    }
}
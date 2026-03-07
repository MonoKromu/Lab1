package ru.mono;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        System.out.println("Is it possible to draw triangle with sides:");
        double a, b, c;
        a = 15;
        b = 15;
        c = 52;
        System.out.println(a+", "+b+", "+c+" - "+isTriangle(a,b,c));
        c = 13;
        System.out.println(a+", "+b+", "+c+" - "+isTriangle(a,b,c));
        c = 0;
        System.out.println(a+", "+b+", "+c+" - "+isTriangle(a,b,c));

        System.out.println("\nTask 2");
        double x1, y1, x2, y2;
        x1 = 5;
        y1 = 5;
        x2 = 10;
        y2 = 15;
        System.out.println("Distance between point 1 ("+x1+", "+y1+") and point 2 ("+x2+", "+y2+") is "
                +calcDistance(x1,y1,x2,y2));

        System.out.println("\nTask 3");
        double number = 5;
        int pow = 3;
        System.out.println(number+" to the power of "+pow+" is "+powerLoop(number,pow));
        pow = -3;
        System.out.println(number+" to the power of "+pow+" is "+powerLoop(number,pow));

        System.out.println("\nTask 4\nSame but with recursive algorithm");
        number = 2;
        pow = 12;
        System.out.println(number+" to the power of "+pow+" is "+powerLoop(number,pow));

        System.out.println("\nTask 5");
        int n = 16;
        System.out.println("Tribonacci numbers up to the "+n+"th: ");
        for(int i=1; i<=n; i++){
            System.out.print(tribonacci(i)+" ");
        }
    }

    public static boolean isTriangle (double a, double b, double c){
        if(a <= 0 || b <= 0 || c <= 0) return false;
        return (a < b + c) && (b < a + c) && (c < a + b);
    }

    public static double calcDistance (double x1, double y1, double x2, double y2){
        return (Math.sqrt((Math.pow((x1-x2),2)+Math.pow((y1-y2),2))));
    }

    public static double powerLoop(double a, int n){
        if(a<=0) return -1;
        if(n==0) return 1;
        double res = a;
        for(int i=Math.abs(n); i>1; i--){
            res = res*a;
        }
        if(n>0) return res;
        else return 1.0/res;
    }

    public static double powerRec(double a, int n){
        if(a<=0) return -1;
        if(n>1) return a * powerRec(a,n-1);
        if(n==1) return a;
        if(n==0) return 1;
        else return -1;
    }

    public static int tribonacci(int n){
        if(n<1) return -1;
        if(n==1 || n==2) return 0;
        if(n==3) return 1;
        return (tribonacci(n-3) + tribonacci(n-2) + tribonacci(n-1));
    }
}
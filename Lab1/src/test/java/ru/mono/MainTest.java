package ru.mono;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void printNumbers() {
        String[] s = new String[]{"1","2","3","4","fizz","6","buzz","8","9","fizz","11","12","13","buzz","fizz","16",
                "17","18","19","fizz","buzz","22","23","24","fizz","26","27","buzz","29","fizz","31","32","33","34","fizzbuzz"};
        ArrayList<String> expectedNumbers = new ArrayList<>(List.of(s));
        ArrayList<String> actualNumbers = Main.printNumbers(expectedNumbers.size());
        assertEquals(expectedNumbers,actualNumbers);
    }
    @Test
    void printNumbersWrongLength(){
        ArrayList<String> expectedNumbers = new ArrayList<>();
        ArrayList<String> actualNumbers = Main.printNumbers(0);
        assertEquals(expectedNumbers,actualNumbers);
        actualNumbers = Main.printNumbers(-5);
        assertEquals(expectedNumbers,actualNumbers);
    }

    @Test
    void flipString() {
        String baseString = "make install";
        String expectedSting = "llatsni ekam";
        String actualString = Main.flipString(baseString);
        assertEquals(expectedSting,actualString);
    }
    @Test
    void flipStringEmpty(){
        String baseString = "";
        String expectedSting = "";
        String actualString = Main.flipString(baseString);
        assertEquals(expectedSting,actualString);
    }

    @Test
    void quadraticEquationTwoRoots(){
        int a=1;
        int b=-5;
        int c=4;
        double[] expectedRoots = new double[]{1.00,4.00};
        double[] actualRoots = Main.quadraticEquation(a,b,c);
        assertEquals(expectedRoots[0],actualRoots[0]);
        assertEquals(expectedRoots[1],actualRoots[1]);
        //Roots substitution to equation
        double substitution1 = (a*Math.pow(expectedRoots[0],2)) + (b*expectedRoots[0]) + c;
        double substitution2 = (a*Math.pow(expectedRoots[1],2)) + (b*expectedRoots[1]) + c;
        assertEquals(substitution1,0.0);
        assertEquals(substitution2,0.0);
    }
    @Test
    void quadraticEquationOneRoot(){
        int a=1;
        int b=-6;
        int c=9;
        int expectedLength = 1;
        double[] roots = Main.quadraticEquation(a,b,c);
        int actualLength = roots.length;
        assertEquals(expectedLength,actualLength);
        double substitution1 = (a*Math.pow(roots[0],2)) + (b*roots[0]) + c;
        assertEquals(0.0,substitution1);
    }
    @Test
    void quadraticEquationNoRoots(){
        int a=5;
        int b=0;
        int c=30;
        int expectedLength = 0;
        int actualLength = Main.quadraticEquation(a,b,c).length;
        assertEquals(expectedLength,actualLength);
    }

    @Test
    void sumOfSeries(){
        double minSum = 1.0/(2*2+2-2);
        double maxSum = 11.0/18; //lim of sum
        double sum = Main.sumOfSeries(1e-14);
        assertTrue(sum>=minSum && sum<=maxSum);
    }
    @Test
    void sumOfSeriesWrongInput(){
        int minPart = 10;
        double expectedSum = 0.0;
        double actualSum = Main.sumOfSeries(minPart);
        assertEquals(expectedSum,actualSum);

        minPart = -10;
        actualSum = Main.sumOfSeries(minPart);
        assertEquals(expectedSum,actualSum);
    }

    @Test
    void isPalindrome(){
        String s = "AsdsA";
        boolean actualRes = Main.isPalindrome(s);
        assertTrue(actualRes);

        s = "1";
        actualRes = Main.isPalindrome(s);
        assertTrue(actualRes);

        s = "";
        actualRes = Main.isPalindrome(s);
        assertTrue(actualRes);

        s = "123";
        actualRes = Main.isPalindrome(s);
        assertFalse(actualRes);
    }
}
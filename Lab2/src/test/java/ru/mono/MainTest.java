package ru.mono;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testIsTriangle() {
        double a = 15;
        double b = 17;
        double c = 18;
        assertTrue(Main.isTriangle(a,b,c));
        c = 33;
        assertFalse(Main.isTriangle(a,b,c));
    }
    @Test
    void isTriangleWrongInput() {
        double a = 13;
        double b = 13;
        double c = -13;
        assertFalse(Main.isTriangle(a,b,c));
        a = 0;
        b = 0;
        c = 1;
        assertFalse(Main.isTriangle(a,b,c));
    }


    @Test
    void calcDistance() {
        double x1 = 3;
        double y1 = 1;
        double x2 = 6;
        double y2 = -3;
        double expectedRes = 5;
        double actualRes = Main.calcDistance(x1,y1,x2,y2);
        assertEquals(expectedRes,actualRes);
        x1 = 0;
        y1 = 0;
        x2 = 0;
        y2 = 2;
        expectedRes = 2;
        actualRes = Main.calcDistance(x1,y1,x2,y2);
        assertEquals(expectedRes,actualRes);
    }


    @Test
    void powerLoop() {
        double a = 2;
        int n = 10;
        double expectedRes = 1024;
        double actualRes = Main.powerLoop(a,n);
        assertEquals(expectedRes,actualRes);

        n = -3;
        expectedRes = 0.125;
        actualRes = Main.powerLoop(a,n);
        assertEquals(expectedRes,actualRes);
    }
    @Test
    void powerLoopWrongInput() {
        double a = -5;
        int n = 2;
        double expectedRes = -1;
        double actualRes = Main.powerLoop(a,n);
        assertEquals(expectedRes,actualRes);
    }

    @Test
    void powerRec() {
        double a = 2;
        int n = 10;
        double expectedRes = 1024;
        double actualRes = Main.powerRec(a, n);
        assertEquals(expectedRes, actualRes);

    }
    @Test
    void powerRecWrongInput() {
        double a = -5;
        int n = 2;
        double expectedRes = -1;
        double actualRes = Main.powerRec(a,n);
        assertEquals(expectedRes,actualRes);

        n = -3;
        actualRes = Main.powerRec(a, n);
        assertEquals(expectedRes, actualRes);
    }

    @Test
    void tribonacci() {
        int n = 15;
        int expectedRes = 927;
        int actualRes = Main.tribonacci(n);
        assertEquals(expectedRes,actualRes);
    }
    @Test
    void tribonacciWrongInput() {
        int n = -10;
        int expectedRes = -1;
        int actualRes = Main.tribonacci(n);
        assertEquals(expectedRes,actualRes);
    }
}
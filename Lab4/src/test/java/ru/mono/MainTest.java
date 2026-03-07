package ru.mono;

import exceptions.InvalidSizeException;
import exceptions.NullBaseException;
import geometry2d.Circle;
import geometry2d.Rectangle;
import geometry3d.Cylinder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void cylinderTest() throws InvalidSizeException, NullBaseException {
        Rectangle r = new Rectangle(5, 5);
        Cylinder cyl = new Cylinder(r, 10);
        double expectedVolume = 250;
        assertEquals(expectedVolume,cyl.volume());
        Circle c = new Circle(12);
        cyl.setBase(c);
        expectedVolume = Math.PI*12*12*10;
        assertEquals(expectedVolume,cyl.volume());
    }

    @Test
    void cylinderTestWrongInput(){
        String expectedMessage = "";
        try {
            Rectangle r = new Rectangle(5,5);
            Cylinder cyl = new Cylinder(r, -10);
        } catch (InvalidSizeException | NullBaseException e) {
            expectedMessage = e.getMessage();
        }
        assertEquals(expectedMessage, "Height of cylinder (-10.0) is <= 0");
        try {
            Circle c = null;
            Cylinder cyl = new Cylinder(c, 10);
        } catch (InvalidSizeException | NullBaseException e) {
            expectedMessage = e.getMessage();
        }
        assertEquals(expectedMessage, "Base for cylinder is null");
    }

    @Test
    void circleTest() throws InvalidSizeException {
        Circle c = new Circle(10);
        double pi = Math.PI;
        double expectedArea = 10*10*pi;
        double expectedPerimeter = 2*pi*10;
        assertEquals(expectedArea, c.area());
        assertEquals(expectedPerimeter, c.perimeter());
    }

    @Test
    void circleTestWrongInput(){
        String expectedMessage = "";
        try{
            Circle c = new Circle(-3);
        } catch (InvalidSizeException e) {
            expectedMessage = e.getMessage();
        }
        assertEquals(expectedMessage, "Radius of circle (-3.0) is <= 0");
    }

    @Test
    void rectangleTest() throws InvalidSizeException {
        Rectangle r = new Rectangle(10, 5);
        double expectedArea = 50;
        double expectedPerimeter = 30;
        assertEquals(expectedArea, r.area());
        assertEquals(expectedPerimeter, r.perimeter());
    }

    @Test
    void rectangleWrongInput(){
        String expectedMessage = "";
        try{
            Rectangle r = new Rectangle(0, 5);
        } catch (InvalidSizeException e) {
            expectedMessage = e.getMessage();
        }
        assertEquals(expectedMessage, "Length of rectangle (0.0) is <= 0");
        try{
            Rectangle r = new Rectangle(10, -5);
        } catch (InvalidSizeException e) {
            expectedMessage = e.getMessage();
        }
        assertEquals(expectedMessage, "Width of rectangle (-5.0) is <= 0");
    }
}
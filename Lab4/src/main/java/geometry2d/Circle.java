package geometry2d;

import exceptions.InvalidSizeException;

public class Circle implements Figure{
    private double radius;

    public Circle(double radius) throws InvalidSizeException {
        setRadius(radius);
    }

    @Override
    public double area() {
        return (Math.PI * radius * radius);
    }

    @Override
    public double perimeter() {
        return(2 * Math.PI * radius);
    }

    @Override
    public String toString(){
        return ("[Figure: circle, radius: "+radius+", area: "+area()+", perimeter: "+perimeter()+"]");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws InvalidSizeException {
        if(radius<=0) throw new InvalidSizeException("Radius of circle ("+radius+") is <= 0");
        else this.radius = radius;
    }
}

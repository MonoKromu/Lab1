package geometry2d;

import exceptions.InvalidSizeException;

public class Rectangle implements Figure {
    private double length;
    private double width;

    public Rectangle(double length, double width) throws InvalidSizeException {
        setLength(length);
        setWidth(width);
    }

    @Override
    public double area() {
        return (length * width);
    }

    @Override
    public double perimeter() {
        return (2 * length + 2 * width);
    }

    @Override
    public String toString(){
        return ("[Figure: rectangle, width: "+width+", length: "+length
                +", area: "+area()+", perimeter: "+perimeter()+"]");
    }

    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }

    public void setLength(double length) throws InvalidSizeException {
        if(length <=0) throw new InvalidSizeException("Length of rectangle ("+ length +") is <= 0");
        else this.length = length;
    }
    public void setWidth(double width) throws InvalidSizeException {
        if(width<=0) throw new InvalidSizeException("Width of rectangle ("+width+") is <= 0");
        else this.width = width;
    }
}

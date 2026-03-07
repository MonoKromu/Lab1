package geometry3d;
import exceptions.InvalidSizeException;
import exceptions.NullBaseException;
import geometry2d.Figure;

import java.util.Objects;

public class Cylinder {
    Figure base;
    double height;
    public Cylinder(Figure base, double height) throws InvalidSizeException, NullBaseException {
        setBase(base);
        setHeight(height);
    }

    public double volume(){
        return (base.area() * height);
    }

    public Figure getBase() {
        return base;
    }
    public double getHeight() {
        return height;
    }

    @Override
    public String toString(){
        return ("[Figure: cylinder, base: "+base+", height: "+height+", volume: "+volume()+"]");
    }

    public void setBase(Figure base) throws NullBaseException {
        if(Objects.isNull(base)) throw new NullBaseException("Base for cylinder is null");
        else this.base = base;
    }
    public void setHeight(double height) throws InvalidSizeException {
        if(height<=0) throw new InvalidSizeException("Height of cylinder ("+height+") is <= 0");
        else this.height = height;
    }
}

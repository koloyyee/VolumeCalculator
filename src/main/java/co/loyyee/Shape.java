package co.loyyee;

/**
 * Shape is the most basic form of any shapes,
 * other shapes like Square, Cone, Cube, etc. will be extending from Shape.
 * **/
public abstract class Shape {
    protected double height;
    protected double width;

    public Shape(double height ) {
        this.height = height;
    }
    public Shape(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public abstract double getVolume();
}

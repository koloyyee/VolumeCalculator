public class Calculator extends CalculateVolume {
    private double width;
    private double height;
    private double radius;
    private double length;
    private double volume;

    public Calculator() {

    }

    public Calculator(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    public Calculator(double height, double length, double width) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getVolume() {
        return this.volume;
    }

    /**
     * Cone volume equation:
     * V = π r² h/3
     */
    public double getConeVolume() {
        volume = Math.PI * Math.pow(this.radius, 2) * (this.height / 3);
        return this.volume;
    }

    public double getConeVolume(double height, double radius) {
        if (this.height == 0) {
            this.height = height;
        }
        if (this.radius == 0) {
            this.radius = radius;
        }
        volume = Math.PI * Math.pow(radius, 2) * (height / 3);
        return this.volume;
    }

    /**
     * Cylinder volume equation:
     * V=πr2h
     */
    public double getCylinderVolume() {
        volume = Math.PI * this.radius * this.height;
        return this.volume;
    }

    public double getCylinderVolume(double height, double radius) {
        if (this.height == 0) {
            this.height = height;
        }
        if (this.radius == 0) {
            this.radius = radius;
        }
        volume = Math.PI * radius * height;
        return this.volume;
    }

    /**
     * Pyramid volume equation:
     * V=lwh/3
     */
    protected double getPyramidVolume() {
        volume = (this.length * this.width * this.height) / 3;
        return this.volume;
    }

    public double getPyramidVolume(double length, double width, double height) {
        if (this.height == 0)
            this.height = height;
        if (this.width == 0)
            this.width = width;
        if (this.length == 0)
            this.length = length;

        volume = (length * width * height) / 3;
        return this.volume;
    }

}

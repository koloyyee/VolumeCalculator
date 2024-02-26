package co.loyyee;

public class Cone extends Shape implements InputChecker {
    private double radius;

    public Cone(double height, double radius) {
        super(height);
        if (radius > 0) {
            this.radius = radius;
        } else {
            new IllegalArgumentException("Cannot be 1 or more .");
        }
    }

    public double getRadius() {
        return this.radius;
    }

    /**
     * Cone volume equation:
     * V = π r² h/3
     *
     * @return Cone Volume
     */
    @Override
    public double getVolume() {
        isValid();
        return Math.PI * Math.pow(this.radius, 2) * (super.height / 3);
    }

    @Override
    public boolean isValid() {
        if (super.height > 0 && this.radius > 0) {
            return true;
        } else {
            throw new IllegalArgumentException("height or radius must be over 0.0");
        }
    }

}

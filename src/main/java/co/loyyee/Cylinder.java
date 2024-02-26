package co.loyyee;

public class Cylinder extends Shape implements InputChecker{
  final private double radius;

  public Cylinder(double height, double width, double radius) {
    super(height, width);
    this.radius = radius;
  }

  /**
   * Cylinder volume equation:
   * V=πr2h
     * @return 
   */
  @Override
  public double getVolume() {
    isValid();
    return Math.PI * this.radius * super.height;
  }

  @Override
  public boolean isValid() {
    if (super.height > 0 && super.width > 0 && this.radius > 0){
      return true;
    } else {
      throw new IllegalArgumentException("height, width, or radius must be over 0.0");
    }
  }
}

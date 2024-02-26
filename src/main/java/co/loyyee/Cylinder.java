package co.loyyee;

public class Cylinder extends Shape implements InputChecker{
  final private double radius;

  public Cylinder(double height, double radius) {
    super(height);
    this.radius = radius;
  }

  /**
   * Cylinder volume equation:
   * V=π * r^2 * h
     * @return 
   */
  @Override
  public double getVolume() {
    isValid();
    return Math.PI * Math.pow(this.radius , 2)  *  super.height;
  }

  @Override
  public boolean isValid() {
    if (super.height > 0 &&  this.radius > 0){
      return true;
    } else {
      throw new IllegalArgumentException("height, width, or radius must be over 0.0");
    }
  }
}

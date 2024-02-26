package co.loyyee;

public class Pyramid extends Shape implements InputChecker {
  final private double length;

  public Pyramid(double height, double width, double length) {
    super(height, width);
    this.length = length;
  }

  /**
   * Pyramid volume equation:
   * V= l * w * h / 3
    * @return Pyramid volume
   */
  @Override
  public double getVolume() {
    isValid();
    return (this.length * super.width * super.height ) / 3 ;
  }

  @Override
  public boolean isValid() {
    if (super.height > 0 && super.width > 0 && this.length > 0) {
      return true;
    } else {
      throw new IllegalArgumentException("height, width, or length must be over 0.0");
    }
  }
}

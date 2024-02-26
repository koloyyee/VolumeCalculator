package co.loyyee;

import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void getVolume() {
        double height = 10.5;
        double radius = 10.2;
        Cylinder cylinder = new Cylinder(height, radius);
        double expected = cylinder.getVolume();
        DecimalFormat df = new DecimalFormat("#.##");
        double actual = Double.parseDouble(df.format( Math.PI * Math.pow(radius , 2)  *  height));
        assertEquals(expected, actual, 0.002, "Cylinder volume is not same expected.");
    }

    @Test
    void isValid() {
        Cylinder cylinder = new Cylinder(10,  -30);
        assertThrows(IllegalArgumentException.class, cylinder::isValid);
    }
}
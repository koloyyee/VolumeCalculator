package co.loyyee;

import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void getVolume() {
        Cylinder cylinder = new Cylinder(10, 20, 30);
        double expected = 942.48;
        DecimalFormat df = new DecimalFormat("#.##");
        double actual = Double.parseDouble(df.format(cylinder.getVolume()));
        assertEquals(expected, actual, 0.002, "Cylinder volume is not same expected.");
    }

    @Test
    void isValid() {
        Cylinder cylinder = new Cylinder(10, 20, -30);
        assertThrows(IllegalArgumentException.class, cylinder::isValid);
    }
}
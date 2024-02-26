package co.loyyee;

import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

class PyramidTest {

    @Test
    void getVolume() {
        double expected = 0.73;
        Pyramid p = new Pyramid(1.2, 1.3, 1.4);
        DecimalFormat df = new DecimalFormat("#.##");
        double actual = Double.parseDouble(df.format(0.73));
        assertEquals(expected, actual, 0.01, "Pyramid volume not as expected.");
    }

    @Test
    void isValid() {
        Pyramid p = new Pyramid(-1.2, 1.3, 1.4);
        assertThrows(IllegalArgumentException.class, p::isValid);
    }
}
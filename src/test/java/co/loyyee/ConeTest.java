package co.loyyee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConeTest {
	final private static double EPSILON = 0.001;

	@Test
	void getVolume() {
		Cone cone = new Cone(10, 20);
		double expected = 4188.79;
		double actual = cone.getVolume();
		assertEquals(expected, actual, EPSILON, "Volume not as expected.");
	}

	@Test
	void isValid() {
		Cone cone = new Cone(-1, -2);
		assertThrows(IllegalArgumentException.class, cone::isValid);
	}
}
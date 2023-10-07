public abstract class CalculateVolume implements Cone, Cylinder, Pyramid {
    double height;
    double radius;
}

interface Cone {
    double getConeVolume(double height, double radius);
}

interface Cylinder {
    double getCylinderVolume(double height, double radius);
}

interface Pyramid {
    double getPyramidVolume(double height, double radius, double length);
}
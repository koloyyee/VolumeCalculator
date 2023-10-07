public abstract class CalculateVolume implements Cone, Cylinder, Pyramid {
    double height;
    double radius;
}

interface Cone {
    double getConeVolume();

    double getConeVolume(double height, double radius);
}

interface Cylinder {
    double getCylinderVolume();

    double getCylinderVolume(double height, double radius);
}

interface Pyramid {
    double getPyramidVolume();

    double getPyramidVolume(double height, double length, double width);
}
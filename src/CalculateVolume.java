public abstract class CalculateVolume implements Cone, Cylinder, Pyramid {
    double height;
    double radius;
}

interface Cone {
    double getConeVolume();
}

interface Cylinder {
    double getCylinderVolume();
}

interface Pyramid {
    double getPyramidVolume();
}
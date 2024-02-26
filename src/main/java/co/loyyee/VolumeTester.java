// import java.util.Scanner;

// public class VolumeTester {
//     public static void main(String[] args) {
//         Calculator calc = new Calculator();
//         var scanner = new Scanner(System.in);

//         System.out.println("Enter number for height");
//         double height = scanner.nextDouble();
//         System.out.println("Enter number for radius");
//         double radius = scanner.nextDouble();

//         System.out.println("Enter number for length");
//         double length = scanner.nextDouble();
//         System.out.println("Enter number for width");
//         double width = scanner.nextDouble();

//         Calculator pyCalculator = new Calculator(height, length, width);

//         double cone = calc.getConeVolume(height, radius);
//         double cylinder = calc.getCylinderVolume(height, radius);
//         double pyramid = pyCalculator.getPyramidVolume();

//         System.out.printf("Height: %.2f%nRadius: %.2f%nCone volume: %.2f%n",
//                 calc.getHeight(),
//                 calc.getRadius(),
//                 cone);
//         System.out.printf("Height: %.2f%nRadius: %.2f%nCylinder volume: %.2f%n",
//                 calc.getHeight(),
//                 calc.getRadius(),
//                 cylinder);
//         System.out.printf("Height: %.2f%nLength: %.2f%nWidth: %.2f%nPyramid volume: %.2f%n",
//                 pyCalculator.getHeight(),
//                 pyCalculator.getLength(),
//                 pyCalculator.getWidth(),
//                 pyramid);

//         scanner.close();
//     }
// }

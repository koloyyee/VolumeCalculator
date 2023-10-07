import java.util.Scanner;

public class UserInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder opening = new StringBuilder();
        opening
                .append("Let's find out the volume of a shape!\n")
                .append("Press: ")
                .append("1 - Cone ")
                .append("2 - Cylinder ")
                .append("3 - Pyramid ");
        System.out.println(opening.toString());

        short choice;
        String picked = "Cone";
        while (true) {
            try {

                choice = scanner.nextShort();
                if (choice == 1 || choice == 2 || choice == 3) {
                    if (choice == 1)
                        picked = "Cone";
                    if (choice == 2)
                        picked = "Cylinder";
                    if (choice == 3)
                        picked = "Pyramid";
                    break;
                } else {
                    throw new Exception();
                }
            } catch (Exception error) {
                scanner.nextLine();
                System.out.println("Please choose between 1 - 3");
            }
        }

        Calculator calculator = pickCalculator(choice, picked, scanner);
        double volume = getVolume(choice, calculator);
        System.out.printf("The %s's volume is %.2f", picked, volume);
    }

    private static Calculator pickCalculator(short choice, String picked, Scanner scanner) {

        System.out.println(String.format("You have picked %s!%n", picked));
        switch (choice) {
            case 3:
                return pyramidCalculator(scanner);
            case 2:
                return cylinderCalculator(scanner);
            case 1:
            default:
                return coneCalculator(scanner);

        }
    }

    private static Calculator coneCalculator(Scanner scanner) {
        double height = checkInput("height", scanner);
        double radius = checkInput("radius", scanner);
        return new Calculator(height, radius);
    }

    private static Calculator cylinderCalculator(Scanner scanner) {
        double height = checkInput("height", scanner);
        double radius = checkInput("radius", scanner);
        return new Calculator(height, radius);
    }

    private static Calculator pyramidCalculator(Scanner scanner) {
        double height = checkInput("height", scanner);
        double length = checkInput("length", scanner);
        double width = checkInput("width", scanner);
        return new Calculator(height, length, width);
    }

    private static double getVolume(short choice, Calculator calculator) {
        switch (choice) {
            case 3:
                return calculator.getPyramidVolume();
            case 2:
                return calculator.getCylinderVolume();
            case 1:
            default:
                return calculator.getConeVolume();
        }
    }

    private static double checkInput(String measure, Scanner scanner) {
        double input;
        while (true) {
            try {
                System.out.printf("Enter number for %s: %n", measure);
                input = scanner.nextDouble();
                if (input <= 0) {
                    throw new IllegalArgumentException();
                }
                if (input > 0) {

                    return input;
                }
            } catch (Exception error) {
                scanner.nextLine();
                System.out.println("Please enter positive number.");
            }
        }
    }
}

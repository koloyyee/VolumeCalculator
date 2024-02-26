package co.loyyee;

import java.util.Scanner;

public class UserInputs {
    final private static String[] shapes = new String[]{"Cone", "Cylinder", "Pyramid"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder opening = new StringBuilder();
        opening
                .append("Let's find out the volume of a shape!\n")
                .append("Press: ");
        for (int i = 0; i < shapes.length; i++) {
            opening.append("\n").append(i + 1).append(": ").append(shapes[i]).append("");
        }
        System.out.println(opening.toString());

        boolean willContinue = true;
        while (willContinue) {

            short choice;
            String picked = "";
            while (true) {
                try {

                    choice = Short.parseShort(scanner.nextLine());
                    if (choice == 1 || choice == 2 || choice == 3) {
                        System.out.println(choice);
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
                    System.out.println("Please choose between 1 - 3");
                }
            }

            Shape shape = pickShape(choice, picked, scanner);
            double volume = shape.getVolume();
            System.out.printf("The %s's volume is %.2f%n", picked, volume);

            scanner.nextLine();
            System.out.println("Shall we continue? (N[o] to stop)");
            String shallContinue = scanner.nextLine();
            if (shallContinue.equalsIgnoreCase("n") || shallContinue.equalsIgnoreCase("no")) {
                willContinue = false;
                break;
            } else {
                System.out.println(opening.toString());
            }
        }
    }

    private static Shape pickShape(short choice, String picked, Scanner scanner) {
        if (picked.isEmpty()) throw new IllegalArgumentException();
        System.out.println(String.format("You have picked %s!%n", picked));
        switch (choice) {
            case 2: {
                double height = checkInput("height", scanner);
                double radius = checkInput("radius", scanner);
                return new Cylinder(height,  radius);
            }
            case 3: {

                double height = checkInput("height", scanner);
                double width = checkInput("width", scanner);
                double length = checkInput("length", scanner);
                return new Pyramid(height, width, length);
            }
            case 1:
            default: {
                double height = checkInput("height", scanner);
                double radius = checkInput("radius", scanner);
                return new Cone(height, radius);
            }
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
            } catch (IllegalArgumentException error) {
                scanner.nextLine();
                System.out.println("Please enter positive number.");
            }
        }
    }
}

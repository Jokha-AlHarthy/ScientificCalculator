//Importing a scanner to that you the user can add the input
import java.util.Scanner;
import java.util.InputMismatchException;

public class ScientificCalculator {

    public static void main(String[] args) {

        //creating a scanner object to read different inputs
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        //loop for presenting a menu of options to the user until they choose to exit
        while (running) {
            displayMenu();

            System.out.print("Choose an option (0 to exit): ");
            int choice = -1;

            //Implement basic error handling for invalid menu choices
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next(); // Clear invalid input
                continue;
            }

            //Conditional Logic
            switch (choice) {
                case 1:
                    performAddition(scanner);
                    break;
                case 2:
                    performSubtraction(scanner);
                    break;
                case 3:
                    performMultiplication(scanner);
                    break;
                case 4:
                    performDivision(scanner);
                    break;
                case 5:
                    performSquareRoot(scanner);
                    break;
                case 6:
                    performPower(scanner);
                    break;
                case 7:
                    performSine(scanner);
                    break;
                case 0:
                    running = false; System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }

    public static void displayMenu() {
        System.out.println("\n--- Scientific Calculator ---");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Square Root");
        System.out.println("6. Power");
        System.out.println("7. Sine");
    }

    // Reading inputs from the users for different kind of operations
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if (num2 == 0) throw new ArithmeticException("Division by zero");
        return num1 / num2;
    }

    public static double calculateSquareRoot(double num) {
        return Math.sqrt(num);
    }

    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static double calculateSine(double degrees) {
        return Math.sin(Math.toRadians(degrees));
    }

    //Addition method
    private static void performAddition(Scanner scanner) {
        try {
            System.out.print("Enter first number: ");
            double a = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double b = scanner.nextDouble();
            System.out.println("Result: " + add(a, b));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
            scanner.next();
        }
    }

    //Substraction method
    private static void performSubtraction(Scanner scanner) {
        try {
            System.out.print("Enter first number: ");
            double a = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double b = scanner.nextDouble();
            System.out.println("Result: " + subtract(a, b));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
            scanner.next();
        }
    }

    //Multiplication method
    private static void performMultiplication(Scanner scanner) {
        try {
            System.out.print("Enter first number: ");
            double a = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double b = scanner.nextDouble();
            System.out.println("Result: " + multiply(a, b));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
            scanner.next();
        }
    }

    //Division method
    private static void performDivision(Scanner scanner) {
        try {
            System.out.print("Enter numerator: ");
            double a = scanner.nextDouble();
            System.out.print("Enter denominator: ");
            double b = scanner.nextDouble();
            System.out.println("Result: " + divide(a, b));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
            scanner.next();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    //SquareRoot method
    private static void performSquareRoot(Scanner scanner) {
        try {
            System.out.print("Enter number: ");
            double a = scanner.nextDouble();
            if (a < 0) throw new ArithmeticException("Cannot take square root of negative number");
            System.out.println("Result: " + calculateSquareRoot(a));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
            scanner.next();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    //power function method
    private static void performPower(Scanner scanner) {
        try {
            System.out.print("Enter base: ");
            double base = scanner.nextDouble();
            System.out.print("Enter exponent: ");
            double exp = scanner.nextDouble();
            System.out.println("Result: " + power(base, exp));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
            scanner.next();
        }
    }

    private static void performSine(Scanner scanner) {
        try {
            System.out.print("Enter angle in degrees: ");
            double angle = scanner.nextDouble();
            System.out.println("Result: " + calculateSine(angle));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
            scanner.next();
        }
    }


}

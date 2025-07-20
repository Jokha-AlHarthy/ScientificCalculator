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
                case 8:
                    performCosine(scanner);
                    break;
                case 9:
                    performTangent(scanner);
                    break;
                case 10:
                    performNaturalLogarithm(scanner);
                    break;
                case 11:
                    performLogarithmBase10(scanner);
                    break;
                case 12:
                    performAbsoluteValue(scanner);
                    break;
                case 13:
                    performRound(scanner);
                    break;
                case 14:
                    performCeiling(scanner);
                    break;
                case 15:
                    performFloor(scanner);
                    break;
                case 16:
                    performMin(scanner);
                    break;
                case 17:
                    performMax(scanner);
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
        System.out.println("8. Cosine");
        System.out.println("9. Tangent");
        System.out.println("10. Natural Logarithm (ln)");
        System.out.println("11. Logarithm Base 10 (log10)");
        System.out.println("12. Absolute Value");
        System.out.println("13. Round");
        System.out.println("14. Ceiling");
        System.out.println("15. Floor");
        System.out.println("16. Minimum");
        System.out.println("17. Maximum");
        System.out.println("0. Exit");
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

    public static double calculateCosine(double degrees) {
        return Math.cos(Math.toRadians(degrees));
    }

    public static double calculateTangent(double degrees) {
        return Math.tan(Math.toRadians(degrees));
    }

    public static double calculateNaturalLogarithm(double num) {
        return Math.log(num);
    }

    public static double calculateLogarithmBase10(double num) {
        return Math.log10(num);
    }

    public static double calculateAbsoluteValue(double num) {
        return Math.abs(num);
    }

    public static long roundNumber(double num) {
        return Math.round(num);
    }

    public static double ceilingNumber(double num) {
        return Math.ceil(num);
    }

    public static double floorNumber(double num) {
        return Math.floor(num);
    }

    public static double findMin(double num1, double num2) {
        return Math.min(num1, num2);
    }

    public static double findMax(double num1, double num2) {
        return Math.max(num1, num2);
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
            System.out.println("Invalid input! Please enter a valid number");
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
            System.out.println("Invalid input! Please enter a valid number");
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
            System.out.println("Invalid input! Please enter a valid number");
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
            System.out.println("Invalid input! Please enter a valid number");
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
            System.out.println("Invalid input! Please enter a valid number");
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
            System.out.println("Invalid input! Please enter a valid number");
            scanner.next();
        }
    }

    //Sine (degree) method
    private static void performSine(Scanner scanner) {
        try {
            System.out.print("Enter angle in degrees: ");
            double angle = scanner.nextDouble();
            System.out.println("Result: " + calculateSine(angle));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid number");
            scanner.next();
        }
    }

    //Cosine (degree) method
    private static void performCosine(Scanner scanner) {
        try {
            System.out.print("Enter angle in degrees: ");
            double angle = scanner.nextDouble();
            System.out.println("Result: " + calculateCosine(angle));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid number");
            scanner.next();
        }
    }

    //Tangent (degree) method
    private static void performTangent(Scanner scanner) {
        try {
            System.out.print("Enter angle in degrees: ");
            double angle = scanner.nextDouble();
            System.out.println("Result: " + calculateTangent(angle));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid number");
            scanner.next();
        }
    }

    //Natural logarithm method
    private static void performNaturalLogarithm(Scanner scanner) {
        try {
            System.out.print("Enter number: ");
            double num = scanner.nextDouble();
            if (num <= 0) throw new ArithmeticException("Logarithm undefined for zero or negative numbers.");
            System.out.println("Result: " + calculateNaturalLogarithm(num));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid number");
            scanner.next();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    //Logarithm Base 10 method
    private static void performLogarithmBase10(Scanner scanner) {
        try {
            System.out.print("Enter number: ");
            double num = scanner.nextDouble();
            if (num <= 0) throw new ArithmeticException("Logarithm undefined for zero or negative numbers.");
            System.out.println("Result: " + calculateLogarithmBase10(num));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid number");
            scanner.next();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    //Absolute Value method
    private static void performAbsoluteValue(Scanner scanner) {
        try {
            System.out.print("Enter number: ");
            double num = scanner.nextDouble();
            System.out.println("Result: " + calculateAbsoluteValue(num));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid number");
            scanner.next();
        }
    }

    //Round method
    private static void performRound(Scanner scanner) {
        try {
            System.out.print("Enter number: ");
            double num = scanner.nextDouble();
            System.out.println("Result: " + roundNumber(num));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid number");
            scanner.next();
        }
    }

    //Ceiling method
    private static void performCeiling(Scanner scanner) {
        try {
            System.out.print("Enter number: ");
            double num = scanner.nextDouble();
            System.out.println("Result: " + ceilingNumber(num));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid number");
            scanner.next();
        }
    }


    //Floor method
    private static void performFloor(Scanner scanner) {
        try {
            System.out.print("Enter number: ");
            double num = scanner.nextDouble();
            System.out.println("Result: " + floorNumber(num));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid number");
            scanner.next();
        }
    }

    //Min method
    private static void performMin(Scanner scanner) {
        try {
            System.out.print("Enter first number: ");
            double a = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double b = scanner.nextDouble();
            System.out.println("Result: " + findMin(a, b));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid number");
            scanner.next();
        }
    }

    //Max method
    private static void performMax(Scanner scanner) {
        try {
            System.out.print("Enter first number: ");
            double a = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double b = scanner.nextDouble();
            System.out.println("Result: " + findMax(a, b));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid number");
            scanner.next();
        }
    }
}






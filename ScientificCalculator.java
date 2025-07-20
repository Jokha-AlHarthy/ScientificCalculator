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
    }

    // Reading inputs from the users for different kind of operations
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
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

}

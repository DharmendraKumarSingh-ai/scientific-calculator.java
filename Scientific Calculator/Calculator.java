import java.util.Scanner;

public class Calculator {

    // Method for addition
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Method for subtraction
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Method for multiplication
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Method for division
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero!");
            return Double.NaN;
        }
        return num1 / num2;
    }

    // Method for calculating the power of a number
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // Method for calculating the square root of a number
    public static double squareRoot(double num) {
        if (num < 0) {
            System.out.println("Error: Cannot calculate square root of a negative number!");
            return Double.NaN;
        }
        return Math.sqrt(num);
    }

    // Method for calculating the sine of a number
    public static double sine(double num) {
        return Math.sin(Math.toRadians(num));
    }

    // Method for calculating the cosine of a number
    public static double cosine(double num) {
        return Math.cos(Math.toRadians(num));
    }

    // Method for calculating the tangent of a number
    public static double tangent(double num) {
        return Math.tan(Math.toRadians(num));
    }

    // Method for calculating the logarithm (base 10) of a number
    public static double logarithm(double num) {
        if (num <= 0) {
            System.out.println("Error: Cannot calculate logarithm of a non-positive number!");
            return Double.NaN;
        }
        return Math.log10(num);
    }

    // Method for addition of three numbers (method overloading)
    public static double add(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        int choice;

        while (true) {
            System.out.println("\nScientific Calculator Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Power");
            System.out.println("6. Square Root");
            System.out.println("7. Sine");
            System.out.println("8. Cosine");
            System.out.println("9. Tangent");
            System.out.println("10. Logarithm (base 10)");
            System.out.println("11. Add Three Numbers");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Exiting calculator. Goodbye!");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = add(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = subtract(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = multiply(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = divide(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 5:
                    System.out.print("Enter base: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter exponent: ");
                    num2 = scanner.nextDouble();
                    result = power(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 6:
                    System.out.print("Enter number: ");
                    num1 = scanner.nextDouble();
                    result = squareRoot(num1);
                    System.out.println("Result: " + result);
                    break;
                case 7:
                    System.out.print("Enter number: ");
                    num1 = scanner.nextDouble();
                    result = sine(num1);
                    System.out.println("Result: " + result);
                    break;
                case 8:
                    System.out.print("Enter number: ");
                    num1 = scanner.nextDouble();
                    result = cosine(num1);
                    System.out.println("Result: " + result);
                    break;
                case 9:
                    System.out.print("Enter number: ");
                    num1 = scanner.nextDouble();
                    result = tangent(num1);
                    System.out.println("Result: " + result);
                    break;
                case 10:
                    System.out.print("Enter number: ");
                    num1 = scanner.nextDouble();
                    result = logarithm(num1);
                    System.out.println("Result: " + result);
                    break;
                case 11:
                    System.out.print("Enter first number: ");
                    double numA = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double numB = scanner.nextDouble();
                    System.out.print("Enter third number: ");
                    double numC = scanner.nextDouble();
                    result = add(numA, numB, numC);
                    System.out.println("Result: " + result);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
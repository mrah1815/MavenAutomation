package org.mavenInt.mavenIntegration;

import java.util.Scanner;

public class App {

    public static class Calculator {
        public double add(double a, double b) {
            return a + b;
        }

        public double subtract(double a, double b) {
            return a - b;
        }

        public double multiply(double a, double b) {
            return a * b;
        }

        public double divide(double a, double b) {
            if (b == 0) {
                throw new IllegalArgumentException("Cannot divide by zero");
            }
            return a / b;
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();

        System.out.println("Choose operation: 1) Add 2) Subtract 3) Multiply 4) Divide");
        int choice = scanner.nextInt();

        double result;
        switch (choice) {
            case 1:
                result = calculator.add(num1, num2);
                break;
            case 2:
                result = calculator.subtract(num1, num2);
                break;
            case 3:
                result = calculator.multiply(num1, num2);
                break;
            case 4:
                result = calculator.divide(num1, num2);
                break;
            default:
                throw new IllegalArgumentException("Invalid choice");
        }

        System.out.println("The result is: " + result);
        scanner.close();
    }
}

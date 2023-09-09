package com.ruhul;
import java.util.Scanner;

public class Calculator_Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("Available operations:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        System.out.print("Enter the operation (1/2/3/4): ");
        int choice = scanner.nextInt();

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result = 0;

        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero!");
                    System.exit(1); // Terminate the program
                }
                break;
            default:
                System.out.println("Invalid operation choice.");
                System.exit(1); // Terminate the program
        }

        System.out.println("Result: " + result);

        scanner.close();
    }
}

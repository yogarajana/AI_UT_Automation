package com.ib.test;

import java.util.Scanner;

public class Calculate {

    public double add(double a, double b) {
        return a + b;
    }

    public  double subtract(double a, double b) {
        return a - b;
    }

    public  double multiply(double a, double b) {
        return a * b;
    }

    public  double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {
    	Calculate calc = new Calculate();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = calc.add(num1, num2);
                break;
            case '-':
                result = calc.subtract(num1, num2);
                break;
            case '*':
                result = calc.multiply(num1, num2);
                break;
            case '/':
                result = calc.divide(num1, num2);
                break;
           default:
                System.out.println("Invalid operator!");
                return;
        }

        System.out.println("Result: " + result);
        
    }
}


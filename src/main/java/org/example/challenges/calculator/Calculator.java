package org.example.challenges.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your first number");
        int firstNum = scanner.nextInt();
        System.out.println("The operation (x, -, /, +, ** (exp))");
        String operator = scanner.next();
        System.out.println("What is your second/last number");
        int secondNum = scanner.nextInt();

        operator = operator.toUpperCase();

        operator = operator == "exp" ? "**" : operator;

        switch (operator) {
            case "X":
                System.out.println(firstNum * secondNum + operator + "X");
                break;
            case "-":
                System.out.println(firstNum - secondNum + operator + "-");
                break;
            case "/":
                System.out.println(firstNum / secondNum + operator + "/");
                break;
            case "+":
                System.out.println(firstNum + secondNum + operator + "+");
                break;
            case "**":
                System.out.println(Math.pow((double) firstNum, (double) secondNum) + "**");
                break;
            default:
                System.out.println(operator + "is an invalid operation");
                break;
        }
    }
}

package se.lexicon;

import java.util.Scanner;

public class App {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to your basic calculator!");

    boolean isActivated = true;
    while (isActivated) {
        System.out.println("Enter the first number:");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        int number2 = scanner.nextInt();

        System.out.println("Now choose an operation type: +. -, * or /");
        String operationTypE= scanner.next();
        switch (operationTypE) {

            case "+":
                int resultAdd = addition(number1,number2);
                System.out.println("The sum is " + resultAdd);
                break;
            case "-":
                int resultSub = subtraction(number1,number2);
                System.out.println("The difference is " + resultSub);
                break;
            case "*":
                int resultMul = multiplication(number1,number2);
                System.out.println("The end result becomes " + resultMul);
                break;
            case "/":
                int resultDiv = division(number1,number2);
                System.out.println("The end result becomes " + resultDiv);
                break; }

        System.out.println(" ");
        System.out.println("Would you like to use the calculator again?");
        String answer = scanner.next();
        if (answer.equalsIgnoreCase("No")) {
            isActivated = false;
            }
        }
    }

    public static int addition(int number1,int number2) {
            return number1 + number2;
    }
    public static int subtraction(int number1,int number2) {
            return number1 - number2;
    }
    public static int multiplication(int number1,int number2) {
            return number1 * number2;
    }
    public static int division(int number1,int number2) {
           return number1 / number2;
    }
}
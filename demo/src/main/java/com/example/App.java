package com.example;

/**
 * Chavvi Calculator!
 *
 */
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
    
        //Create calculator format
        System.out.println("---------------------------------------------------");
        System.out.println("Chavvi Calc");
        System.out.println("---------------------------------------------------");
        // declare A and B as a variable
        System.out.println("A = 0.000   B = 0.000           ");
        System.out.println("---------------------------------------------------");
        System.out.println("a       Enter a value for A");
        System.out.println("b       Enter a value for B");
        System.out.println("+       Add");
        System.out.println("-       Subtract");
        System.out.println("*       Multiply");
        System.out.println("/       Divide");
        System.out.println("c       Clear");
        System.out.println("q       Quit");
        System.out.println("---------------------------------------------------");

        //create Scanner object
        System.out.print("Enter a command: ");
        Scanner scanner = new Scanner(System.in);
        char operator = scanner.next().charAt(0); 

        //ask user for numberOne
        System.out.print("Enter a number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter a number: ");
        double number2 = scanner.nextDouble();

        double result = 0.0;
        switch(operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                if (number2 != 0) {
                    result = number1 / number2; 
                } else {
                    System.out.println("Error: You cannot divide by 0");
                    return;
                }
                break;
        }
        System.out.println("Result: " + result);
    }
}

package com.example;

/**
 * Chavvi Calculator!
 *
 */
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        //create scanner class
        Scanner scanner = new Scanner(System.in);

        //initialize A and B to 0
        double valueA = 0.0;
        double valueB = 0.0;

        //start while(true) loop
        while (true){
            //display the current value of the calculator
            String formattedA = String.format("%.3f", valueA);
            String formattedB = String.format("%.3f", valueB);

            System.out.println("---------------------------------------------------");
            System.out.println("Chavvi Calc");
            System.out.println("---------------------------------------------------");
            // declare A and B as a variable
            System.out.println("A = " + formattedA + "         B = " + formattedB);
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
            System.out.print("Enter a command: ");

            String input = scanner.nextLine();
            String trimmedInput = input.trim();
            String command = trimmedInput.toLowerCase();

            switch (command) {
                case "a":
                    System.out.print("Enter value for A: ");
            }
        }
            
        // //create Scanner object
        // System.out.print("Enter a command: ");
      
        // char operator = scanner.next().charAt(0); 

        // //ask user for numberOne
        // System.out.print("Enter a number: ");
        // double number1 = scanner.nextDouble();

        // System.out.print("Enter a number: ");
        // double number2 = scanner.nextDouble();

        // double result = 0.0;
        // switch(operator) {
        //     case '+':
        //         result = number1 + number2;
        //         break;
        //     case '-':
        //         result = number1 - number2;
        //         break;
        //     case '*':
        //         result = number1 * number2;
        //         break;
        //     case '/':
        //         if (number2 != 0) {
        //             result = number1 / number2; 
        //         } else {
        //             System.out.println("Error: You cannot divide by 0");
        //             return;
        //         }
        //         break;
        //     default:
        //         System.out.println("Error");
        // }
        // System.out.println("Result: " + result);
    }
}

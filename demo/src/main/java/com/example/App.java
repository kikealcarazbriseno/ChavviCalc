package com.example;

/**
 * Chavvi Calculator!
 *
 */
import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        //create scanner class
        Scanner scanner = new Scanner(System.in);

        //initialize A and B to 0
        double valueA = 0.0;
        double valueB = 0.0;
        double result = 0.0;

        boolean continueLoop = true;

        //start while(true) loop
        while (continueLoop){
            //display the current value of the calculator
            String formattedA = String.format("%.3f", valueA);
            String formattedB = String.format("%.3f", valueB);

            System.out.println("---------------------------------------------------");
            System.out.println("Chavvi Calc");
            System.out.println("---------------------------------------------------");
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

            // String input = scanner.nextLine();
            //String trimmedInput = input.trim();
            //String command = trimmedInput.toLowerCase();

            char operator = scanner.next().charAt(0); 
            
            switch(operator) {
                case 'a':
                    System.out.print("Enter a number: ");
                    try {
                        valueA = scanner.nextDouble();
                    } catch (Exception e) {
                        System.out.println("Error: The value entered is not a double");
                        scanner.nextLine();
                    }
                    result = valueA;
                    break;
                case 'b':
                    System.out.print("Enter a number: ");
                    try {
                        valueB = scanner.nextDouble();
                    } catch (Exception e) {
                        System.out.println("Error: The value entered is not a double");
                        scanner.nextLine();
                    }
                    break;
                case '+':
                    result = valueA + valueB;
                    break;
                case '-':
                    result = valueA - valueB;
                    break;
                case '*':
                    result = valueA * valueB;
                    break;
                case '/':
                    if (valueB != 0) {
                        result = valueA / valueB; 
                    } else {
                        System.out.println("Error: Unable to divide by 0");
                    }
                    break;
                case 'c':
                    result = 0.000;
                    valueB = 0.000;
                    break;
                case 'q':
                    continueLoop = false;
                    System.out.print("Thank you for using Chavvi's Calculator!");
                    break;  
                default:
                    System.out.println("Error");
            }
            valueA = result;
        }
    }
}
 /*
            switch (command) {
                case "a":
                    System.out.print("Enter value for A: ");
            }
                    */
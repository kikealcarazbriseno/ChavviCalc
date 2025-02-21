package com.example;

/**
 * Ricky Alcaraz-Briseno
 * CIS 055: DSA
 * Program: Chavvi Calculator!
 */
import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        //create scanner class
        Scanner scanner = new Scanner(System.in);

        //initialize value of A, B and result to 0.0
        double valueA = 0.0;
        double valueB = 0.0;
        double result = 0.0;
        
        //flag to check if continueLoop is true or false
        boolean continueLoop = true;

        //start while loop
        while (continueLoop){
            //display the current value of the calculator up to 3 decimal places
            String formattedA = String.format("%.3f", valueA);
            String formattedB = String.format("%.3f", valueB);

            //print user calculator interface
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

            // statement reads a single char input from the user and stores it in operator
            char operator = scanner.next().charAt(0); 
            
            //control flow statement 
            switch(operator) {
                case 'a': //option 'a' for user to enter valueA
                    System.out.print("Enter a number: ");
                    try { //try catch statement for value that is != part of the menu
                        valueA = scanner.nextDouble();
                    } catch (Exception e) { //print this error message
                        System.out.println("Error: The value entered is not a double");
                        scanner.nextLine(); 
                    }
                    result = valueA; //store valueA in result
                    break;
                case 'b':
                    System.out.print("Enter a number: "); //same logic as 'a' from 61 -68
                    try {
                        valueB = scanner.nextDouble();
                    } catch (Exception e) {
                        System.out.println("Error: The value entered is not a double");
                        scanner.nextLine();
                    }
                    break;
                case '+': //addition
                    result = valueA + valueB;
                    break;
                case '-': //subtraction
                    result = valueA - valueB;
                    break;
                case '*': //multiplication
                    result = valueA * valueB;
                    break;
                case '/': //division
                    if (valueB != 0) { //if-else statement for when valueB = 0
                        result = valueA / valueB; 
                    } else {
                        System.out.println("Error: Unable to divide by 0");
                    }
                    break;
                case 'c': //clear values of valueA and valuebB
                    result = 0.000;
                    valueB = 0.000;
                    break;
                case 'q': //quit program
                    continueLoop = false; //declare flag false
                    System.out.print("Thank you for using Chavvi's Calculator!");
                    break;  
                default:
                    System.out.println("Error, please enter a command from the menu above.");
            }
            valueA = result; //declare valueA as 0.0
        }
    }
}
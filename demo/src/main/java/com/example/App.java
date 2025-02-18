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

        //Create Scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a command: ");
    }
}

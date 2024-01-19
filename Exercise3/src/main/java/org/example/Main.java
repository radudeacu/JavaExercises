/*
Write a Java program to divide two numbers and print them on the screen.
Test Data :
50/3
Expected Output :
16
*/
package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        int quotient = number1 / number2;

        System.out.println("The quotient is: " + quotient);

        scanner.close();
    }
}
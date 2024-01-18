/* Write a Java program to print the sum of two numbers.
Test Data:
74 + 36
Expected Output :
110
* */
package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompts for the user to enter the numbers

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;

        System.out.println("The sum is: " + sum);

        scanner.close();
    }
}
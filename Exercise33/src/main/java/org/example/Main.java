package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner obj for user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input an integer: ");
        int number = scanner.nextInt();

        // Initialize a variable to store the sum of the digits
        int sum = 0;

        // Use a loop to extract each digit and add it to the sum
        while (number != 0) {
            // Get the last digit of the number
            int digit = number % 10;

            // Add the digit to the sum
            sum += digit;

            // Remove the last digit from the number
            number = number / 10;
        }

        // Print the result
        System.out.println("The sum of the digits is: " + sum);

        // Close the scanner
        scanner.close();
    }
}

package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, sum;

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Input number: ");

        // Read the input from the user
        n = scanner.nextInt();

        // Calculate the sum (n + nn + nnn)
        sum = n + (n * 10) + (n * 100);

        // Display the result
        System.out.println(n + " + " + n * 10 + " + " + n * 100 + " = " + sum);

        scanner.close(); // Close the Scanner object (optional but good practice)
    }
}
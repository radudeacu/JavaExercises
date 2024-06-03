//41. Write a Java program to print the ASCII value of a given character.
//        Expected Output
//
//        The ASCII value of Z is :90

package org.example;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a character
        System.out.print("Enter a character: ");

        // Read the input character from the user
        char ch = scanner.next().charAt(0);

        // Get the ASCII value of the character
        AtomicInteger asciiValue = new AtomicInteger((int) ch);

        // Print the ASCII value of the character
        System.out.println("The ASCII value of " + ch + " is: " + asciiValue);

        // Close the scanner
        scanner.close();
    }
}
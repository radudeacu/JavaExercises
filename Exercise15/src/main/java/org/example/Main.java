// Write a Java program to swap two variables.
package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Declare integer variables for storing user input and swapping
        int x, y, z;

        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);

        // Prompt the user to input the first number
        System.out.println("Input the first number: ");
        x = in.nextInt();

        // Prompt the user to input the second number
        System.out.println("Input the second number: ");
        y = in.nextInt();

        // Perform the swap using a temporary variable 'z'
        z = x;
        x = y;
        y = z;

        // Display the swapped values
        System.out.println("Swapped values are: " + x + " and " + y);
    }
}
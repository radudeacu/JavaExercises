//Write a Java program to convert a string to an integer.
//        Sample Output:
//
//        Input a number(string): 25
//        The integer value is: 25

package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number (string): ");
        String numberString = scanner.nextLine();

        int number;
        try {
            number = Integer.parseInt(numberString);
            System.out.println("The integer value is: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }
}
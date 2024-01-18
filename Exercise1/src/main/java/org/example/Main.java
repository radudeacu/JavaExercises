/* Write a Java program to print 'Hello' on screen and your name on a separate line.
Expected Output :
Hello
Alexandra Abramov
*  */
package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Create a Scanner obj for reading input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter name:
        System.out.println("Enter your name: ");

        // Read user's input
        String name = scanner.nextLine();

        scanner.close();

        System.out.println("Hello \n" + name);
    }
}
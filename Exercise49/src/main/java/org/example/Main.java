//      Write a Java program to accept a number and check whether the number is even or not.
//      Prints 1 if the number is even or 0 if odd.
//      Sample Output:
//      Input a number: 20
//      1
package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = scanner.nextInt();

        // Check if number is even using modulo operator
        if (number % 2 == 0) {
            System.out.println(1);  // Print 1 for even
        } else {
            System.out.println(0);  // Print 0 for odd
        }
    }
}
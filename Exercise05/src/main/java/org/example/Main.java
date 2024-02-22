/**
 Write a Java program that takes two numbers as input and displays the product of two numbers.
 Test Data:
 Input first number: 25
 Input second number: 5
 Expected Output :
 25 x 5 = 125
 */
package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input 1st number: ");
        int num1 = in.nextInt();

        System.out.print("Input 2nd number: ");
        int num2 = in.nextInt();

        // Calculate product
        System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
    }
}
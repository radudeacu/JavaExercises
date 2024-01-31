/*
*Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
* */
package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = in.nextInt();

        System.out.print("Input second number: ");
        int num2 = in.nextInt();

        // sum
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

        // diff
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));

        // product
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));

        // division
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));

        // remainder
        System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));

    }
}
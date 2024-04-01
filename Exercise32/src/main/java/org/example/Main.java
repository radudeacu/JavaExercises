/*
*
Write a Java program to compare two numbers.
Test Data:
Input first integer: 25
Input second integer: 39
*  */

package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;

        // first in
        System.out.print("1st number: ");
        number1 = input.nextInt();

        // second in
        System.out.print("2nd number: ");
        number2 = input.nextInt();

        // Compare n display - this should be done quicker
        if (number1 == number2)
            System.out.printf("%d == %d\n", number1, number2);
        if (number1 != number2)
            System.out.printf("%d != %d\n", number1, number2);
        if (number1 < number2)
            System.out.printf("%d < %d\n", number1, number2);
        if (number1 > number2)
            System.out.printf("%d > %d\n", number1, number2);
        if (number1 <= number2)
            System.out.printf("%d <= %d\n", number1, number2);
        if (number1 >= number2)
            System.out.printf("%d >= %d\n", number1, number2);
    }
}
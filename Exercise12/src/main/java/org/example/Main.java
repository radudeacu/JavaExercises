// Write a Java program that takes three numbers as input to calculate and print the average of the numbers.


package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = in.nextInt();

        System.out.print("Input second number: ");
        int num2 = in.nextInt();

        System.out.println("The average of the numbers is: " + (num1 + num2)/2);
    }
}
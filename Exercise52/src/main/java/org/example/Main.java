//Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.
//        Sample Output:
//
//        Input the first number : 5
//        Input the second number: 10
//        Input the third number : 15
//        The result is: true


package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Input the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Input the third number: ");
        int num3 = scanner.nextInt();


        boolean result = isSumEqual(num1, num2, num3);
        System.out.println("The result is: " + result);
    }

    public static boolean isSumEqual(int a, int b, int c) {
        return (a + b == c) || (a + c == b) || (b + c == a);
    }
}
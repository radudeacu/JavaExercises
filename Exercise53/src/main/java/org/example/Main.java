//Write a Java program that accepts three integers from the user.
//          It returns true if the second number is higher than the first number and the third number is larger than the second number.
//          If "abc" is true, the second number does not need to be larger than the first number.
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


        boolean result = checkNumbers(num1, num2, num3);
        System.out.println("The result is: " + result);
    }

    public static boolean checkNumbers(int num1, int num2, int num3) {
        // If "abc" is true, the second number doesn't need to be larger than the first
        boolean abc = true; // Replace with false if you don't want to use this condition

        if (abc) {
            return num3 > num2;
        } else {
            return num2 > num1 && num3 > num2;
        }
    }
}
/*
Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output

Sum of two binary numbers: 101
*/

package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // binary arithmetic rules: 0+0=0, 0+1=1, 1+0=1, 1+1=0 with a carry of 1

        System.out.print("Input first binary number: ");
        String binaryNumber1 = scanner.nextLine();

        System.out.print("Input second binary number: ");
        String binaryNumber2 = scanner.nextLine();

        // Convert to StringBuilder and reverse
        StringBuilder binaryNumber1Builder = new StringBuilder(binaryNumber1).reverse();
        StringBuilder binaryNumber2Builder = new StringBuilder(binaryNumber2).reverse();

        // Initialize the result StringBuilder and carry variable
        StringBuilder result = new StringBuilder();
        int carry = 0;

        // Determine the length of the longer binary number for the loop
        int maxLength = Math.max(binaryNumber1Builder.length(), binaryNumber2Builder.length());

        for (int i = 0; i < maxLength; i++) {
            // Convert character to integer value, or 0 if index exceeds string length
            int bit1 = i < binaryNumber1Builder.length() ? binaryNumber1Builder.charAt(i) - '0' : 0;
            int bit2 = i < binaryNumber2Builder.length() ? binaryNumber2Builder.charAt(i) - '0' : 0;

            // Binary addition using XOR for sum and AND for carry
            int sum = bit1 ^ bit2 ^ carry;
            carry = (bit1 & bit2) | (bit1 & carry) | (bit2 & carry);

            // Append sum to result
            result.append(sum);
        }

        // Handle remaining carry
        if (carry != 0) {
            result.append(carry);
        }

        // Since we've been appending bits in reverse order, reverse the result before outputting
        result.reverse();

        // Output the result
        System.out.println("Result of binary addition: " + result.toString());

        scanner.close();

        // logic to add the binary numbers
    }
}
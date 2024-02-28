/*
Write a Java program to print a face.
Expected Output

 +"""""+
[| o o |]
 |  ^  |
 | '-' |
 +-----+

*/

package org.example;

public class Main {
    public static void main(String[] args) {
        // array to store lines of an ASCII art representation
        String[] array = new String[5];

        // Populate the array with lines to form an ASCII art
        array[0] = " +\"\"\"\"\"+ ";
        array[1] = "[| o o |]";
        array[2] = " |  ^  |";
        array[3] = " | '-' |";
        array[4] = " +-----+";

        // Use a loop to print each line of the ASCII art representation
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }

    }
}
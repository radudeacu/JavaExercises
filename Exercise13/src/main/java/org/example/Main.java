/*
Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5

Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
* */


package org.example;

public class Main {
    public static void main(String[] args) {

        final double width = 5.6;
        final double height = 8.5;

        // calculate the perimeter
        double perimeter = 2 * (width + height);

        // area
        double area = width * height;

        //
        // Print the calculated perimeter using placeholders for values
        System.out.println("Perimeter is: " + perimeter);

        // Print the calculated area using placeholders for values
        System.out.println("Area is: " + area);
    }
}
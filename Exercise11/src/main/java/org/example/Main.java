/* Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
Perimetru e 2 * pi * r
Aria pi * r^2
*/
package org.example;

public class Main {

    // constant for the radius of the circle
    private static final double radius = 7.5;
    public static void main(String[] args) {

        // Calculate the perimeter of the circle using the constant radius
        double perimeter = 2 * Math.PI * radius;

        // Calculate the area of the circle using the constant radius
        double area = Math.PI * radius * radius;

        // Print the calculated perimeter and area
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
}
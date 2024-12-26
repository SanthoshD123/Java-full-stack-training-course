package myPack;

import java.util.Scanner;

public class mathsOperations {
    Scanner sc = new Scanner(System.in);

    public void getInputAndCalculate() {
        System.out.println("Enter a number to find its square and cube:");
        int num = sc.nextInt();
        System.out.println("Square of " + num + " is: " + square(num));
        System.out.println("Cube of " + num + " is: " + cube(num));
        
        System.out.println("\nEnter the base and height of a triangle:");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        System.out.println("Area of triangle: " + areaOfTriangle(base, height));
        
        System.out.println("\nEnter the length and width of a rectangle:");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        System.out.println("Area of rectangle: " + areaOfRectangle(length, width));
        
        System.out.println("\nEnter the side length of a square:");
        double side = sc.nextDouble();
        System.out.println("Area of square: " + areaOfSquare(side));
        
        System.out.println("\nEnter the radius of a circle:");
        double radius = sc.nextDouble();
        System.out.println("Area of circle: " + areaOfCircle(radius));
        System.out.println("Perimeter of circle: " + perimeterOfCircle(radius));
    }

    int square(int num) {
        return num * num;
    }

    int cube(int num) {
        return num * num * num;
    }

    double areaOfTriangle(double base, double height) {
        return (base * height) / 2;
    }

    double areaOfRectangle(double length, double width) {
        return length * width;
    }

    double areaOfSquare(double side) {
        return side * side;
    }

    double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    double perimeterOfCircle(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        mathsOperations mo = new mathsOperations();
        mo.getInputAndCalculate();
    }
}

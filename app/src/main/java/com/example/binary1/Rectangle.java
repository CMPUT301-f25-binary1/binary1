package com.example.binary1; // Ensure this package is correct

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height) {
        super(x, y); // Calls the constructor of the Shape class
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        // Formula for area of a rectangle: width * height
        return (double) width * height; // Cast to double for consistency if width/height are int
    }
}
    
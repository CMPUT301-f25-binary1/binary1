package com.example.binary1;

public class Circle extends Shape {
    private double radius;

    // Your constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Constructor from main (positioned shape)
    public Circle(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Required by Shape (if Shape declares abstract double area())
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    // Convenience method (keep if other code calls it)
    public double getArea() {
        return area();
    }

    @Override
    public String toString() {
        return "Circle{radius=" + radius + "}";
    }
}

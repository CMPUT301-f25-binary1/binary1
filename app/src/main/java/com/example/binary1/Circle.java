package com.example.binary1;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        // For now, just print (does not require MainActivity)
        System.out.println("Drawing a Circle with radius " + radius);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Optional getter
    public double getRadius() {
        return radius;
    }

    // Optional setter
    public void setRadius(double radius) {
        this.radius = radius;
    }
}

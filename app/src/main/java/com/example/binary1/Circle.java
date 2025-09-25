package com.example.binary1;

public class Circle extends Shape {
    private double radius;

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

    protected String color = "blue";
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }


    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

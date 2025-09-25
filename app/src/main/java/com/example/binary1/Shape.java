package com.example.binary1;

public abstract class Shape {
    protected int x;
    protected int y;
    protected String color = "blue";   // your branch color

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public int getY() { return y; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    // Each Shape must implement its own area calculation
    public abstract double area();
}

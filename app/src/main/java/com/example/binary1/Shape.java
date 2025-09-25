package com.example.binary1;

public abstract class Shape {
    protected int x;
    protected int y;

    // Choose one final color; adjust to match your team’s decision
    protected String color = "red";

    public Shape() { }

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public int getY() { return y; }

    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }

    // If Shape is intended to be abstract, declare area()
    public abstract double area();
}

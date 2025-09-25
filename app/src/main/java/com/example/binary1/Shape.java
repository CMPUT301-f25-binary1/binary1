package com.example.binary1;

public abstract class Shape {
    protected int x;
    protected int y;
    protected String color = "red";  // keep the team's main choice

    public Shape() { }

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }

    public abstract double area();
}

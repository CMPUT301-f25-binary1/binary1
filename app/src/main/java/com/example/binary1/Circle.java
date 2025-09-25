package com.example.binary1;

import android.graphics.drawable.shapes.Shape;

public abstract class circle extends Shape {
    private int radius;

    public circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
}
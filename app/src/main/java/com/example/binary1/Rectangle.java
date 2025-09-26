package com.example.binary1;

import android.graphics.drawable.shapes.Shape;

public abstract class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int x , int y , int width , int height){
        super();
        this.width = width;
        this.height = height;
    }
}

package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    int h;
    int b;

    public Rectangle(int h, int b){
        this.h = h;
        this.b = b;
    }

    @Override
    public double surfaceArea() {
        return h * b;
    }

    @Override
    public double circuit() {
        return 4 * b * h;
    }

}

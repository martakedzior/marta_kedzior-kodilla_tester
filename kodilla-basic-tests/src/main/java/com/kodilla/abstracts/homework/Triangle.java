package com.kodilla.abstracts.homework;

public class Triangle extends Shape {
    int a;
    int b;
    int c;
    int h;

    public Triangle(int a, int b, int c, int h){
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public double surfaceArea() {
        return 0.5 * h * a;
    }

    @Override
    public double circuit() {
        return a + b + c;
    }

}

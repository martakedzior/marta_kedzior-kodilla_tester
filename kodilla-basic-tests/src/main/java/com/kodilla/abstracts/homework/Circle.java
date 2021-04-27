package com.kodilla.abstracts.homework;

public class Circle extends Shape {
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double surfaceArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public double circuit() {
        return 2 * 3.14 * radius;
    }
}

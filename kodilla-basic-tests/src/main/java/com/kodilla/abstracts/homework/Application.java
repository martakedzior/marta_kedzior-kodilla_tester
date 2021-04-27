package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        System.out.println(circle.surfaceArea());
        System.out.println(circle.circuit());

        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println(rectangle.circuit());
        System.out.println(rectangle.surfaceArea());

        Triangle triangle = new Triangle(3, 4, 4, 5);
        triangle.surfaceArea();
        System.out.println(triangle.circuit());
        System.out.println(triangle.surfaceArea());
    }
}

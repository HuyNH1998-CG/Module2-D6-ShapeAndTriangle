package com.codegym;

public class Main {

    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        Shape shape1 = new Shape("Red", true);
        System.out.println(shape1);

        Triangle triangle = new Triangle();
        System.out.println(triangle);
        Triangle triangle1 = new Triangle(4, 13, 15);
        System.out.println(triangle1);
    }
}

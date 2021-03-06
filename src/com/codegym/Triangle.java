package com.codegym;

public class Triangle extends Shape {
    double side1 = 1.0;
    double side2 = 1.0;
    double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return this.side1;
    }

    public double getSide2() {
        return this.side2;
    }

    public double getSide3() {
        return this.side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        return (this.side1 + this.side2 + this.side3);
    }

    public double getArea() {
        double S = (this.side1 + this.side2 + this.side3) / 2;
        return Math.sqrt(S * (S - this.side1) * (S - this.side2) * (S - this.side3));
    }

    public String toString() {
        return "A Triangle with sides A=" + this.getSide1() + ", B=" + this.side2 + ", C=" + this.side3 + ", Parameter=" + this.getPerimeter() + ", Area=" + this.getArea() + ", Which is a subclass of" + super.toString();
    }

}

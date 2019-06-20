package com.taskWithShapes;

public class Rectangle extends Shape {
    private double sideA;
    private double sideB;

    public Rectangle() {
    }

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateArea() {
        double area = sideA*sideB;
        System.out.println("rectangle: "+area);
        return area;
    }
}

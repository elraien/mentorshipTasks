package com.taskWithShapes;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        double area = (base*height)/2;
        System.out.println("triangle: "+area);
        return area;
    }
}

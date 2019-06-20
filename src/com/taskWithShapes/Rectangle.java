package com.taskWithShapes;

public class Rectangle extends Shape {
    int sideA = 2;
    int sideB = 4;

    @Override
    public double calculateArea() {
        double area = sideA*sideB;
        System.out.println(area);
        return area;
    }
}

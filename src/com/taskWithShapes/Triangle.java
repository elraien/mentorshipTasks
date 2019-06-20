package com.taskWithShapes;

public class Triangle extends Shape {
    double base = 5;
    double height = 4.5;
    @Override
    public double calculateArea() {
        double area = (base*height)/2;
        System.out.println(area);
        return area;
    }
}

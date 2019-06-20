package com.taskWithShapes;

public class Circle extends Shape{
    double radius = 3;
    double pi = 3.14;
    @Override
    public double calculateArea() {
        double area = radius*radius*pi;
        System.out.println(area);
        return area;
    }
}

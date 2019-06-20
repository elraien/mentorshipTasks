package com.taskWithShapes;

public class Square extends Rectangle {
    double side = 4.5;
    @Override
    public double calculateArea() {
        double area = side*side;
        System.out.println(area);
        return area;
    }
}

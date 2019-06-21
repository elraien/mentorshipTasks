package com.taskWithShapes;

public class Circle extends Shape{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double area = radius*radius*Math.PI;
        System.out.println("circle: "+area);
        return area;
    }
}

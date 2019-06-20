package com.taskWithShapes;

public class Circle extends Shape{
    private double radius = 2.9;
   
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

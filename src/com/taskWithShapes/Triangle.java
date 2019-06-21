package com.taskWithShapes;

public class Triangle extends Square {

    private double side;
    private double side1;
    private double side2;
    private double height;

    @Override
    public double getSide() {
        return side;
    }

    @Override
    public void setSide(double side) {
        this.side = side;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        double area = (side*height)/2;
        System.out.println("triangle: "+area);
        return area;
    }
}

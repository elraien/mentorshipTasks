package com.taskWithShapes;

public class Triangle extends Shape {
    private double side;
    private double side1;
    private double side2;
    private double height;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
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

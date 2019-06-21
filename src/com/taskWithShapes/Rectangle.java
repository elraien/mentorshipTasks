package com.taskWithShapes;

public class Rectangle extends Square {

    private double side2;
    private double side1;

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    @Override
    public double calculateArea() {
        double area = side2*side1;
        System.out.println("rectangle: "+area);
        return area;
    }
}

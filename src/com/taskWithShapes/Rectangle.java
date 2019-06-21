package com.taskWithShapes;

public class Rectangle extends Square {

    private double side;
    private double side1;


    @Override
    public double getSide() {
        return side;
    }

    @Override
    public void setSide(double side) {
        this.side = side;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    @Override
    public double calculateArea() {
        double area = side*side1;
        System.out.println("rectangle: "+area);
        return area;
    }
}

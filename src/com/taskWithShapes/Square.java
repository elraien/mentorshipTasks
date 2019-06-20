package com.taskWithShapes;

public class Square extends Rectangle {

    private double side = 5;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

     @Override
    public double calculateArea() {
        double area = side*side;
        System.out.println("square: "+area);
        return area;
    }
}

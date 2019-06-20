package com.taskWithShapes;

public class Application {
    public static void main(String[] args) {
        //calculate area of a rectangle
        Rectangle rec = new Rectangle(2.3, 5);
        rec.calculateArea();

        //calculate area of a square
        Square sq = new Square();
        sq.setSide(12);
        sq.calculateArea();

        //calculate area of a circle
        Circle cir = new Circle();
        cir.setRadius(6.9);
        cir.calculateArea();

        //calculate area of a triangle
        Triangle tr = new Triangle(2.8, 1.6);
        tr.calculateArea();
    }
}

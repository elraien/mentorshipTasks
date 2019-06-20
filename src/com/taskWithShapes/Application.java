package com.taskWithShapes;

public class Application {
    public static void main(String[] args) {
        //calculate area of a rectangle
        Rectangle rec = new Rectangle();
        rec.calculateArea();

        //calculate area of a square
        Square sq = new Square();
        sq.calculateArea();

        //calculate area of a circle
        Circle cir = new Circle();
        cir.calculateArea();

        //calculate area of a triangle
        Triangle tr = new Triangle();
        tr.calculateArea();
    }
}

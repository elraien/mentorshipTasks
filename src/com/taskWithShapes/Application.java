package com.taskWithShapes;

public class Application {
    public static void main(String[] args) {
        //calculate area of a rectangle
        Rectangle rec = new Rectangle();
        rec.setSide2(7);
        rec.setSide1(5.8);
        rec.calculateArea();

        //calculate area of a square
        Square sq = new Square();
        sq.setSide(17);
        sq.calculateArea();

        //calculate area of a circle
        Circle cir = new Circle();
        cir.setRadius(6.9);
        cir.calculateArea();

        //calculate area of a triangle
        Triangle tr = new Triangle();
        tr.setHeight(2.4);
        tr.setSide(5.6);
        tr.setSide1(3.9);
        tr.setSide2(2.3);
        tr.calculateArea();
    }
}

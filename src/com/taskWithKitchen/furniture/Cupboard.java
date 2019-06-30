package com.taskWithKitchen.furniture;

public class Cupboard extends Furniture {


    @Override
    public void close() {
        System.out.println("Cupboard is now closed");
    }

    @Override
    public void open() {
        System.out.println("Cupboard is now opened");
    }

    @Override
    public void clean() {
        System.out.println("Cupboard is now clean");
    }
}

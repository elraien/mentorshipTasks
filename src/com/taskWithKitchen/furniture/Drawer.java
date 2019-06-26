package com.taskWithKitchen.furniture;

public class Drawer extends Furniture {
    @Override
    public void close() {
        System.out.println("Drawer is now closed");

    }

    @Override
    public void open() {
        System.out.println("Drawer is now opened");
    }

    @Override
    public void clean() {
        System.out.println("Drawer is now clean");
    }
}

package com.taskWithKitchen;

public class Knife extends Cutlery {
    @Override
    public void clean() {
        System.out.println("Knife is now clean");
    }

    @Override
    public void serveOnTable() {
        System.out.println("Knife is now on the table");
    }
}

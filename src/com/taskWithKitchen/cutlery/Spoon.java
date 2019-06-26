package com.taskWithKitchen.cutlery;

public class Spoon extends Cutlery {
    @Override
    public void clean() {
        System.out.println("Spoon is now clean");
    }

    @Override
    public void serveOnTable() {
        System.out.println("Spoon is now on the table");
    }
}

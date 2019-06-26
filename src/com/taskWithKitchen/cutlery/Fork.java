package com.taskWithKitchen.cutlery;

public class Fork extends Cutlery {
    @Override
    public void clean() {
        System.out.println("Fork is now clean");
    }

    @Override
    public void serveOnTable() {
        System.out.println("Fork is now on the table");
    }
}

package com.taskWithKitchen;

public abstract class Cutlery implements Cleanable, Servable{
    public abstract void clean();
    public abstract void serveOnTable();
}

package com.taskWithKitchen;

public abstract class Furniture implements Openable, Cleanable {

    public abstract void close();
    public abstract void open();
    public abstract void clean();
}

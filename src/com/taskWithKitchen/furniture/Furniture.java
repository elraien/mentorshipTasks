package com.taskWithKitchen.furniture;

import com.taskWithKitchen.Cleanable;
import com.taskWithKitchen.Openable;

public abstract class Furniture implements Openable, Cleanable {

    public boolean madeOfWood;
    public double height;
    public double width;

    public abstract void close();
    public abstract void open();
    public abstract void clean();
}

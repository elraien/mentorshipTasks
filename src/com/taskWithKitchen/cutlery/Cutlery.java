package com.taskWithKitchen.cutlery;

import com.taskWithKitchen.Cleanable;
import com.taskWithKitchen.Servable;

public abstract class Cutlery implements Cleanable, Servable {

    public boolean madeofSteel;
    public String size;
    public int count;

    public abstract void clean();
    public abstract void serveOnTable();


}

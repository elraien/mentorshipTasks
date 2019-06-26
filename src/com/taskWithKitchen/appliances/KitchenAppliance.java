package com.taskWithKitchen.appliances;

import com.taskWithKitchen.Cleanable;
import com.taskWithKitchen.Switchable;

public abstract class KitchenAppliance implements Switchable, Cleanable {

    public double height;
    public double width;

    public abstract void switchOn();
    public abstract void switchOff();
    public abstract void clean();
}

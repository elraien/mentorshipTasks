package com.taskWithKitchen;

public abstract class KitchenAppliance implements Switchable, Cleanable {
    public abstract void switchOn();
    public abstract void switchOff();
    public abstract void clean();
}

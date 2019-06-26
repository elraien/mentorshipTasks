package com.taskWithKitchen.appliances;

import com.taskWithKitchen.Openable;

public class Refrigerator extends KitchenAppliance implements Openable {
    @Override
    public void switchOn() {
        System.out.println("Refrigerator is now switched on");
    }

    @Override
    public void switchOff() {
        System.out.println("Refrigerator is now switched off");
    }

    @Override
    public void clean() {
        System.out.println("Refrigerator is now clean");
    }

    @Override
    public void open() {
        System.out.println("Refrigerator is now opened");
    }

    @Override
    public void close() {
        System.out.println("Refrigerator is now closed");
    }
}

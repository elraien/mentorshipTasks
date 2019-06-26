package com.taskWithKitchen;

public class Oven extends KitchenAppliance implements Openable, Cookable{
    @Override
    public void switchOn() {
        System.out.println("Oven is now switched on");
    }

    @Override
    public void switchOff() {
        System.out.println("Oven is now switched off");
    }

    @Override
    public void clean() {
        System.out.println("Oven is now clean");
    }

    @Override
    public void open() {
        System.out.println("Oven is now opened");
    }

    @Override
    public void close() {
        System.out.println("Oven is now closed");
    }

    @Override
    public void cook() {
        System.out.println("Oven is now being used for cooking");
    }

    @Override
    public void warmUp() {
        System.out.println("Oven is now being used for warming up food");
    }
}

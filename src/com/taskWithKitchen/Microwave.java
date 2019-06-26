package com.taskWithKitchen;

public class Microwave extends KitchenAppliance implements Openable, Cookable{
    @Override
    public void switchOn() {
        System.out.println("Microwave is now switched on");
    }

    @Override
    public void switchOff() {
        System.out.println("Microwave is now switched off");
    }

    @Override
    public void clean() {
        System.out.println("Microwave is now clean");
    }

    @Override
    public void open() {
        System.out.println("Microwave is now opened");
    }

    @Override
    public void close() {
        System.out.println("Microwave is now closed");
    }

    @Override
    public void cook() {
        System.out.println("Microwave is now being used for cooking");
    }

    @Override
    public void warmUp() {
        System.out.println("Microwave is now being used for warming up food");
    }
}

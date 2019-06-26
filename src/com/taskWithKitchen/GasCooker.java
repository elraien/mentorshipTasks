package com.taskWithKitchen;

public class GasCooker extends KitchenAppliance implements Cookable {
    @Override
    public void switchOn() {
        System.out.println("Gas Cooker is now switched on");
    }

    @Override
    public void switchOff() {
        System.out.println("Gas Cooker is now switched off");
    }

    @Override
    public void clean() {
        System.out.println("Gas Cooker is now clean");
    }

    @Override
    public void cook() {
        System.out.println("Gas Cooker is now being used for cooking");
    }

    @Override
    public void warmUp() {
        System.out.println("Gas Cooker is now being used for warming up food");
    }
}

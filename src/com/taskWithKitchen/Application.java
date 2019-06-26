package com.taskWithKitchen;

public class Application {
    public static void main(String[] args) {
        Drawer dr = new Drawer();
        dr.open();
        dr.clean();
        dr.close();

        Oven ov = new Oven();
        ov.open();
        ov.clean();
        ov.switchOn();
        ov.cook();
        ov.close();
        ov.switchOff();
    }
}

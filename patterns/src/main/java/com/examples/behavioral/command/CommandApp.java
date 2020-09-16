package com.examples.behavioral.command;

public class CommandApp {
    public static void main(String[] args) {
        Light lamp = new Light();

        Command switchOn = lamp::turnOn;
        Command switchOff = lamp::turnOff;

        Switch mySwitch = new Switch();
        mySwitch.register("on", switchOn);
        mySwitch.register("off", switchOff);
        mySwitch.execute("on");
        mySwitch.execute("off");
    }
}

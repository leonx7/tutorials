package com.examples.behavioral.command;

//The Command for turning on the light - ConcreteCommand #2
public class SwitchOnCommand implements Command {
    public final Light light;

    public SwitchOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}

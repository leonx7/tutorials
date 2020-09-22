package com.examples.structural.decorator;

public abstract class Decorator implements PrinterI {
    PrinterI component;

    public Decorator(PrinterI component) {
        this.component = component;
    }

    public void print(){
        component.print();
    }
}

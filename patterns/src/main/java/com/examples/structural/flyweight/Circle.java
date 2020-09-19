package com.examples.structural.flyweight;

public class Circle implements Shape {
    private int radius = 10;

    @Override
    public void draw(int x, int y) {
        System.out.println("(" + x + "," + y + "): drawing circle");
    }
}

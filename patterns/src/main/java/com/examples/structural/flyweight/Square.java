package com.examples.structural.flyweight;

public class Square implements Shape {
    private int side = 15;

    @Override
    public void draw(int x, int y) {
        System.out.println("(" + x + "," + y + "): drawing square");
    }
}

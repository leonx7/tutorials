package com.examples.structural.composite;

//"Leaf #1"
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing square");
    }
}

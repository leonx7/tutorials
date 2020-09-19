package com.examples.structural.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FlyweightApp {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        shapes.add(ShapeFactory.getShape("circle"));
        shapes.add(ShapeFactory.getShape("circle"));
        shapes.add(ShapeFactory.getShape("point"));
        shapes.add(ShapeFactory.getShape("square"));
        shapes.add(ShapeFactory.getShape("point"));

        Random rand = new Random();
        for (Shape shape : shapes) {
            int x = rand.nextInt(100);
            int y = rand.nextInt(100);
            shape.draw(x, y);
            System.out.println(shape);
            System.out.println(shape.hashCode());
        }

    }
}

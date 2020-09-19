package com.examples.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static final Map<String, Shape> shapes = new HashMap<>();

    public static Shape getShape(String shapeName) {
        Shape shape = shapes.get(shapeName);
        if (shape == null) {
            switch (shapeName) {
                case "point" -> shape = new Point();
                case "circle" -> shape = new Circle();
                case "square" -> shape = new Square();
            }
            shapes.put(shapeName, shape);
        }
        return shape;
    }
}

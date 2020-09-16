package com.examples.fundamental.delegate;

public class DelegateApp {
    public static void main(String[] args) {
        Painter painter = new Painter();
        painter.setGraphics(new Square());
        painter.draw();
        painter.setGraphics(new Triangle());
        painter.draw();
        painter.setGraphics(new Circle());
        painter.draw();

    }
}

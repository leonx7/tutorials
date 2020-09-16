package com.examples.fundamental.delegate;

public class Painter {
    Graphic graphic;

    public void setGraphics(Graphic graphic) {
        this.graphic = graphic;
    }

    public void draw() {
        graphic.draw();
    }
}

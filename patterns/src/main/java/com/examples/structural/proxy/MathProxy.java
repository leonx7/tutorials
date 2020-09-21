package com.examples.structural.proxy;

public class MathProxy implements IMath {
    Math math;

    @Override
    public double add(double x, double y) {
        lazyInitMath();
        return math.add(x, y);
    }

    @Override
    public double sub(double x, double y) {
        lazyInitMath();
        return math.sub(x, y);
    }

    @Override
    public double mul(double x, double y) {
        lazyInitMath();
        return math.mul(x, y);
    }

    @Override
    public double div(double x, double y) {
        lazyInitMath();
        return math.div(x, y);
    }

    private void lazyInitMath() {
        if (math == null) {
            math = new Math();
        }
    }
}

package com.examples.structural.interpreter;

public class InterpreterApp {
    public static void main(String[] args) {
        Context context = new Context();
        Expression expr = context.evaluate("1+3+3");
        System.out.println(expr.interpret());
    }
}

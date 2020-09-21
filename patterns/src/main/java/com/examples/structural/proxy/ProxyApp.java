package com.examples.structural.proxy;

public class ProxyApp {
    public static void main(String[] args) {
        IMath proxy = new MathProxy();
        System.out.println(proxy.add(5, 6));
        System.out.println(proxy.sub(10, 5));
        System.out.println(proxy.mul(4, 4.5));
        System.out.println(proxy.div(12, 3));
    }
}

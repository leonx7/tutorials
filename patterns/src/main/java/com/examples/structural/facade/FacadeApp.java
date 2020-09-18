package com.examples.structural.facade;

//Client
public class FacadeApp {
    public static void main(String[] args) {
        OrderHandling orderHandling = new OrderHandling();
        orderHandling.execute();
    }
}

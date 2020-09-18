package com.examples.structural.facade;

//Facade
public class OrderHandling {
    private SalesManager salesManager = new SalesManager();
    private Store store = new Store();
    private Courier courier = new Courier();

    public void execute() {
        salesManager.handleOrder();
        store.prepareItem();
        courier.deliver();
    }
}

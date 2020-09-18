package com.examples.creational.abstractfactory;

import com.examples.creational.abstractfactory.factories.AbstractFactory;
import com.examples.creational.abstractfactory.factories.AirTransportFactory;
import com.examples.creational.abstractfactory.factories.LandTransportFactory;
import com.examples.creational.abstractfactory.factories.SeaTransportFactory;
import com.examples.creational.abstractfactory.transport.AirTransport;
import com.examples.creational.abstractfactory.transport.LandTransport;
import com.examples.creational.abstractfactory.transport.SeaTransport;

public class AbstractFactoryApp {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = FactoryProvider.getFactory("land");
        AbstractFactory abstractFactory2 = FactoryProvider.getFactory("air");
        AbstractFactory abstractFactory3 = FactoryProvider.getFactory("sea");

        if (abstractFactory instanceof LandTransportFactory) {
            LandTransport landTransport = (LandTransport) abstractFactory.create("truck");
            LandTransport landTransport2 = (LandTransport) abstractFactory.create("train");
            landTransport.go();
            landTransport2.go();
        }
        if (abstractFactory2 instanceof AirTransportFactory) {
            AirTransport airTransport = (AirTransport) abstractFactory2.create("plane");
            AirTransport airTransport2 = (AirTransport) abstractFactory2.create("helicopter");
            airTransport.fly();
            airTransport2.fly();
        }
        if (abstractFactory3 instanceof SeaTransportFactory) {
            SeaTransport seaTransport = (SeaTransport) abstractFactory3.create("ship");
            SeaTransport seaTransport2 = (SeaTransport) abstractFactory3.create("submarine");
            seaTransport.sail();
            seaTransport2.sail();
        }
    }
}


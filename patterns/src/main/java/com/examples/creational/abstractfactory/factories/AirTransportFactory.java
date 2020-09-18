package com.examples.creational.abstractfactory.factories;

import com.examples.creational.abstractfactory.transport.AirTransport;
import com.examples.creational.abstractfactory.transport.Helicopter;
import com.examples.creational.abstractfactory.transport.Plane;

public class AirTransportFactory implements AbstractFactory<AirTransport> {

    @Override
    public AirTransport create(String transportType) {
        if(transportType.equalsIgnoreCase("plane")){
            return new Plane();
        }
        else if(transportType.equalsIgnoreCase("helicopter")){
            return new Helicopter();
        }
        return null;
    }
}

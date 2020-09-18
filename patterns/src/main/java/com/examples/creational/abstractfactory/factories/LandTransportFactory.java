package com.examples.creational.abstractfactory.factories;

import com.examples.creational.abstractfactory.transport.LandTransport;
import com.examples.creational.abstractfactory.transport.Train;
import com.examples.creational.abstractfactory.transport.Truck;

public class LandTransportFactory implements AbstractFactory<LandTransport> {

    @Override
    public LandTransport create(String transportType) {
        if(transportType.equalsIgnoreCase("truck")){
            return new Truck();
        }
        else if(transportType.equalsIgnoreCase("train")){
            return new Train();
        }
        return null;
    }
}

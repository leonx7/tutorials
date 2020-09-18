package com.examples.creational.abstractfactory.factories;

import com.examples.creational.abstractfactory.transport.SeaTransport;
import com.examples.creational.abstractfactory.transport.Ship;
import com.examples.creational.abstractfactory.transport.Submarine;

public class SeaTransportFactory implements AbstractFactory<SeaTransport> {

    @Override
    public SeaTransport create(String transportType) {
        if(transportType.equalsIgnoreCase("ship")){
            return new Ship();
        }
        else if(transportType.equalsIgnoreCase("submarine")){
            return new Submarine();
        }
        return null;
    }
}

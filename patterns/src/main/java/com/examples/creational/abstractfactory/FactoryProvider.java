package com.examples.creational.abstractfactory;

import com.examples.creational.abstractfactory.factories.AbstractFactory;
import com.examples.creational.abstractfactory.factories.AirTransportFactory;
import com.examples.creational.abstractfactory.factories.LandTransportFactory;
import com.examples.creational.abstractfactory.factories.SeaTransportFactory;

public class FactoryProvider {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("sea")){
            return new SeaTransportFactory();
        }
        else if (choice.equalsIgnoreCase("land")){
            return new LandTransportFactory();
        }
        else if(choice.equalsIgnoreCase("air")){
            return new AirTransportFactory();
        }
        else
            throw new RuntimeException("This way of transportation is not supported");
    }
}

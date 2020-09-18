package com.examples.creational.abstractfactory.factories;

public interface AbstractFactory<T> {
    T create(String transportType);
}

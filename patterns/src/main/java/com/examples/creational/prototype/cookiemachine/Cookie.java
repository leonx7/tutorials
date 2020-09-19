package com.examples.creational.prototype.cookiemachine;

//Prototype Class
public abstract class Cookie implements Cloneable {
    protected int weight;

    @Override
    protected Cookie clone() throws CloneNotSupportedException {
        return (Cookie) super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Cookie)) return false;
        Cookie cookie = (Cookie) obj;
        return weight == cookie.weight;
    }
}

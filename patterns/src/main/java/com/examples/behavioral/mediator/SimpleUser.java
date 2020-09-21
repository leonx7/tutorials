package com.examples.behavioral.mediator;

public class SimpleUser extends User {
    public SimpleUser(Chat chat, String name) {
        super(chat, name);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("User " + getName() + " got message: '" + message + "'");
    }
}

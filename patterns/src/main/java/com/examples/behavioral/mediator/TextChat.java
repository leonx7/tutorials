package com.examples.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

//Concrete mediator
public class TextChat implements Chat {
    User admin;
    List<User> users = new ArrayList<>();

    public void setAdmin(User admin) {
        if (admin instanceof Admin) {
            this.admin = admin;
        } else {
            throw new RuntimeException("Lack of rights");
        }
    }

    public void addUser(User user) {
        if (admin == null) {
            throw new RuntimeException("There is no admin in the chat");
        }
        if (user instanceof SimpleUser) {
            users.add(user);
        } else {
            throw new RuntimeException("Admin can not go into another chat");
        }
    }

    @Override
    public void sendMessage(String message, User user) {
        if (user instanceof Admin) {
            for (User u : users) {
                u.getMessage(user.getName() + ": " + message);
            }
        }
        if (user instanceof SimpleUser) {
            for (User u : users) {
                if (u != user && u.isEnabled) {
                    u.getMessage(user.getName() + ": " + message);
                }
            }
            if (admin.isEnabled) {
                admin.getMessage(user.getName() + ": " + message);
            }
        }
    }
}

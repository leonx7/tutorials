package com.examples.behavioral.mediator;

public class MediatorApp {
    public static void main(String[] args) {
        TextChat chat = new TextChat();

        Admin admin = new Admin(chat, "Vitaliy Ivanovich");
        User user1 = new SimpleUser(chat, "Igor");
        User user2 = new SimpleUser(chat, "Oleg");
        User user3 = new SimpleUser(chat, "Pasha");

        chat.setAdmin(admin);
        chat.addUser(user1);
        chat.addUser(user2);
        chat.addUser(user3);
        user2.setEnabled(false);
        user1.sendMessage("Hello!");
        admin.sendMessage("Admin is always right");
    }
}

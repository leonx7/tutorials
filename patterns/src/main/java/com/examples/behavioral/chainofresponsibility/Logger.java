package com.examples.behavioral.chainofresponsibility;

//Abstract handler
public abstract class Logger {
    public static final int ERROR = 1;
    public static final int DEBUG = 2;
    public static final int INFO = 3;

    int priority;
    Logger next;

    public Logger(int priority) {
        this.priority = priority;
    }

    public void setNext(Logger next) {
        this.next = next;
    }

    public void writeMessage(String message, int priority) {
        if (this.priority <= priority) {
            write(message);
        }
        if (next != null) {
            next.writeMessage(message, priority);
        }
    }

    abstract void write(String message);
}

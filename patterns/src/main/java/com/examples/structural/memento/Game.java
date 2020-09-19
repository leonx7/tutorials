package com.examples.structural.memento;

//Originator
public class Game {
    private String level;
    private int ms;

    public void set(String level, int ms) {
        this.level = level;
        this.ms = ms;
    }

    public Save save() {
        return new Save(level, ms);
    }

    public void restore(Save save) {
        this.level = save.getLevel();
        this.ms = save.getMs();
    }

    @Override
    public String toString() {
        return "Game {level = " + level + ", " + "ms = " + ms + "}";
    }
}

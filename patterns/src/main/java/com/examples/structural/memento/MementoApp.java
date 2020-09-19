package com.examples.structural.memento;

//Client
public class MementoApp {
    public static void main(String[] args) {
        Game game = new Game();
        game.set("LVL 1", 40000);
        System.out.println(game);

        Save save = game.save();
        File file = new File();
        file.setSave(save);

        game.set("LVL 2", 70000);
        System.out.println(game);

        game.restore(file.getSave());
        System.out.println(game);
    }
}

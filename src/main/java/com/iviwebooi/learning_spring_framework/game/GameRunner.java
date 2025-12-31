package com.iviwebooi.learning_spring_framework.game;

public class GameRunner{
    private final Game game;
    public GameRunner(Game game) {
        this.game = game;
    }

    public void run(){
        game.start();
        game.up();
        game.down();
        game.left();
        game.right();
    }

}

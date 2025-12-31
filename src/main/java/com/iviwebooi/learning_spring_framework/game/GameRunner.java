package com.iviwebooi.learning_spring_framework.game;

public class GameRunner {
    MarioGame marioGame;
    public GameRunner(MarioGame marioGame) {
        this.marioGame = marioGame;
    }

    public void run(){
        System.out.println("Mario Game Started");
        marioGame.up();
        marioGame.down();
        marioGame.left();
        marioGame.right();
    }

}

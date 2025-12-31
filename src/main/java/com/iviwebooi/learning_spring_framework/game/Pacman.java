package com.iviwebooi.learning_spring_framework.game;

public class Pacman implements Game {

    @Override
    public void start() {
        System.out.println("Pacman Game Started");
    }

    @Override
    public void up() {
        System.out.println("up");
    }

    @Override
    public void down() {
        System.out.println("down");
    }

    @Override
    public void left() {
        System.out.println("left");
    }

    @Override
    public void right() {
        System.out.println("right");
    }
}

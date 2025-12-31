package com.iviwebooi.learning_spring_framework.game;

public class SuperContra implements Game{

    @Override
    public void start(){
        System.out.println("SuperContra Game Started");
    }

    @Override
    public void up() {
        System.out.println("Going Up");
    }

    @Override
    public void down() {
        System.out.println("Ducking down");
    }

    @Override
    public void left() {
        System.out.println("Going left");
    }

    @Override
    public void right() {
        System.out.println("Shooting");
    }
}

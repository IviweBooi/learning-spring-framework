package com.iviwebooi.learning_spring_framework;

import com.iviwebooi.learning_spring_framework.game.GameRunner;
import com.iviwebooi.learning_spring_framework.game.MarioGame;
import com.iviwebooi.learning_spring_framework.game.Pacman;
import com.iviwebooi.learning_spring_framework.game.SuperContra;

public class LearningSpringFrameworkApplication {

	public static void main(String[] args) {

        var marioGame = new MarioGame();
        var superContra = new SuperContra();
        var pacman = new Pacman();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
        System.out.println();
        gameRunner = new GameRunner(superContra);
        gameRunner.run();
        System.out.println();
        gameRunner = new GameRunner(pacman);
        gameRunner.run();
	}

}

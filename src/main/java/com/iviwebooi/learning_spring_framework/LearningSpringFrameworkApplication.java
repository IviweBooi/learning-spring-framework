package com.iviwebooi.learning_spring_framework;

import com.iviwebooi.learning_spring_framework.game.GameRunner;
import com.iviwebooi.learning_spring_framework.game.MarioGame;

public class LearningSpringFrameworkApplication {

	public static void main(String[] args) {

        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
	}

}

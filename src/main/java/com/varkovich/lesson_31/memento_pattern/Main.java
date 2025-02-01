package com.varkovich.lesson_31.memento_pattern;

import com.varkovich.lesson_31.memento_pattern.exception.NotFoundGameLevelMementoException;
import com.varkovich.lesson_31.memento_pattern.model.GameLevel;
import com.varkovich.lesson_31.memento_pattern.operation.GameLevelOperation;
import com.varkovich.lesson_31.memento_pattern.service.GameLogicService;

/**
 * Паттерн проектирование memento (снимок), позволяет сохранять состояние объекта,
 * и вернуть его при необходимости.
 */
public class Main {

    public static void main(String[] args) {
        GameLevel gameLevel = new GameLevel(1, "Dungeon", 100);

        //Playing
        GameLogicService.play();

        System.out.println(gameLevel);

        //Saving game Level
        GameLevelOperation.saveGameLevel(gameLevel);

        //Playing
        GameLogicService.play();

        gameLevel.setLevel(2);
        gameLevel.setLevelName("Arena");
        gameLevel.setScore(200);

        System.out.println(gameLevel);

        //Restoring game level
        try {
            gameLevel = GameLevelOperation.restoreGameLevel(0);

            System.out.println(gameLevel);
        } catch (NotFoundGameLevelMementoException e) {
            throw new RuntimeException(e);
        }
    }
}

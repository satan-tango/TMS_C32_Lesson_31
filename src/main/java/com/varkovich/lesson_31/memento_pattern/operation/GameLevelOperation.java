package com.varkovich.lesson_31.memento_pattern.operation;

import com.varkovich.lesson_31.memento_pattern.exception.NotFoundGameLevelMementoException;
import com.varkovich.lesson_31.memento_pattern.model.GameLevel;
import com.varkovich.lesson_31.memento_pattern.momento.GameLevelMemento;
import com.varkovich.lesson_31.memento_pattern.storage.MockStorage;

public class GameLevelOperation {

    public static GameLevel restoreGameLevel(int index) throws NotFoundGameLevelMementoException {
        GameLevelMemento gameLevelMemento = MockStorage.getGameLevelMemento(index);

        if (gameLevelMemento != null) {
            return new GameLevel(gameLevelMemento.getLevel(), gameLevelMemento.getLevelName(), gameLevelMemento.getScore(), gameLevelMemento.getDate());
        } else {
            throw new NotFoundGameLevelMementoException("Game level memento has not been found", "655");
        }
    }

    public static void saveGameLevel(GameLevel gameLevel) {
        GameLevelMemento gameLevelMemento = new GameLevelMemento(gameLevel.getLevel(), gameLevel.getLevelName(), gameLevel.getScore());

        MockStorage.addGameLevelMemento(gameLevelMemento);
    }

}

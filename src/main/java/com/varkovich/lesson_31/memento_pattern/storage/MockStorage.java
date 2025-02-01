package com.varkovich.lesson_31.memento_pattern.storage;

import com.varkovich.lesson_31.memento_pattern.momento.GameLevelMemento;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MockStorage {

    private static final List<GameLevelMemento> gameLevelStorage;

    static {
        gameLevelStorage = new ArrayList<>();
    }

    public static GameLevelMemento getGameLevelMemento(int index) {
        if (index >= 0 && index < gameLevelStorage.size()) {
            return gameLevelStorage.get(index);
        } else {
            return null;
        }
    }

    public static void addGameLevelMemento(GameLevelMemento gameLevelMemento) {
        gameLevelStorage.add(gameLevelMemento);
    }
}

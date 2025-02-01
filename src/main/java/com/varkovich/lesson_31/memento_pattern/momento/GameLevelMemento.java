package com.varkovich.lesson_31.memento_pattern.momento;

import java.util.Date;
import java.util.Objects;

public class GameLevelMemento {

    private int level;

    private String levelName;

    private int score;

    private Date date;

    public GameLevelMemento(int level, String levelName, int score) {
        this.level = level;
        this.levelName = levelName;
        this.score = score;
        date = new Date();
    }

    public int getLevel() {
        return level;
    }

    public String getLevelName() {
        return levelName;
    }

    public int getScore() {
        return score;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        GameLevelMemento that = (GameLevelMemento) o;
        return level == that.level && score == that.score && Objects.equals(levelName, that.levelName) && Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(level, levelName, score, date);
    }
}

package com.varkovich.lesson_31.memento_pattern.model;

import java.util.Date;
import java.util.Objects;

public class GameLevel {

    private int level;

    private String levelName;

    private int score;

    private Date date;

    public GameLevel(int level, String levelName, int score) {
        this.level = level;
        this.levelName = levelName;
        this.score = score;
        date = new Date();
    }

    public GameLevel(int level, String levelName, int score, Date date) {
        this.level = level;
        this.levelName = levelName;
        this.score = score;
        this.date = date;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        GameLevel gameLevel = (GameLevel) o;
        return level == gameLevel.level && score == gameLevel.score && Objects.equals(levelName, gameLevel.levelName) && Objects.equals(date, gameLevel.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(level, levelName, score, date);
    }

    @Override
    public String toString() {
        return "GameLevel{" +
                "level=" + level +
                ", levelName='" + levelName + '\'' +
                ", score=" + score +
                '}';
    }
}

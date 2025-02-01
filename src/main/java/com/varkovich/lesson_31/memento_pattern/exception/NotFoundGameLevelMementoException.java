package com.varkovich.lesson_31.memento_pattern.exception;

public class NotFoundGameLevelMementoException extends Exception {

    private String code;

    public NotFoundGameLevelMementoException(String message, String code) {
        super(message);
        this.code = code;
    }
}

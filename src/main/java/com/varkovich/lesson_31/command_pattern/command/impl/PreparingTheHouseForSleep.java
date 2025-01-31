package com.varkovich.lesson_31.command_pattern.command.impl;

import com.varkovich.lesson_31.command_pattern.command.Command;
import com.varkovich.lesson_31.command_pattern.home_operations.HomeOperations;

public class PreparingTheHouseForSleep implements Command {

    private final HomeOperations home;

    public PreparingTheHouseForSleep(HomeOperations home) {
        this.home = home;
    }

    @Override
    public void execute() {
        home.turnOffLight();
        home.turnOffCurtains();
    }
}

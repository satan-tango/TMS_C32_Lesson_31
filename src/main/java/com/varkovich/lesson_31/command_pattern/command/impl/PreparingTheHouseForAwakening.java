package com.varkovich.lesson_31.command_pattern.command.impl;

import com.varkovich.lesson_31.command_pattern.command.Command;
import com.varkovich.lesson_31.command_pattern.home_operations.HomeOperations;

public class PreparingTheHouseForAwakening implements Command {

    private final HomeOperations home;

    public PreparingTheHouseForAwakening(HomeOperations home) {
        this.home = home;
    }

    @Override
    public void execute() {
        home.turnOnAlarm();
        home.turnOnLight();
        home.turnOnCurtains();
        home.turnOnCoffeeMachine();
        home.makeBreakfast();
    }
}

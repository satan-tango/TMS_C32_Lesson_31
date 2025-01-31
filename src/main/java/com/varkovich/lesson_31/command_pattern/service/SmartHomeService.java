package com.varkovich.lesson_31.command_pattern.service;

import com.varkovich.lesson_31.command_pattern.command.Command;
import com.varkovich.lesson_31.command_pattern.command.impl.PreparingTheHouseForAwakening;
import com.varkovich.lesson_31.command_pattern.command.impl.PreparingTheHouseForSleep;

public class SmartHomeService {
    private final Command preparingTheHouseForAwakening;

    private final Command preparingTheHouseForSleep;

    public SmartHomeService(Command preparingTheHouseForAwakening, Command preparingTheHouseForSleep) {
        this.preparingTheHouseForAwakening = preparingTheHouseForAwakening;
        this.preparingTheHouseForSleep = preparingTheHouseForSleep;
    }

    public void prepareTheHouseForAwakening() {
        preparingTheHouseForAwakening.execute();
    }

    public void prepareTheHouseForSleep() {
        preparingTheHouseForSleep.execute();
    }
}

package com.varkovich.lesson_31.command_pattern;

import com.varkovich.lesson_31.command_pattern.command.Command;
import com.varkovich.lesson_31.command_pattern.command.impl.PreparingTheHouseForAwakening;
import com.varkovich.lesson_31.command_pattern.command.impl.PreparingTheHouseForSleep;
import com.varkovich.lesson_31.command_pattern.home_operations.HomeOperations;
import com.varkovich.lesson_31.command_pattern.service.SmartHomeService;

/**
 * Необходимо разработать программу, которая использует паттерн проектирования "Команда"
 * для управления некоторыми действиями в системе "Умный дом". В качестве примера можно
 * рассмотреть управление устройствами такими как свет, вентиляторы или другие бытовые приборы.
 */
public class Main {

    public static void main(String[] args) {
        Command preparingTheHouseForAwakening = new PreparingTheHouseForAwakening(new HomeOperations());
        Command preparingTheHouseForSleep = new PreparingTheHouseForSleep(new HomeOperations());

        SmartHomeService smartHouse = new SmartHomeService(preparingTheHouseForAwakening, preparingTheHouseForSleep);

        smartHouse.prepareTheHouseForAwakening();
        smartHouse.prepareTheHouseForSleep();
    }
}

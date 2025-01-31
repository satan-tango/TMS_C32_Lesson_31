package com.varkovich.lesson_31.strategy_pattern.strategy.impl;

import com.varkovich.lesson_31.strategy_pattern.constant.Constant;
import com.varkovich.lesson_31.strategy_pattern.strategy.DiscountStrategy;

public class PercentDiscount implements DiscountStrategy {

    @Override
    public double computePriceWithDiscount(double price) {
        return price * Constant.PERCENT_DISCOUNT / 100;
    }
}

package com.varkovich.lesson_31.strategy_pattern.strategy.impl;

import com.varkovich.lesson_31.strategy_pattern.constant.Constant;
import com.varkovich.lesson_31.strategy_pattern.strategy.DiscountStrategy;

public class FixedDiscount implements DiscountStrategy {

    @Override
    public double computePriceWithDiscount(double price) {
        return Constant.FIXED_DISCOUNT;
    }
}

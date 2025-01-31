package com.varkovich.lesson_31.strategy_pattern.service;

import com.varkovich.lesson_31.strategy_pattern.constant.Constant;
import com.varkovich.lesson_31.strategy_pattern.strategy.DiscountStrategy;

public class PriceCalculationService {

    public double calculatePrice(DiscountStrategy discountStrategy, double price) {
        return price - discountStrategy.computePriceWithDiscount(price) <= 0 ? 0.02 : price - discountStrategy.computePriceWithDiscount(price);
    }
}

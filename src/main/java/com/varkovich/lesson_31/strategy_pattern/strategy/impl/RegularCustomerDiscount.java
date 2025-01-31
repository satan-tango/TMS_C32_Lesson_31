package com.varkovich.lesson_31.strategy_pattern.strategy.impl;

import com.varkovich.lesson_31.strategy_pattern.constant.Constant;
import com.varkovich.lesson_31.strategy_pattern.strategy.DiscountStrategy;

public class RegularCustomerDiscount implements DiscountStrategy {

    private int yearsWithUs;

    public RegularCustomerDiscount(int yearsWithUs) {
        this.yearsWithUs = yearsWithUs;
    }

    @Override
    public double computePriceWithDiscount(double price) {
        return price * (yearsWithUs + Constant.REGULAR_CUSTOMER_PERCENT_DISCOUNT) / 100;
    }
}

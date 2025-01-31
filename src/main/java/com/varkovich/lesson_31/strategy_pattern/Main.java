package com.varkovich.lesson_31.strategy_pattern;

import com.varkovich.lesson_31.strategy_pattern.service.PriceCalculationService;
import com.varkovich.lesson_31.strategy_pattern.strategy.DiscountStrategy;
import com.varkovich.lesson_31.strategy_pattern.strategy.impl.FixedDiscount;
import com.varkovich.lesson_31.strategy_pattern.strategy.impl.PercentDiscount;
import com.varkovich.lesson_31.strategy_pattern.strategy.impl.RegularCustomerDiscount;

/**
 * Создайте приложение для расчета цен на товары с использованием различных стратегий скидок. Например, реализуйте:
 * Фиксированную скидку
 * Процентную скидку
 * Скидку для постоянных клиентов
 * Реализуйте класс с возможностью выбора стратегии и применения ее при расчете стоймости. Результат применения
 * разных стратегия продемонстрируйте в Main
 */
public class Main {

    public static void main(String[] args) {
        DiscountStrategy fixedDiscount = new FixedDiscount();
        DiscountStrategy percentDiscount = new PercentDiscount();
        DiscountStrategy regularCustomerDiscount = new RegularCustomerDiscount(5);
        PriceCalculationService priceCalculationService = new PriceCalculationService();

        double price = 245.23;
        double p = priceCalculationService.calculatePrice(fixedDiscount, price);

        System.out.printf("Casual price -> %.2f, price with fixed discount -> %.2f\n", price, priceCalculationService.calculatePrice(fixedDiscount, price));
        System.out.printf("Casual price -> %.2f, price with percent discount -> %.2f\n", price, priceCalculationService.calculatePrice(percentDiscount, price));
        System.out.printf("Casual price -> %.2f, price with regular customer discount -> %.2f", price, priceCalculationService.calculatePrice(regularCustomerDiscount, price));

    }
}

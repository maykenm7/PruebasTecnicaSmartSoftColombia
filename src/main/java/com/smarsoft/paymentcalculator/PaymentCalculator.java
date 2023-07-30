package com.smarsoft.paymentcalculator;

import java.util.ArrayList;
import java.util.List;

public class PaymentCalculator {

    public List<Integer> calculateDaysToPayDebts(List<Integer> debts) {
        List<Integer> daysToPayDebts = new ArrayList<>();

        for (int debt : debts) {
            int days = calculateDaysToPayDebt(debt);
            daysToPayDebts.add(days);
        }

        return daysToPayDebts;
    }

    public int calculateDaysToPayDebt(int initialDebt) {
        int currentDebt = initialDebt;
        int days = 0;
        int payment = 1;

        while (currentDebt > 0) {
            if (currentDebt >= payment) {
                currentDebt -= payment;
                payment *= 2;
            } else {
                payment = currentDebt;
                currentDebt = 0;
            }
            days++;
        }
        return days;
    }

}
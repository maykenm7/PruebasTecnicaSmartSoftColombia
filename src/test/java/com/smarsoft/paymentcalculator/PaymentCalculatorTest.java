package com.smarsoft.paymentcalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class PaymentCalculatorTest {
    private PaymentCalculator paymentCalculator = new PaymentCalculator();

    @Test
    public void calculateDaysToPayDebt_shouldReturnDaysToPay_case3() {
        //Arrange
        int initialDebt = 3;
        //Action
        int result = paymentCalculator.calculateDaysToPayDebt(initialDebt);
        //Assert
        Assertions.assertEquals(2,result);
    }
    @Test
    public void calculateDaysToPayDebt_shouldReturnDaysToPay_case15() {
        //Arrange
        int initialDebt = 15;
        //Action
        int result = paymentCalculator.calculateDaysToPayDebt(initialDebt);
        //Assert
        Assertions.assertEquals(4,result);
    }
    @Test
    public void calculateDaysToPayDebt_shouldReturnDaysToPay_case16() {
        //Arrange
        int initialDebt = 16;
        //Action
        int result = paymentCalculator.calculateDaysToPayDebt(initialDebt);
        //Assert
        Assertions.assertEquals(5,result);
    }
    @Test
    public void calculateDaysToPayDebt_shouldReturnDaysToPay_case45() {
        //Arrange
        int initialDebt = 45;
        //Action
        int result = paymentCalculator.calculateDaysToPayDebt(initialDebt);
        //Assert
        Assertions.assertEquals(6,result);
    }

    @Test
    public void calculateDaysToPayDebts_shouldReturnDaysToPay() {
        //Arrange
        List<Integer> debts = Arrays.asList(3,15,16,45);
        List<Integer> expected = Arrays.asList(2,4,5,6);
        //Action
        List<Integer>  result = paymentCalculator.calculateDaysToPayDebts(debts);
        //Assert
        Assertions.assertEquals(expected, result);
    }
}

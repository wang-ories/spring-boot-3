package com.ories.coffee;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    @DisplayName("Two Plus two")
    void twoPlusTwoShouldReturnFour() {
        var calculator = new SimpleCalculator();
        var expected = 4;

        var result = calculator.add(2,2);

        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Five Plus three")
    void fivePlusThreeShouldReturnEight() {
        var calculator = new SimpleCalculator();
        var expected = 8;

        var result = calculator.add(5,3);

        assertEquals(expected, result);
    }


}



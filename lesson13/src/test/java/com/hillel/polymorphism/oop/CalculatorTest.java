package com.hillel.polymorphism.oop;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

public class CalculatorTest {

    @Test
    public void calculateTest() {
        Calculator calculator = new Calculator();
        int result = calculator.calculate(3, 5, "*");
        assertThat(result, is(15));
    }

    @Test
    public void calculateDivisionTest() {
        Calculator calculator = new Calculator();
        Integer result = calculator.calculate(5, 5, "/");
        assertThat(result, is(nullValue()));
    }
}

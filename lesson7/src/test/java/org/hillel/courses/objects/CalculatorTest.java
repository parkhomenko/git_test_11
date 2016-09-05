package org.hillel.courses.objects;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class CalculatorTest {

    Calculator calculator;

    @Before
    public void setUp() {
        System.out.println("before");
        calculator = new Calculator(10, 7, "Casio");
    }

    @Test
    public void additionTest() {
        System.out.println("addition test");
        int result = calculator.addition();
        //assertEquals(10, result);
        assertThat(result, is(17));
        //assertThat(result, not(5));
    }

    @Test
    public void subtractionTest() {
        System.out.println("subtraction test");
        int result = calculator.subtraction();
        //assertEquals(10, result);
        assertThat(result, is(3));
        //assertThat(result, not(5));
    }

    @After
    public void tearDown() {
        System.out.println("after");
    }
}

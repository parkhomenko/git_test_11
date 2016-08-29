package org.hillel.courses.calc;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {
        int operand1 = 3;
        int operand2 = 5;
        int expectedResult = 8;
        int actualResult = Calculator.addition(operand1, operand2);

        assertEquals("The result was wrong", expectedResult, actualResult);
    }

    @Test
    public void testSubtraction() {
        int operand1 = 10;
        int operand2 = 4;

        int actualResult = Calculator.subtraction(operand1, operand2);

        assertEquals("The result was wrong", 6, actualResult);
    }
}

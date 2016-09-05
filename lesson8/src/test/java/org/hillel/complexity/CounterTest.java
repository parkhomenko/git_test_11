package org.hillel.complexity;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CounterTest {

    Counter counter;

    @Before
    public void setUp() {
        counter = new Counter(100);
    }

    @Test
    public void countInCycleTest() {
        assertThat(counter.countInCycle(), is(5050));
    }

    @Test
    public void countByFormulaTest() {
        assertThat(counter.countByFormula(), is(5050));
    }

}

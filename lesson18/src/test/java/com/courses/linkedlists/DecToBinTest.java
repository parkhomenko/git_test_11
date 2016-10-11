package com.courses.linkedlists;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class DecToBinTest {

    @Test
    public void test() {
        int number = 35;
        String result = "100011";

        assertThat(new StackMain().decToBin(number), is(result));
    }
}

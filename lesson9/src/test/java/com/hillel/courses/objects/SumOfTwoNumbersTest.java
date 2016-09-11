package com.hillel.courses.objects;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SumOfTwoNumbersTest {

    SumOfTwoNumbers sumOfTwoNumbers;
    int[] array;
    int sum;

    @Before
    public void setUp() {
        array = new int[] {1, 3, 6, 9, 12};
        sum = 5;
        sumOfTwoNumbers = new SumOfTwoNumbers();
    }

    @Test
    public void bruteForceTest() {
        boolean result = sumOfTwoNumbers.bruteForceOption(array, sum);

        assertThat(result, is(false));
    }

    @Test
    public void linearTest() {
        boolean result = sumOfTwoNumbers.linearOption(array, sum);

        assertThat(result, is(false));
    }

    @Test
    public void binarySearch() {
        int[] array = new int[]{2, 5, 6, 8, 10};
        int element = 5;

        int index = sumOfTwoNumbers.binarySearch(array, element);

        assertThat(index, is(1));
    }

    @Test
    public void binarySearch1() {
        int[] array = new int[]{2, 5, 6, 8, 10};
        int element = 6;

        int index = sumOfTwoNumbers.binarySearch(array, element);

        assertThat(index, is(2));
    }

    @Test
    public void binarySearch2() {
        int[] array = new int[]{2, 5, 6, 8, 10};
        int element = 11;

        int index = sumOfTwoNumbers.binarySearch(array, element);

        assertThat(index, is(-1));
    }

    @Test
    public void binarySearch3() {
        int[] array = new int[]{2, 5, 6, 8, 10};
        int element = 10;

        int index = sumOfTwoNumbers.binarySearch(array, element);

        assertThat(index, is(4));
    }


}

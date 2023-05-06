package com.in28minutes.junit.helper.JunitCourse;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArraysCompareTest {

    @Test
    public void testArraySort()
    {
        int[] numbers = {12, 3, 4, 1};
        int[] expected = {1, 3, 4, 12};

        Arrays.sort(numbers);

        assertArrayEquals(numbers , expected);
    }

}

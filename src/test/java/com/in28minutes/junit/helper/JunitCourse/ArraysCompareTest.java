package com.in28minutes.junit.helper.JunitCourse;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArraysCompareTest {

    @Test
    public void testArraySort_RandomArray()
    {
        int[] numbers = {12, 3, 4, 1};
        int[] expected = {1, 3, 4, 12};

        Arrays.sort(numbers);

        assertArrayEquals(numbers , expected);
    }

//    @Test(NullPointerException.class)
//    public void testArraySort_NullArray() {
//
//        int[] numbers = {};
//        Arrays.sort(numbers);
//    }

    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    public void testSort_Performance()
    {
        int array[] = {12, 23, 4};
        for(int i=1;i<=1000000;i++)
        {
            array[0] = i;
            Arrays.sort(array);
        }
    }

}

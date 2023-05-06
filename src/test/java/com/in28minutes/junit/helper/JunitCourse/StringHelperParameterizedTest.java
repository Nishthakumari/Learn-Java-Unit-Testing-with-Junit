package com.in28minutes.junit.helper.JunitCourse;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;


public class StringHelperParameterizedTest {

    StringHelper helper = new StringHelper();

    @ParameterizedTest
    @MethodSource("testConditions")
    public void testTruncateAInFirst2Positions(String input, String expected)
    {
        assertEquals(expected, helper.truncateAInFirst2Positions(input));
    }

    static Stream<Arguments> testConditions()
    {
        return Stream.of(
            arguments("AACD", "CD"),
                arguments("ACD", "CD")
        );
    }

//    @Test
//    public void testTruncateAInFirst2Positions_AinFirst2Positions()
//    {
//        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
//    }

//    @Test
//    public void testTruncateAInFirst2Positions2_AinFirstPosition()
//    {
//        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
//    }



}

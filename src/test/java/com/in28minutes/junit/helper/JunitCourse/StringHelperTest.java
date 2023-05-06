package com.in28minutes.junit.helper.JunitCourse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringHelperTest {

    StringHelper helper = new StringHelper();

    @Test
    public void testTruncateAInFirst2Positions_AinFirst2Positions()
    {
        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
    }

    @Test
    public void testTruncateAInFirst2Positions2_AinFirstPosition()
    {
        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario()
    {
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario()
    {
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }

}

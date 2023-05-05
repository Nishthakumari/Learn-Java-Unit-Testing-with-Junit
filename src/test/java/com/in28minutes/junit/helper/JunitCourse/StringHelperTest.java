package com.in28minutes.junit.helper.JunitCourse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

}

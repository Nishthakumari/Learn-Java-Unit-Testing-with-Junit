package com.in28minutes.junit.helper.JunitCourse;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class QuickBeforeAfterTest {

    @BeforeEach
    public void before()
    {
        System.out.println("Before test");
    }

    @Test
    public void test1()
    {
        System.out.println("test1 executed");
    }

    @Test
    public void test2()
    {
        System.out.println("test2 executed");
    }

    @AfterEach
    public void after()
    {
        System.out.println("After test");
    }


}

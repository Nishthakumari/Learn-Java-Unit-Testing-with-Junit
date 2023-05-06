package com.in28minutes.junit.helper.JunitCourse;

import org.junit.jupiter.api.*;

public class QuickBeforeAfterTest {

    @BeforeAll
    public static void beforeAll()
    {
        System.out.println("Before All tests");
    }

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

    @AfterAll
    public static void afterAll()
    {
        System.out.println("After All tests");
    }


}

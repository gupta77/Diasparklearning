package com.dias.demoproj;

import org.testng.annotations.*;

public class TestngLearning {

    @Test
    public void testCase1() {

        System.out.println("testCase1");
    }

    @Test
    public void testCase2() {

        System.out.println("testCase2");
    }

    @BeforeMethod
    public void beforeMethod() {

        System.out.println("beforeMethod");
    }

    @AfterMethod
    public void afterMethod() {

        System.out.println("afterMethod");
    }

    @BeforeClass
    public void beforeClass() {

        System.out.println("beforeClass");
    }

    @AfterClass
    public void afterClass() {

        System.out.println("afterClass");
    }

    @BeforeTest
    public void beforeTest() {

        System.out.println("beforeTest");
    }

    @AfterTest
    public void afterTest() {

        System.out.println("afterTest");
    }

    @BeforeSuite
    public void beforeSuite() {

        System.out.println("beforeSuite");
    }

    @AfterSuite
    public void afterSuite() {

        System.out.println("afterSuite");
    }


}

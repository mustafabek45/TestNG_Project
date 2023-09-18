package testNG.tests;

import org.testng.annotations.*;

public class C01_TestNGAnnotations {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }

    @Test(priority = 1)
    public void test01() {
        System.out.println("test01");
    }
    @Test @Ignore
    public void test02() {
        System.out.println("test02");

    }
    @Test(enabled = false)
    public void test03() {
        System.out.println("test03");

    }
    @Test(priority = 4)
    public void test04() {
        System.out.println("test04");

    }
    @Test(priority = 2)
    public void test05() {
        System.out.println("test05");

    }
    @Test(priority = -5)
    public void test06() {
        System.out.println("test05");

    }



}
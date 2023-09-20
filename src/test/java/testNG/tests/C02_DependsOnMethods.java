package testNG.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C02_DependsOnMethods {

    @Test
    public void homeTest() {
        System.out.println("Home Test");
     //   Assert.assertTrue(false);
    }

    @Test(dependsOnMethods = "homeTest")
    public void searchTest() {
        System.out.println("Search Test");
    }

    @Test
    public void paymentTest() {
        System.out.println("Payment Test");
    }




}
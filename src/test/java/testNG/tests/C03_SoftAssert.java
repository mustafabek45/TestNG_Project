package testNG.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C03_SoftAssert {

    @Test
    public void softAssert() {
        SoftAssert softassert = new SoftAssert();
        System.out.println("Linie 11");
        softassert.assertEquals(2,5);
        System.out.println("Linie 13");
        softassert.assertTrue("JAVA".contains("U"));
        System.out.println("Linie 15");
        softassert.assertTrue(true);
        System.out.println("Linie 17");
        softassert.assertAll();

    }
}
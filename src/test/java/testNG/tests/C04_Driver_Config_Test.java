package testNG.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import testNG.utilities.ConfigReader;
import testNG.utilities.Driver;

public class C04_Driver_Config_Test {
    @Test
    public void firstTest() {
        //go amazon

        //Driver.getDriver().get("https://www.amazon.com");
        Driver.getDriver().get(ConfigReader.getProperty("amazon_Url"));

        //verify that title contains "Amazon"
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Amazon"));

        //close driver
        Driver.closeDriver();

    }
}
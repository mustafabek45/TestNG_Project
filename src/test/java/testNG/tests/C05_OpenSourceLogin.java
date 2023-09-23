package testNG.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import testNG.pages.OpenSourcePage;
import testNG.utilities.ConfigReader;
import testNG.utilities.Driver;

public class C05_OpenSourceLogin {

    @Test
    public void openSourceLogin() throws InterruptedException {

        // Go to openSource page
        Driver.getDriver().get(ConfigReader.getProperty("open_source_url"));

        //Create Page object
        OpenSourcePage openSource=new OpenSourcePage();

        //Arrive to objects in Page class with object
        openSource.userName.sendKeys(ConfigReader.getProperty("open_source_userName"));
        openSource.password.sendKeys(ConfigReader.getProperty("open_source_password"));
        openSource.submitButton.click();

        //Assertion

        Assert.assertTrue(openSource.dashBoardHeader.isDisplayed());

        Driver.closeDriver();
    }
}
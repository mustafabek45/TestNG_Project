package testNG.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testNG.utilities.Driver;

public class OpenSourcePage {
    //constructor
    public OpenSourcePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(name="username")
    public WebElement userName;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//h6[.='Dashboard']")
    public WebElement dashBoardHeader;


}
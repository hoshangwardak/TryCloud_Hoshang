package com.tryCloud.pages;

import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Login {

    // This constructor is calling this Class (Login)
    public Login() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    // All required elements in order to login as follows:
    @FindBy(id = "user")
    public WebElement usernameInputBox;

    @FindBy(id = "password")
    public WebElement passwordInputBox;

    @FindBy(id = "submit-form")
    public WebElement logInButton;


    // Methods to be called through this Class
    public void getEnvironment(String environment) {
        Driver.getDriver().get(ConfigurationReader.getProperty(environment));
    }

    public void getUserName(String username) {
        usernameInputBox.sendKeys(ConfigurationReader.getProperty(username));
    }

    public void getPassword(String password) {
        passwordInputBox.sendKeys(ConfigurationReader.getProperty(password));
    }

    public void clickOnLogInButton() {
        logInButton.click();
    }

    public String getTitle() {
        return Driver.getDriver().getTitle();
    }

}

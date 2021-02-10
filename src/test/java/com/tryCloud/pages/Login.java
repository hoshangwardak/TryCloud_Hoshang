package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

    public Login() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "user")
    public WebDriver usernameInputBox;

    @FindBy(id = "password")
    public WebDriver passwordInputBox;

    @FindBy(id = "submit-form")
    public WebDriver logInButton;

}

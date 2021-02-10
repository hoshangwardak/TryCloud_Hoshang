package com.tryCloud.tests.base;

import com.tryCloud.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    WebDriver driver;

    @BeforeMethod
    public void setUpBeforeMethod() {

        // Calling the method from WebDriverFactory to achieve desired browser as assigned in the
        // configuration.properties file.
        driver = WebDriverFactory.getDriver();

        // Calling the method from WebDriverFactory to maximize the browser page
        WebDriverFactory.maximize(driver);

        // Calling the method from WebDriverFactory to execute implicit wait on the browser
        WebDriverFactory.implicitWait(driver);
    }

    @AfterMethod
    public void tearDownMethod() {
        driver.close();
    }
}

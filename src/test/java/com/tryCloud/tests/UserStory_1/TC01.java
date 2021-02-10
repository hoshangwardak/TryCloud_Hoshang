package com.tryCloud.tests.UserStory_1;

import com.tryCloud.pages.Login;
import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import com.tryCloud.utilities.ThreadSleep;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01 {

    @Test
    public void logInTest() {

        Login login = new Login();
        login.getEnvironment("tryCloudQa2");
        login.getUserName("username1");
        login.getPassword("password");
        login.clickOnLogInButton();
        String expectedTitle = "Dashboard - Trycloud";
        Assert.assertTrue(login.getTitle().equals(expectedTitle),"Failed, Titles do not match");

    }

}

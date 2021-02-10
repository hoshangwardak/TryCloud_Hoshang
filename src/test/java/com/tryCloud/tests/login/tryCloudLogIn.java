package com.tryCloud.tests.login;

import com.tryCloud.pages.Login;
import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import org.testng.annotations.Test;

public class tryCloudLogIn {

    @Test
    public void logInTest() {

        String tryCloudQaEnvironment = ConfigurationReader.getProperty("tryCloudQa2");
        Driver.getDriver().get(tryCloudQaEnvironment);


    }
}

package com.healthcare.tests;

import com.healthcare.base.BaseTest;
import com.healthcare.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() {
        LoginPage login = new LoginPage(driver);
        login.login("tomsmith", "SuperSecretPassword!");

        HomePage home = new HomePage(driver);
        Assert.assertTrue(home.isLoginSuccessful());
    }
}

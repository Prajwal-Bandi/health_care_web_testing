package com.healthcare.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class HomePage {

    @FindBy(id = "flash")
    WebElement successMsg;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public boolean isLoginSuccessful() {
        return successMsg.isDisplayed();
    }
}

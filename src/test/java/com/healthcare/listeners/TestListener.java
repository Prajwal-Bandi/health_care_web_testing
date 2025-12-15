package com.healthcare.listeners;

import com.healthcare.base.BaseTest;
import org.openqa.selenium.*;
import org.testng.*;
import java.io.File;
import java.nio.file.Files;

public class TestListener implements ITestListener {

    private void capture(String name, String status) {
        try {
            File src = ((TakesScreenshot) BaseTest.driver)
                    .getScreenshotAs(OutputType.FILE);
            File dest = new File("reports/screenshots/" + status + "/" + name + ".png");
            Files.copy(src.toPath(), dest.toPath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onTestSuccess(ITestResult result) {
        capture(result.getName(), "passed");
    }

    public void onTestFailure(ITestResult result) {
        capture(result.getName(), "failed");
    }
}

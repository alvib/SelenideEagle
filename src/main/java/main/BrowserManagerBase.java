package main;

import steps.BrowserSteps;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.codeborne.selenide.Configuration;

public class BrowserManagerBase {

    public final BrowserSteps browser = new BrowserSteps();

    public void initDesktopDriver() {
        initDriver();
        Configuration.browserSize = "1200x800";
    }

    private void initDriver() {
        Configuration.pageLoadTimeout = 90000;
        DesiredCapabilities capabilities = new DesiredCapabilities();
        Configuration.browserCapabilities = capabilities;
        Configuration.timeout = 15000;
    }
}

package com.demoqa.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class SafariWebDriver {
    public static WebDriver loadSafariDriver() {
        SafariOptions options = new SafariOptions();
        // SafariOptions yapılandırması ekleyebilirsiniz
        return new SafariDriver(options);
    }
}


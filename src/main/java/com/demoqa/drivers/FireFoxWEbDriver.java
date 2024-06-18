package com.demoqa.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FireFoxWEbDriver {
    public static WebDriver loadFirefoxDriver() {
        System.setProperty("webdriver.gecko.driver", "/Users/owner/Desktop/DemoQAWinter24/src/main/resources/drivers/geckodriver");
        FirefoxOptions options = new FirefoxOptions();
        // FirefoxOptions yapılandırması ekleyebilirsiniz
        return new FirefoxDriver(options);
    }
}

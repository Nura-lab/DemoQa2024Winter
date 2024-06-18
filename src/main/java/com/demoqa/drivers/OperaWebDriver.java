package com.demoqa.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class OperaWebDriver {
    public static WebDriver loadOperaDriver() {
        System.setProperty("webdriver.opera.driver", "/Users/owner/Desktop/DemoQAWinter24/src/main/resources/drivers/operadriver");
        OperaOptions options = new OperaOptions();
        // OperaOptions yapılandırması ekleyebilirsiniz
        return new OperaDriver(options);
    }
}


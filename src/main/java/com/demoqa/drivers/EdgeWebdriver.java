package com.demoqa.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class EdgeWebdriver {
    public static WebDriver loadEdgeDriver() {
        System.setProperty("webdriver.edge.driver", "/Users/owner/Desktop/DemoQAWinter24/src/main/resources/drivers/msedgedriver");
        EdgeOptions options = new EdgeOptions();
        // EdgeOptions yapılandırması ekleyebilirsiniz
        return new EdgeDriver(options);
    }
}

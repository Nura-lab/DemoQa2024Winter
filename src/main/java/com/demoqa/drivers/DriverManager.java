package com.demoqa.drivers;
import com.demoqa.utils.ConfigReader;
import org.openqa.selenium.WebDriver;


public class DriverManager {
    private static WebDriver driver;
    public static WebDriver getDriver(){
        if(driver==null){
            switch (ConfigReader.getValue("browser").toLowerCase()){
                case "chrome":
                    driver = ChromeWebDriver.LoadChromeDriver();
                    break;
                case "firefox":
//                    driver = FireFoxWebDriver.loadChromeDriver();
                    // тут должен быть кейм дз
                    break;

                default:
                    throw new IllegalArgumentException("you provided wrong Driver name");

            }
        }
        return driver;
    }
    public static void closeDriver(){
        try {
            if (driver != null){
                driver.close();
                driver.quit();
                driver=null;


            }

        }catch (Exception e){
            System.err.println("error white closing driver");
        }
    }
}
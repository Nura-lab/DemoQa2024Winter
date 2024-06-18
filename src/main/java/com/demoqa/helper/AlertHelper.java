package com.demoqa.helper;

import com.demoqa.drivers.DriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertHelper {
    private WebDriver driver = DriverManager.getDriver();

    public AlertHelper(WebDriver driver){
        this.driver=driver;

    }
    public Alert getAlert(){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.alertIsPresent());
        return driver.switchTo().alert();
    }
    public void acceptAlert(){
        getAlert().accept();
    }
    public void dismissAlert(){
        getAlert().dismiss();
    }
//    получать тексты из алерты
    public String getAlertText(){
        return getAlert().getText();
    }


}

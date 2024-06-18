package com.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllertPage extends BasePage{
    @FindBy(id="confirmButton")
    public WebElement confirmAlertBtn;
}

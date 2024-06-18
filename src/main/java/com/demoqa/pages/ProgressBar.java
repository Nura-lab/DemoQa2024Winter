package com.demoqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProgressBar extends BasePage {

    @FindBy(id = "startStopButton")
    public WebElement startStopBtn;

    @FindBy(xpath = "//div[@role='progressbar']")
    public WebElement progressBar;


    public void clickStartStopButton() {
        startStopBtn.click();
    }

    public String getProgressBarValue() {
        return progressBar.getAttribute("ariaValueNow");
    }
}

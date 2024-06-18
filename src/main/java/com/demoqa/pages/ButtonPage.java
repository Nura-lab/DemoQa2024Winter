package com.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ButtonPage {

    private WebDriver driver;

    @FindBy(id = "doubleClickBtn")
    private WebElement doubleClickBtn;

    @FindBy(id = "rightClickBtn")
    private WebElement rightClickBtn;

    @FindBy(id = "doubleClickMessage")
    private WebElement doubleClickMessage;

    @FindBy(id = "rightClickMessage")
    private WebElement rightClickMessage;

    public ButtonPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public ButtonPage() {

    }

    public void doubleClickButton() {
        // Реализация метода
    }

    public void rightClickButton() {
        // Реализация метода
    }

    public String getDoubleClickMessage() {
        // Реализация метода
        return doubleClickMessage.getText();
    }

    public String getRightClickMessage() {
        // Реализация метода
        return rightClickMessage.getText();
    }
}

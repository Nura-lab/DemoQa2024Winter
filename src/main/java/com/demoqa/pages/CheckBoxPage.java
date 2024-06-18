package com.demoqa.pages;

import com.demoqa.helper.WebElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.demoqa.drivers.DriverManager;

public class CheckBoxPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/span/button")
    public WebElement openHome;

    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/button")
    public WebElement openDesktop;

    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[1]/ol/li[1]/span/label")
    public WebElement notes;

    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[1]/ol/li[2]/span/label")
    public WebElement commands;

    @FindBy(xpath = "//div[@class='display-result mt-4']")
    public WebElement desktopResult;

    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/button")
    public WebElement openDocuments;

    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/span/label")
    public WebElement workSpace;

    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/span/label")
    public WebElement office;

    @FindBy(xpath = "//div[@class='display-result mt-4']")
    public WebElement withDocResult;

    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/button")
    public WebElement openDownloads;

    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[3]/ol/li[1]/span/label")
    public WebElement wordFile;

    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[3]/ol/li[2]/span/label")
    public WebElement excelFile;

    @FindBy(xpath = "//div[@class='display-result mt-4']")
    public WebElement fullResult;

    @FindBy(xpath = "//div[@class='rct-options']")
    public WebElement openCheckBox;

    @FindBy(xpath = "//span[@class='rct-checkbox']/*[1]")
    public WebElement clickCheckBox;



    private WebElementActions actions;

    public CheckBoxPage() {
        PageFactory.initElements(DriverManager.getDriver(), this);
        this.actions = new WebElementActions();
    }

    public CheckBoxPage fillUpCheckBoxForm() {
        actions.click(openHome)
                .click(openDesktop)
                .click(notes).click(commands)
                .print(desktopResult)
                .click(openDocuments)
                .click(workSpace).click(office)
                .print(withDocResult)
                .click(openDownloads)
                .click(wordFile).click(excelFile)
                .print(fullResult);
        return this;
    }

//    public CheckBoxPage clickAllCheckBox() {
//        actions.click(clickCheckBox);
//        return this;
//    }
//
//    public CheckBoxPage clickOpenCheckBox() {
//        actions.click(openCheckBox);
//        return this;
//    }

//    public CheckBoxPage unCheckLast() {
//        actions.waitElementToBeVisible(unChecked);
//        if (unChecked.isDisplayed()) {
//            unChecked.click();
//        } else {
//            System.out.println("Element not found");
//        }
//        return this;
//    }
}

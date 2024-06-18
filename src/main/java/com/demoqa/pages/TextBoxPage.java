package com.demoqa.pages;

import com.demoqa.drivers.DriverManager;
import com.demoqa.entities.TextBoxEntity;
import com.demoqa.helper.WebElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPage extends BasePage {
    @FindBy(id = "userName")
    public WebElement fullNameInput;

    @FindBy(id = "userEmail")
    public WebElement emailInput;

    @FindBy(id = "currentAddress") // düzeltilmiş 'currentAddress' olarak değiştirildi
    public WebElement currentAddressInput;

    @FindBy(id = "permanentAddress")
    public WebElement permanentAddressInput;

    @FindBy(id = "submit")
    public WebElement submitInput;

    private WebElementActions webElementActions;

    public TextBoxPage() {
        PageFactory.initElements(DriverManager.getDriver(), this);
        this.webElementActions = new WebElementActions();
    }

    public TextBoxPage fillUpTextBoxForm(String fullName, String email, String currentAddress, String permanentAddress) {
        webElementActions.sendKeys(fullNameInput, fullName)
                .sendKeys(emailInput, email)
                .sendKeys(currentAddressInput, currentAddress)
                .sendKeys(permanentAddressInput, permanentAddress)
                .click(submitInput);
        return this;
    }

    public TextBoxPage fillUpTextBoxForm(TextBoxEntity textBoxEntity) {
        webElementActions.sendKeys(fullNameInput, textBoxEntity.getFullName())
                .sendKeys(emailInput, textBoxEntity.getEmail())
                .sendKeys(currentAddressInput, textBoxEntity.getCurrentAddress())
                .sendKeys(permanentAddressInput, textBoxEntity.getPermanentAddress())
                .click(submitInput);
        return this;
    }
}

package com.demoqa.pages;

import com.demoqa.drivers.DriverManager;
import com.demoqa.helper.DropDownHelper;
import com.demoqa.helper.WebElementActions;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    protected WebElementActions webElementActions;
    protected DropDownHelper dropDownHelper;

    public BasePage() {
        PageFactory.initElements(DriverManager.getDriver(), this);
        webElementActions = new WebElementActions();
        dropDownHelper = new DropDownHelper(DriverManager.getDriver());
    }
}

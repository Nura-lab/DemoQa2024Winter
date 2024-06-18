package com.demoqa.helper;

import com.demoqa.drivers.DriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class WebElementActions {

    public Actions actions =new Actions(DriverManager.getDriver());

    @BeforeClass(alwaysRun = true)
    public void init(){
        actions=new Actions(DriverManager.getDriver());
    }

    // Click an element after ensuring it is clickable and scrolled into view
    public WebElementActions click(WebElement element) {
        waitElementToBeClickable(element);
        scrollToElement(element);
        element.click();
        return this;
    }

    // Send keys to an element after ensuring it is clickable and scrolled into view
    public WebElementActions sendKeys(WebElement element, String txt) {
        waitElementToBeClickable(element);
        scrollToElement(element);
        element.sendKeys(txt);
        return this;
    }

    // Send keys to an element and press Enter
    public WebElementActions sendKeysWithEnter(WebElement element, String txt) {
        waitElementToBeClickable(element);
        scrollToElement(element);
        element.sendKeys(txt);
        element.sendKeys(Keys.ENTER);
        return this;
    }

    // Print the text of an element to the console
    public WebElementActions print(WebElement element) {
        System.out.println(element.getText());
        return this;
    }

    // Wait for an element to be clickable
    public WebElementActions waitElementToBeClickable(WebElement element) {
        new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(element));
        return this;
    }

    // Wait for an element to be visible
    public WebElementActions waitElementToBeVisible(WebElement element) {
        new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(15))
                .until(ExpectedConditions.visibilityOf(element));
        return this;
    }

    // Scroll an element into view
    public WebElementActions scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        return this;
    }

    // Move to an element
    public WebElementActions moveToElement(WebElement element) {
        waitElementToBeVisible(element);
        Actions actions = new Actions(DriverManager.getDriver());
        actions.moveToElement(element).perform();
        return this;
    }

    // Move to an element and click
    public WebElementActions moveToElementAndClick(WebElement element) {
        waitElementToBeVisible(element);
        Actions actions = new Actions(DriverManager.getDriver());
        actions.moveToElement(element).click().perform();
        return this;
    }

    // Click an element using JavaScript
    public WebElementActions jsClick(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("arguments[0].click();", element);
        return this;
    }
}

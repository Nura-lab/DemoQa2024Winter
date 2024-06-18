package com.demoqa.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class FoodTest {
    @Test
    void textBoxTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/owner/Desktop/DemoQAWinter24/src/main/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://dostavka312.kg");


        WebElement foodBtn = driver.findElement(By.xpath("//*[@id=\"WWMainPage\"]/div[2]/div[1]/div/div[2]/div[2]/a"));
        foodBtn.click();
        WebElement salat = driver.findElement(By.xpath("//*[@id=\"WWMainPage\"]/div[1]/div[1]/div/div[2]/form/button"));
        salat.click();
        WebElement meet = driver.findElement(By.xpath("//*[@id=\"WWMainPage\"]/div[1]/div[22]/div/div[2]/form/button"));
        meet.click();
        WebElement salatM = driver.findElement(By.xpath("//*[@id=\"WWMainPage\"]/div[2]/div[2]/div/div[2]/form/button"));
        salatM.click();
        WebElement Oformit = driver.findElement(By.xpath("//a[@href='https://dostavka312.kg/cart']"));
        Oformit.click();


        WebElement fullName= driver.findElement(By.xpath("//*[@id=\"form_cart\"]/div[1]/div[1]/div[1]/input"));
        fullName.sendKeys("Numai");
        WebElement currentAddress =driver.findElement(By.xpath("//*[@id=\"form_cart\"]/div[1]/div[1]/div[2]/input"));
        currentAddress.sendKeys("Tynalieava 1/5 ");
        WebElement telephone=driver.findElement(By.xpath("//*[@id=\"form_cart\"]/div[1]/div[1]/div[3]/input"));
       telephone.sendKeys("996772301256");
        WebElement sdacha=driver.findElement(By.xpath("//*[@id=\"form_cart\"]/div[1]/div[1]/div[4]/input"));
        sdacha.sendKeys("4555");
        WebElement submitButton=driver.findElement(By.xpath("//*[@id=\"form_cart\"]/button[1]"));
        submitButton.click();

    }

    }

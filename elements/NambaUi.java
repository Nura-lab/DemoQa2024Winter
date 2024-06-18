package com.demoqa.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class NambaUi {

        @Test
        void textBoxTest() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "/Users/owner/Desktop/DemoQAWinter24/src/main/resources/drivers/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
            driver.get("https://nambafood.kg/");
//            eda
            WebElement txt = driver.findElement(By.linkText("Еда"));
            txt.click();
            driver.get("https://nambafood.kg/food");
//            halal -cafe
            WebElement cafe = driver.findElement(By.xpath("/html/body/div[2]/main/section[3]/div/a[9]"));
            cafe.click();
            driver.get("https://nambafood.kg/cafe/khalal");
//            WebElement zavedenie1 = driver.findElement(By.linkText("Нишан"));
//            zavedenie1.click();
            driver.get("https://nambafood.kg/nishan");

            WebElement zakaz = driver.findElement(By.xpath("//*[@id=\"205\"]/div/div[6]/div[2]/button"));
            zakaz.click();
            WebElement txt1 = driver.findElement(By.xpath("//*[@id=\"cart\"]/a"));
            txt1.click();
            driver.get("https://nambafood.kg/nishan/make-order");
            WebElement btnOformit = driver.findElement(By.xpath("/html/body/main/section/div[1]/div[5]/div[11]/a/button"));
            btnOformit.click();
            WebElement fullName = driver.findElement(By.id("food_order_client_name"));
            fullName.clear();
            fullName.sendKeys("Енур");
            WebElement address = driver.findElement(By.id("food_order_address"));
            address.clear();
            address.sendKeys("Фрунзе Михаила 542  ");
            WebElement kvartira = driver.findElement(By.id("food_order_door_code"));
            kvartira.clear();
            kvartira.sendKeys("2  ");
            WebElement telephone = driver.findElement(By.id("food_order_phone"));
            telephone.clear();
            telephone.sendKeys("0773107453");
            WebElement dopinfo = driver.findElement(By.id("food_order_additional_info"));
            dopinfo.clear();
            dopinfo.sendKeys("63B");
            WebElement sdacha = driver.findElement(By.id("food_order_money_change"));
            sdacha.clear();
            sdacha.sendKeys("500");
            WebElement zakaz2 = driver.findElement(By.xpath(" //*[@id=\"payment_cash\"]"));
            zakaz2.click();




        }

    }



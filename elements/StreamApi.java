package com.demoqa.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class StreamApi {
    WebDriver driver;

    @Test
    void findByIdTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/owner/Desktop/DemoQAWinter24/src/main/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().window().maximize();

        driver.get("https://dostavka312.kg/category/11");
        List<WebElement> kafeList = driver.findElements(By.xpath("//div[@class='panel-heading']"));

        kafeList.forEach(kafe -> System.out.println(kafe.getText() + "\n======================================================"));

        kafeList.stream()
                .filter(kafe -> kafe.getText().equals("Арзу по Магистрали"))
                .findFirst()
                .ifPresent(kafe -> {
                    WebElement menu = driver.findElement(By.xpath("//*[@id=\"WWMainPage\"]/div[2]/div[5]/div/div[2]/div[2]/a"));
                    menu.click();

                    showFoods(driver, "//*[@id=\"WWMainPage\"]/div[1]", "Холодные закуски");
                    showFoods(driver, "//*[@id=\"WWMainPage\"]/div[2]", "Горячие салаты");
                    showFoods(driver, "//*[@id=\"WWMainPage\"]/div[3]", "САЛАТЫ");
                    showFoods(driver, "//*[@id=\"WWMainPage\"]/div[4]", "Супы");
                    showFoods(driver, "//*[@id=\"WWMainPage\"]/div[5]", "ВОСТОЧНАЯ КУХНЯ");
                    showFoods(driver, "//*[@id=\"WWMainPage\"]/div[6]", "Европейская кухня");
                    showFoods(driver, "//*[@id=\"WWMainPage\"]/div[7]", "Итальянская паста");
                    showFoods(driver, "//*[@id=\"WWMainPage\"]/div[8]", "Фаст-Фуд");
                    showFoods(driver, "//*[@id=\"WWMainPage\"]/div[9]", "Пицца");
                    showFoods(driver, "//*[@id=\"WWMainPage\"]/div[10]", "Японская кухня");
                    showFoods(driver, "//*[@id=\"WWMainPage\"]/div[11]", "Шашлыки");
                    showFoods(driver, "//*[@id=\"WWMainPage\"]/div[12]", "Блюда на заказ");
                    showFoods(driver, "//*[@id=\"WWMainPage\"]/div[13]", "Мучные изделия");
                    showFoods(driver, "//*[@id=\"WWMainPage\"]/div[14]", "Гарниры");
                    showFoods(driver, "//*[@id=\"WWMainPage\"]/div[15]", "Холодные напитки");

                });

        driver.quit();
    }

    private void showFoods(WebDriver driver, String xpath, String sectionName) {
        List<WebElement> elements = driver.findElements(By.xpath(xpath));
        elements.forEach(element -> System.out.println(sectionName + "\n" + element.getText() + "\n---------------------------------------"));
    }
}

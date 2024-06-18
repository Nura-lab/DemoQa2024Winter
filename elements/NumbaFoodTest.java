package com.demoqa.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class NumbaFoodTest {
    private WebDriver driver;

    @BeforeClass
    void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/owner/Desktop/DemoQAWinter24/src/main/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @Test
    void testNambaFoodCafe() {
        driver.get("https://nambafood.kg/cafe/national");

        List<WebElement> cafeList = driver.findElements(By.xpath("//div[@class='catalog-wrap']/div"));

        cafeList.forEach(cafe -> System.out.println(cafe.getText() + "\n======================================================"));

        cafeList.stream()
                .filter(cafe -> cafe.getText().contains("Ресторан Пишпек\nТоголока Молдо, 17/1а"))
                .findFirst()
                .ifPresent(cafe -> {
                    WebElement menu = cafe.findElement(By.xpath(".//a[contains(@href, 'restoran-pishpek')]"));
                    menu.click();

                    showFoods(driver, "//*[@id=\"WWMainPage\"]/div[1]", "ЗАВТРАКИ");
                    showFoods(driver, "//*[@id=\"WWMainPage\"]/div[2]", "ХОЛОДНЫЕ ЗАКАЗЫ");
                    showFoods(driver, "//*[@id=\"WWMainPage\"]/div[3]", "САЛАТЫ");
                    showFoods(driver, "//*[@id=\"WWMainPage\"]/div[4]", "СУП");
                    showFoods(driver, "//*[@id=\"WWMainPage\"]/div[5]", "ВОСТОЧНАЯ КУХНЯ");
                    showFoods(driver, "//*[@id=\"WWMainPage\"]/div[6]", "КРЕМ СУП");
                    showFoods(driver, "//*[@id=\"WWMainPage\"]/div[7]", "ВОСТОЧНЫЙ СУП");
                    showFoods(driver, "//*[@id=\"WWMainPage\"]/div[8]", "ГОРЯЧИЕ ЗАКУСКИ");
                    showFoods(driver, "//*[@id=\"WWMainPage\"]/div[9]", "ВЫПЕЧКА");
                    showFoods(driver, "//*[@id=\"WWMainPage\"]/div[10]", "ПАСТА");
                    showFoods(driver, "//*[@id=\"WWMainPage\"]/div[11]", "СТЕЙК");
                    showFoods(driver, "//*[@id=\"WWMainPage\"]/div[12]", "ГОРЯЧИЕ БЛЮДА ЕВРОПЕЙСКОЙ КУХНИ");
                    showFoods(driver, "//*[@id=\"WWMainPage\"]/div[13]", "БЛЮДА ИЗ РЫБЫ");
                });
    }

    private void showFoods(WebDriver driver, String xpath, String sectionName) {
        WebElement category = driver.findElement(By.xpath(xpath));
        category.click();

        WebElement sectionHeader = driver.findElement(By.xpath("//h2[contains(text(), '" + sectionName + "')]"));
        System.out.println(sectionName);
        System.out.println("---------------------------------------");

        List<WebElement> foodItems = sectionHeader.findElements(By.xpath("../../following-sibling::div[1]//div[@class='panel panel-default']"));
        foodItems.forEach(food -> System.out.println(food.getText().trim()));
        System.out.println();
    }

    @AfterClass
    void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

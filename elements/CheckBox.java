//package com.demoqa.elements;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import java.time.Duration;
//
//public class CheckBox {
//    private WebDriver webDriver;
//
//    @BeforeMethod
//    public void setUp() {
//        webDriver = new ChromeDriver();
//        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        webDriver.manage().window().maximize();
//        webDriver.get("https://demoqa.com/checkbox");
//        JavascriptExecutor js = (JavascriptExecutor) webDriver;
//        js.executeScript("window.scrollBy(0, 1000);");
//    }
//
//    @AfterMethod
//    public void tearDown() {
//        if (webDriver != null) {
//            webDriver.quit();
//        }
//    }
//
//    @Test
//    void textBoxTest() throws InterruptedException {
//        //1. Home
//        WebElement homeElement = webDriver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button"));
//        homeElement.click();
//
//        // 1.1. Desktop
//        WebElement deskElement = webDriver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[1]/span/button"));
//        deskElement.click();
//
//        // 1.1.1 . Notes
//        WebElement notesElement = webDriver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[1]/ol/li[1]/span/label/span[1]"));
//        notesElement.click();
//        String actualMessageOfNotesElement = webDriver.findElement(By.xpath("//*[@id='result']")).getText();
//
//        // Commands
//        WebElement commandsElement = webDriver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[1]/ol/li[2]/span/label/span[1]"));
//        commandsElement.click();
//        String actualMessageOfCommandsElement = webDriver.findElement(By.xpath("//*[@id='result']")).getText();
//
//        // Document -> Workspace -> React
//        WebElement docElement = webDriver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[2]/span/button"));
//        docElement.click();
//
//        WebElement workSpaceElement = webDriver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[2]/ol/li[1]/span/button"));
//        workSpaceElement.click();
//
//        WebElement reactElement = webDriver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[2]/ol/li[1]/ol/li[1]/span/label/span[1]"));
//        reactElement.click();
//        String actualReactElement = webDriver.findElement(By.xpath("//*[@id=\"result\"]")).getText();
//
//        // Angular
//        WebElement angularElement = webDriver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[2]/ol/li[1]/ol/li[2]/span/label/span[1]"));
//        angularElement.click();
//        String actualAngularElement = webDriver.findElement(By.xpath("//*[@id='result']")).getText();
//
//        // Vue
//        WebElement veuElement = webDriver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[2]/ol/li[1]/ol/li[3]/span/label/span[1]"));
//        veuElement.click();
//        String actualVeuElement = webDriver.findElement(By.xpath("//*[@id='result']")).getText();
//
//        // Office -> Public
//        WebElement officeElement = webDriver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[2]/ol/li[2]/span/button"));
//        officeElement.click();
//
//        WebElement publicElement = webDriver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[2]/ol/li[2]/ol/li[1]/span/label/span[1]"));
//        publicElement.click();
//        String actualPublicElement = webDriver.findElement(By.xpath("//*[@id='result']")).getText();
//
//        // Private
//        WebElement privateElement = webDriver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[2]/ol/li[2]/ol/li[2]/span/label/span[1]"));
//        privateElement.click();
//        String actualPrivateElement = webDriver.findElement(By.xpath("//*[@id='result']")).getText();
//
//        // Classified
//        WebElement classifiedElement = webDriver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[2]/ol/li[2]/ol/li[3]/span/label/span[1]"));
//        classifiedElement.click();
//        String actualClassifiedElement = webDriver.findElement(By.xpath("//*[@id='result']")).getText();
//
//        // General
//        WebElement generalElement = webDriver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[2]/ol/li[2]/ol/li[4]/span/label/span[1]"));
//        generalElement.click();
//        String actualGeneralElement = webDriver.findElement(By.xpath("//*[@id='result']")).getText();
//
//        // Downloads -> Word File
//        WebElement dowElement = webDriver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[3]/span/button"));
//        dowElement.click();
//
//        WebElement wordFileElement = webDriver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[3]/ol/li[1]/span/label/span[1]"));
//        wordFileElement.click();
//        String actualWordFileElement = webDriver.findElement(By.xpath("//*[@id='result']")).getText();
//
//        // Excel File
//        WebElement excelFileElement = webDriver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[3]/ol/li[2]/span/label/span[1]"));
//        excelFileElement.click();
//        String actualExcelFileElement = webDriver.findElement(By.xpath("//*[@id='result']")).getText();
//
//        // Return to Home
//        WebElement homeReturnElement = webDriver.findElement(By.xpath("//*[@id='tree-node']/ol/li/span/label/span[1]"));
//        homeReturnElement.click();
//        String actualHomeReturnElement = webDriver.findElement(By.xpath("//*[@id='app']/div/div/div/div[2]/div[3]")).getText();
//
//
//        String testMessageOfNotesElement = "You have selected :\n" + "notes";
//        String testMessageOfCommandsElement = "You have selected :\n" + "desktop\n" + "notes\n" + "commands";
//        String testReactElement = "You have selected :\n" + "desktop\n" + "notes\n" + "commands\n" + "react";
//        String testAngularElement = "You have selected :\n" + "desktop\n" + "notes\n" + "commands\n" + "react\n" + "angular";
//        String testVeuElement = "You have selected :\n" + "desktop\n" + "notes\n" + "commands\n" + "workspace\n" + "react\n" + "angular\n" + "veu";
//        String testPublicElement = "You have selected :\n" + "desktop\n" + "notes\n" + "commands\n" + "workspace\n" + "react\n" + "angular\n" + "veu\n" + "public";
//        String testPrivateElement = "You have selected :\n" + "desktop\n" + "notes\n" + "commands\n" + "workspace\n" + "react\n" + "angular\n" + "veu\n" + "public\n" + "private";
//        String testClassifiedElement = "You have selected :\n" + "desktop\n" + "notes\n" + "commands\n" + "workspace\n" + "react\n" + "angular\n" + "veu\n" + "public\n" + "private\n" + "classified";
//        String testGeneralElement = "You have selected :\n" + "desktop\n" + "notes\n" + "commands\n" + "documents\n" + "workspace\n" + "react\n" + "angular\n" + "veu\n" + "office\n" + "public\n" + "private\n" + "classified\n" + "general";
//        String testWordFileElement = "You have selected :\n" + "desktop\n" + "notes\n" + "commands\n" + "documents\n" + "workspace\n" + "react\n" + "angular\n" + "veu\n" + "office\n" + "public\n" + "private\n" + "classified\n" + "general\n" + "wordFile";
//        String testExcelFileElement = "You have selected :\n" + "home\n" + "desktop\n" + "notes\n" + "commands\n" + "documents\n" + "workspace\n" + "react\n" + "angular\n" + "veu\n" + "office\n" + "public\n" + "private\n" + "classified\n" + "general\n" + "downloads\n" + "wordFile\n" + "excelFile";
//        String testHomeReturnElement = "";
//
//
//        Compare compare = new Compare();
//        compare.assertEquals(actualMessageOfNotesElement, testMessageOfNotesElement, "Mismatch in Notes message");
//        compare.assertEquals(actualMessageOfCommandsElement, testMessageOfCommandsElement, "Mismatch in Commands message");
//        compare.assertEquals(actualReactElement, testReactElement, "Mismatch in React message");
//        compare.assertEquals(actualAngularElement, testAngularElement, "Mismatch in Angular message");
//        compare.assertEquals(actualVeuElement, testVeuElement, "Mismatch in Veu message");
//        compare.assertEquals(actualPublicElement, testPublicElement, "Mismatch in Public message");
//        compare.assertEquals(actualPrivateElement, testPrivateElement, "Mismatch in Private message");
//        // Assertion (continued)
//        compare.assertEquals(actualGeneralElement, testGeneralElement, "Mismatch in General message");
//        compare.assertEquals(actualWordFileElement, testWordFileElement, "Mismatch in Word File message");
//        compare.assertEquals(actualExcelFileElement, testExcelFileElement, "Mismatch in Excel File message");
//        compare.assertEquals(actualHomeReturnElement, testHomeReturnElement, "Mismatch in Home Return message");
//
//        compare.assertAll();
//    }
//
//    private class Compare {
//        private StringBuilder verificationErrors;
//
//        Compare() {
//            verificationErrors = new StringBuilder();
//        }
//
//        void assertEquals(String actual, String expected, String message) {
//            if (!actual.equals(expected)) {
//                verificationErrors.append(message).append("\n");
//            }
//        }
//
//        void assertAll() {
//            String errors = verificationErrors.toString();
//            verificationErrors = new StringBuilder();
//            if (!errors.isEmpty()) {
//                throw new AssertionError(errors);
//            }
//        }
//    }
//}

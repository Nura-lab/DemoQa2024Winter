import com.demoqa.utils.ConfigReader;
import io.qameta.allure.*;
import io.qameta.allure.testng.Tag;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.Test;

public class AlertTest extends BaseTest {
    @Test(groups = {"Smoke", "UI","E2E"})
    @Description("Verify that alert is present")
    @Owner("nuta")
    @Tag("Smoke")
    @Severity(SeverityLevel.CRITICAL)
    @Story("GPRint")
    @Epic("Registration")
    @Link("www.google.com")
    void alertTest() throws InterruptedException {
//        driver.get("https://demoqa.com/alerts");
        browserHelper.open(ConfigReader.getValue("baseUrl"));
        webElementActions.click(allertPage.confirmAlertBtn);
        Thread.sleep(3000);
        alertHelper.acceptAlert();
        Thread.sleep(3000);
//        alertHelper.dismissAlert();
    }


    @Test(groups = {"Smoke", "Api","E2E"})
    void alertTest1() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        webElementActions.click(allertPage.confirmAlertBtn);
        Thread.sleep(3000);
        alertHelper.acceptAlert();
        Thread.sleep(3000);
//        alertHelper.dismissAlert();
    }
    @Test(groups = {"Smoke", "SQL","E2E"})
    void alertTest2() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        webElementActions.click(allertPage.confirmAlertBtn);
        Thread.sleep(3000);
        alertHelper.acceptAlert();
        Thread.sleep(3000);
//        alertHelper.dismissAlert();
    }
    public boolean isAlertPresent(){
        try{
            driver.switchTo().alert().accept();
            return true;
        }catch(NoAlertPresentException e){
            return  true;
        }
    }
//    принять Allert
    public void acceptAlertIfPresented(){
        if(!isAlertPresent())
        alertHelper.acceptAlert();

    }

    public void dismissAlertIfPresented(){
        if (!isAlertPresent())
            return;
        alertHelper.dismissAlert();

    }
    public void acceptPrompt(String txt) {
        if (!isAlertPresent())
            return;
        Alert alert = alertHelper.getAlert();
        alert.sendKeys(txt);
        alert.accept();
    }
   public void dismissPrompt(String txt){
        if(!isAlertPresent())
                return;
        Alert  alert = alertHelper.getAlert();
        alert.sendKeys(txt);
        alert.dismiss();


    }
}

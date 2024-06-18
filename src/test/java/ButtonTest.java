import com.demoqa.pages.ButtonPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonTest extends BaseTest {

    @Test(description = "Verify double click button is working properly")
    public void doubleClickTest() {
        driver.get("https://demoqa.com/buttons");
        ButtonPage buttonsPage = new ButtonPage(driver);
        buttonsPage.doubleClickButton();
        Assert.assertEquals(buttonsPage.getDoubleClickMessage(), "You have done a double click");
    }

    @Test(description = "Verify right click button is working properly")
    public void rightClickTest() {
        driver.get("https://demoqa.com/buttons");
        ButtonPage buttonsPage = new ButtonPage(driver);
        buttonsPage.rightClickButton();
        Assert.assertEquals(buttonsPage.getRightClickMessage(), "You have done a right click");
    }
}

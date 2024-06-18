import org.testng.annotations.Test;

public class MenuTest  extends BaseTest {
    @Test(description = "Verify move to element methods is working")
    public void MoveToElementTest() throws InterruptedException {
        browserHelper.open("https://demoqa.com/menu");
        webElementActions.moveToElement(menuPage.mainMenu);
        webElementActions.moveToElement(menuPage.sublist);

//        webElementActions.moveToElement(menuPage.sublist);

        webElementActions.moveToElementAndClick(menuPage.subItem2);

    }
}

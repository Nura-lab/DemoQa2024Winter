import org.testng.Assert;
import org.testng.annotations.Test;


public class CheckboxReTest extends BaseTest {
//(groups = {"Smoke","4323"}, description = "TextBoxTest")
    @Test(groups = {"E2E_Test", "1234"},description = "checkBoxTest")
    public void checkBoxTest() {
        driver.get("https://demoqa.com/checkbox");

        checkboxRe.fillUpCheckBoxForm();

        String expectedValue = "You have selected :\n" +
                "home\n" +
                "desktop\n" +
                "notes\n" +
                "commands\n" +
                "documents\n" +
                "workspace\n" +
                "react\n" +
                "angular\n" +
                "veu\n" +
                "office\n" +
                "public\n" +
                "private\n" +
                "classified\n" +
                "general\n" +
                "downloads\n" +
                "wordFile\n" +
                "excelFile";
        Assert.assertEquals(expectedValue, checkboxRe.fullResult.getText());
    }
}

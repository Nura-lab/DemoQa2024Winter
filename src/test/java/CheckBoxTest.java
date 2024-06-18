
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxTest extends BaseTest {

    @Test
    public void  checkBoxTest() {
        driver.get("https://demoqa.com/checkbox");

        checkBoxPage.fillUpCheckBoxForm();


        String value = "You have selected :\n" +
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
        Assert.assertEquals(value, checkBoxPage.fullResult.getText());
    }

//    @Test
//       public void test() throws SQLException {
//        WebElement dowloads = DriverManager.getDriver(ConfigReader.getValue("").findElement(By.id("result"));
//        String value1 ="downloads\n" +
//                "wordFile\n" +
//                "excelFile";
//        webElementActions.click(checkBoxPage.openDownloads);
//        Assert.assertEquals(value1, dowloads.getText());
//
//       }

    }


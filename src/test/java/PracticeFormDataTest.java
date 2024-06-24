import com.demoqa.pages.PracticeFormData;
import org.testng.annotations.Test;

public class PracticeFormDataTest extends BaseTest {
    @Test(groups = {"Regression", "1934"},description = "testSelectDateMonthYear")
    public void testSelectDateMonthYear() throws InterruptedException {
        browserHelper.open("https://demoqa.com/automation-practice-form");
        PracticeFormData practiceFormData = new PracticeFormData();
        practiceFormData.selectDateMonthYear("30 Jun 2022");
        Thread.sleep(3000);
    }
}

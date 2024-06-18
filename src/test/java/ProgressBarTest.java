import org.testng.Assert;
import org.testng.annotations.Test;

public class ProgressBarTest extends BaseTest {

    @Test(description = "ariaValueNow")
    public void progressBarTest() throws InterruptedException {
        browserHelper.open("https://demoqa.com/progress-bar");


        progressBar.clickStartStopButton();

        int valueNow;
        while (true) {
            valueNow = Integer.parseInt(progressBar.getProgressBarValue());

            if (valueNow == 52) {
                break;
            }
            progressBar.clickStartStopButton();


        }
        Assert.assertEquals(valueNow, 52);
    }
}

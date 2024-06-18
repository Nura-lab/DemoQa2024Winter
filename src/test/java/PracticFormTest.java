import com.demoqa.entities.PracticFormEntity;
import org.testng.annotations.Test;

public class PracticFormTest extends BaseTest {



    @Test
    public void practiceFormTest() throws InterruptedException {
        driver.get("https://demoqa.com/automation-practice-form");

        PracticFormEntity practicFormEntity = randomUtils.generateRandomPracticFormEntity();


        practiceForm.fillForm(practicFormEntity);
    }
        }


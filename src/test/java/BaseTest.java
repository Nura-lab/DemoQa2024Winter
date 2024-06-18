import com.demoqa.drivers.DriverManager;
import com.demoqa.helper.AlertHelper;
import com.demoqa.helper.BrowserHelper;
import com.demoqa.helper.IframeHelper;
import com.demoqa.helper.WebElementActions;
import com.demoqa.pages.*;
import com.demoqa.utils.RandomUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseTest {
    protected WebDriver driver;
    protected TextBoxPage textBoxPage;
    protected AllertPage allertPage;
    protected WebElementActions webElementActions;
    protected BrowserHelper browserHelper;

    protected CheckBoxPage checkBoxPage;
    protected CheckboxRe checkboxRe;

    protected RandomUtils randomUtils;
    protected AlertHelper alertHelper;
    protected ProgressBar progressBar;
    protected  MenuPage menuPage;
    protected PracticeForm practiceForm;
//    protected  WebTables webTables;
    protected  PracticeFormData practiceFormData;
    protected ButtonPage buttonPage;
    protected IframeHelper iframeHelper;



    @BeforeClass(alwaysRun = true)
    public void setUp(){
        driver = DriverManager.getDriver();
        practiceForm = new PracticeForm();
        textBoxPage =new TextBoxPage();
        randomUtils = new RandomUtils();
        checkBoxPage = new CheckBoxPage();
        checkboxRe = new CheckboxRe();
        allertPage =new AllertPage();
        webElementActions = new WebElementActions();
        alertHelper = new AlertHelper(driver);
        browserHelper = new BrowserHelper(driver);
        progressBar = new ProgressBar();
        menuPage = new MenuPage();
        practiceForm  = new PracticeForm();
//        webTables = new WebTables();
        practiceFormData = new PracticeFormData();
        buttonPage = new ButtonPage();
        iframeHelper = new IframeHelper(driver);


    }
    @AfterClass(alwaysRun = true)
    public void teaDown(){
        DriverManager.closeDriver();
    }
}

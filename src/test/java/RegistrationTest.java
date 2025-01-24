
import com.example.RegistrationPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class RegistrationTest {
    private WebDriver driver;
    private RegistrationPage registrationPage;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        registrationPage = new RegistrationPage(driver);
    }

    @Test
    public void testRegistrationForm(){
        registrationPage.openUrl("C:\\Users\\marty\\Desktop\\Learning\\Selenium with Java\\Form\\form-selenium\\resources\\registration.html");

        registrationPage.fillUsername("TestUsername");
        registrationPage.fillPassword("TestPassword");
        registrationPage.fillEmail("Test@email.com");
        registrationPage.submitForm();

        Assert.assertTrue(registrationPage.isMessageDisplayed(),"Registration failed!");


    }

    @AfterClass
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }



}

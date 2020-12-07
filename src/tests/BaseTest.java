import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    WebDriver webDriver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().version("87").setup();
        webDriver = new ChromeDriver();
        webDriver.get(Links.URL_PROPERTY);
    }

    @AfterMethod
    public void tearDown() {
        webDriver.quit();
    }
}

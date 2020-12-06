import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver webDriver;

    @FindBy(xpath = "")
    WebElement user_name;

    @FindBy(xpath = "")
    WebElement pass_word;

    @FindBy(xpath = "")
    WebElement btn_login;

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void login(String userName, String password) {
        user_name.sendKeys(userName);
        pass_word.sendKeys(password);
        btn_login.click();
    }

}

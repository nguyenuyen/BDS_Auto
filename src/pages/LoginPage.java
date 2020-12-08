import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{
    WebDriver webDriver;

    @FindBy(xpath = ElementLogin.USERNAME)
    WebElement user_name;

    @FindBy(xpath = ElementLogin.PASSWORD)
    WebElement pass_word;

    @FindBy(xpath = ElementLogin.BTN_LOGIN)
    WebElement btn_login;

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void login(String userName, String password) {
        openFormLogin();
        user_name.sendKeys(userName);
        pass_word.sendKeys(password);
        btn_login.click();
    }
}

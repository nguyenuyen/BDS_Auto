import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    WebDriver webDriver;
    Actions action;

    @FindBy(xpath =  ElementComon.MENU)
    WebElement iconMenu;

    @FindBy(xpath =  ElementComon.LOGIN)
    WebElement tabLogin;

    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        action = new Actions(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    public void openFormLogin() {
        Action openForm = (Action) action
                .moveToElement(this.iconMenu)
                .click()
                .moveToElement(this.tabLogin)
                .click();
        openForm.perform();
    }

}

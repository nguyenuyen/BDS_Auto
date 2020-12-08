import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    LoginPage loginPage = new LoginPage(webDriver);

    @Test
    public void loginSuccess() {
        loginPage.login("uyennt", "Vnext@2020");

    }

}

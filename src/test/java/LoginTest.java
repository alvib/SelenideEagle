import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {

    @Description("Негативный тест - Вход при пустом поле email")
    @DisplayName("Пустой email")
    @Test
    public void loginWithoutEmail() {
        browserManager.homePage.acceptCookies();
        browserManager.homePage.clickAccButton();
        browserManager.homePage.clickSignInButton();
        browserManager.login.inputPassword("1234567q");
        browserManager.login.clickLoginButton();
        browserManager.login.verifyErrorEmailOrPasswordMessage("Hold up, there's a problem.");
        browserManager.login.verifyErrorNoEmailMessage("Please enter your email address.");
    }
}

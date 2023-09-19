import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CreateAccTest extends BaseTest {

    @Description("Баг: Сообщение о непредвиденной ошибке, хотя должна произойти авторизация. Позитивный кейс")
    @DisplayName("Авторизация")
    @Test
    public void createAccount() {
        browserManager.homePage.acceptCookies();
        browserManager.homePage.clickAccButton();
        browserManager.homePage.clickSignInButton();
        browserManager.login.inputEmail("alvib01@mail.ru");
        browserManager.login.inputPassword("1234567q");
        browserManager.login.clickLoginButton();
        browserManager.login.showSignOutButton();
        browserManager.login.verifyAccName("Katya's Account");
    }
}

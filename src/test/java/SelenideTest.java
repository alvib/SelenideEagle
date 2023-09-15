import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SelenideTest extends BaseTest{

    @Description("Плавающий баг: кнопка поиска по артикулу редко перемещается вправо и тест падает. Позитивный тест.")
    @DisplayName("Сравнение выдачи поиска товаров")
    @Test
    public void searchProduct() {
        browserManager.homePage.acceptCookies();
        browserManager.homePage.clickSearchButton();
        browserManager.searchSideBar.inputSearchField("0115");
        browserManager.searchSideBar.clickSearchSideButton();
        browserManager.searchResult.verifyNumberOfProductIsDisplayed(13);
    }

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

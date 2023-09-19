package steps;

import io.qameta.allure.Step;

import static pages.HomePage.*;

public class HomePageSteps extends BaseSteps {

    @Step("Принять куки")
    public HomePageSteps acceptCookies() {
        clickBy(acceptPrivacyButton);

        return this;
    }

    @Step("Нажать на кнопку поиска")
    public HomePageSteps clickSearchButton() {
        clickBy(searchButton);

        return this;
    }

    @Step("Нажать на кнопку аккаунта")
    public HomePageSteps clickAccButton() {
        clickBy(accountButton);

        return this;
    }

    @Step("Нажать на кнопку открытия логина для входа в аккаунт")
    public LoginSteps clickSignInButton() {
        clickBy(signInButton);

        return new LoginSteps();
    }

    public HomePageSteps clickDetails() {
        clickBy(description);

        return this;
    }
}

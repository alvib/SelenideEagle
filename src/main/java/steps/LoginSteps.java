package steps;

import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static pages.Login.*;

public class LoginSteps extends BaseSteps {

    @Step("Вставить в поле email: {message}")
    public LoginSteps inputEmail(String message) {
        fillField(email, message);

        return this;
    }

    @Step("Вставить в поле пароль: {message}")
    public LoginSteps inputPassword(String message) {
        fillField(password, message);

        return this;
    }

    @Step("Нажать на кнопку логина")
    public LoginSteps clickLoginButton() {
        clickBy(loginButton);

        return this;
    }

    @Step("Показывается ошибка о неправильном email/пароле")
    public LoginSteps verifyErrorEmailOrPasswordMessage(String expectedErrorMessage) {
        $(wrongEmailOrPasswordMessage).shouldHave(text(expectedErrorMessage));

        return this;
    }

    @Step("Показывается ошибка об отсутствующем email")
    public LoginSteps verifyErrorNoEmailMessage(String expectedErrorMessage) {
        $(noEmailMessage).shouldHave(text(expectedErrorMessage));

        return this;
    }

    @Step("Кнопка выхода из аккаунта видна")
    public LoginSteps showSignOutButton() {
        $(signOutButton).shouldBe(visible, Duration.ofSeconds(15));

        return this;
    }

    @Step("Показано имя авторизованного аккаунта: {expectedName}")
    public LoginSteps verifyAccName(String expectedName) {
        $(accountNameText).shouldHave(text(expectedName));

        return this;
    }
}

package steps;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.closeWindow;
import static com.codeborne.selenide.Selenide.open;

public class BrowserSteps {

    @Step("Открыть страницу: '{url]'")
    public BrowserSteps openPage(String url) {
        Configuration.proxyEnabled = false;

        open(url);

        return this;
    }

    @Step("Закрыть браузер")
    public BrowserSteps closeBrowser() {
        closeWindow();

        return this;
    }
}

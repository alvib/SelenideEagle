package steps;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static pages.DetailsPage.*;

public class DetailsSteps extends BaseSteps {

    @Step("Нажать на кнопку SizeCharts")
    public DetailsSteps clickSizeCharts() {
        clickBy(sizeCharts);

        return this;
    }

    @Step("Нажать на кнопку женской одежды")
    public DetailsSteps clickWomensCloth() {
        clickBy(womensCloth);

        return this;
    }

    @Step("Нажать на кнопку открытия таблицы Women's International")
    public DetailsSteps clickWomensInternational() {
        clickBy(womensInternational);

        return this;
    }

    @Step("Просмотр видов размерной таблицы женской одежды")
    public DetailsSteps showWomensSizeCountries() {
        $$("div[class*='_content_dv9ulc'] p table:nth-of-type(2) tbody tr th").shouldHave(CollectionCondition.texts(
                "U.S.",
                             "U.S.",
                             "Canada",
                             "Mexico",
                             "U.K.",
                             "EU",
                             "China",
                             "Japan",
                             "Korea"
        ));

        return this;
    }

    @Step("Заголовок 'Want to chat' отображается полностью")
    public DetailsSteps showWantToHeader() {
        $(withText("WANT TO")).shouldHave(Condition.text("WANT TO CHAT? WE'RE HERE FOR YOU!"));

        return this;
    }

    @Step("Прокрутка страницы вниз")
    public DetailsSteps scrollDetailsPageDown() {
        $(termsOfUse).scrollIntoView(true);

        return this;
    }

    @Step("Кнопка прокрутки страницы вверх отображается")
    public DetailsSteps showScrollUpButton() {
        $(scrollUpButton).exists();

        return this;
    }
}

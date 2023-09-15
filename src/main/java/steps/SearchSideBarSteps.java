package steps;

import io.qameta.allure.Step;

import static pages.SearchSideBar.searchField;
import static pages.SearchSideBar.searchSideBarButton;

public class SearchSideBarSteps extends BaseSteps {

    @Step("Вставить в поле поиска текст(артикул): {message}")
    public SearchSideBarSteps inputSearchField(String message) {
        fillField(searchField, message);

        return this;
    }

    @Step("Нажать на кнопку поиска артикула")
    public SearchSideBarSteps clickSearchSideButton() {
        clickBy(searchSideBarButton);

        return this;
    }
}

package steps;

import com.codeborne.selenide.CollectionCondition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$$;
import static pages.SearchResultsPage.resultOfSearchList;

public class SearchResultsSteps extends BaseSteps {

    @Step("Сравнение кол-ва товаров в результате поиска товаров по артикулу")
    public SearchResultsSteps verifyNumberOfProductIsDisplayed (int numProducts) {
        $$(resultOfSearchList).shouldHave(CollectionCondition.size(numProducts));

        return this;
    }
}

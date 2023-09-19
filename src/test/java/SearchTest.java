import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SearchTest extends BaseTest {

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
}

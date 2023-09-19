import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DetailsTests extends BaseTest {

    @Description("Позитивный тест: Просмотр стран по женской размерной сетке.")
    @DisplayName("Отображение стран по женской размерной сетке")
    @Test
    public void countriesAreVisible() {
        browserManager.homePage.acceptCookies();
        browserManager.homePage.clickDetails();
        browserManager.detailsPage.clickSizeCharts();
        browserManager.detailsPage.clickWomensCloth();
        browserManager.detailsPage.clickWomensInternational();
        browserManager.detailsPage.showWomensSizeCountries();
    }

    @Description("Позитивный тест: Заголовок 'Want to chat' отображается полностью")
    @DisplayName("Отображение заголовка с Want to")
    @Test
    public void promotionTextIsVisible() {
        browserManager.homePage.acceptCookies();
        browserManager.homePage.clickDetails();
        browserManager.detailsPage.showWantToHeader();
    }

    @Description("Позитивный тест: При прокручивании страницы вниз появляется кнопка для автопрокрутки страницы вверх")
    @DisplayName("Кнопка прокрутки страницы Details вверх существует")
    @Test
    public void scrollUpExists() {
        browserManager.homePage.acceptCookies();
        browserManager.homePage.clickDetails();
        browserManager.detailsPage.scrollDetailsPageDown();
        browserManager.detailsPage.showScrollUpButton();
    }
}

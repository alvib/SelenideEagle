package pages;

import jdk.jfr.Description;
import org.openqa.selenium.By;

public class HomePage {

    @Description("Кнопка принятия куки на главной странице")
    public static final By acceptPrivacyButton = By.xpath("//button[@id='onetrust-accept-btn-handler']");

    @Description("Кнопка поиска на главной странице")
    public static final By searchButton = By.xpath("//button[contains(@class, 'btn-link qa-btn-search-cta')]");

    @Description("Кнопка учетной записи на главной странице")
    public static final By accountButton = By.xpath("//a[contains(@class, 'clickable qa-show-sidetray-account')]");

    @Description("Кнопка открытия окна аккаунта для логина")
    public static final By signInButton = By.xpath("//button[@name='signin']");
}

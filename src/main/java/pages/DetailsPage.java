package pages;

import jdk.jfr.Description;
import org.openqa.selenium.By;

public class DetailsPage {

    @Description("Кнопка открытия выбора вида одежды для просмотра размерной таблицы")
    public static final By sizeCharts = By.xpath("//button[text()='Size Charts']");

    @Description("Кнопка открытия страницы с женской размерной сеткой")
    public static final By womensCloth = By.xpath("//a[@href='/us/en/content/help/women-size-chart']");

    @Description("Кнопка открытия таблицы Women's International")
    public static final By womensInternational = By.xpath("//span[@aria-controls='blt0aaadfdd81225188_section_6-help']");

    @Description("Кнопка прокрутки страницы Details вверх")
    public static final By scrollUpButton = By.xpath("//button[contains(@class, '_back-to-top_1uy7f5')]");

    @Description("Ссылка на условия использования сайта")
    public static final By termsOfUse = By.xpath("//a[contains(@class, 'footer-link-aeo-terms')]");
}

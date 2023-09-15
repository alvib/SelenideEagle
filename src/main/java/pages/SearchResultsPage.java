package pages;

import jdk.jfr.Description;
import org.openqa.selenium.By;

public class SearchResultsPage {

    @Description("Кол-во найденных элементов на странице")
    public static final By resultOfSearchList = By.xpath("//div[@class='results-list qa-search-results-list']//div[contains(@class, 'product-tile qa-product-tile __eadf2')]");
}

package Safron.JollyBell.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class JollyHeaderViewElements extends BasePage {
    public JollyHeaderViewElements(WebDriver driver) {
        super(driver);
    }

    private static final String HEADER_BTNS = "//li[@class='header-menu-item']/a";
    private static final String LANGUAGE = "//div[@class='header-second-other']//div[contains(@class,'select language')]";
    private static final String ENG_RU_UK = "//li[@class='select-list-value']";
    private static final String CURRENCY_SWITCHER = "//div[@class='header-second-other']//div[contains(@class,'select currency-switcher')]";
    private static final String PRICES = "//div[@class='price-current']";

    public List<WebElement> headerBtns() {
        return $$(HEADER_BTNS);
    }

    public List<WebElement> engRuUk() {
        return $$(ENG_RU_UK);
    }

    public WebElement language() {
        return $(LANGUAGE);
    }

    public WebElement waitTo(String text) {
        return $("//*[contains(text(),'" + text + "')]");
    }

    public WebElement currencySwitcher() {
        return $(CURRENCY_SWITCHER);
    }

    public List<WebElement> prices() {
        return $$(PRICES);
    }

    public WebElement currency(String currency) {
        return $("//li[contains(text(),'" + currency.toUpperCase() + "')]");
    }

    public WebElement currencySwitcher(String currency) {
        return $("//div[@class='header-second-other']//div[contains(text()," + currency + ")]");
    }
}
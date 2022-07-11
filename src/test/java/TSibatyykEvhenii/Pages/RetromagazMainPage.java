package TSibatyykEvhenii.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RetromagazMainPage extends BasePage {

    public RetromagazMainPage(WebDriver driver) {
        super(driver);
    }

    public void goToRetroMagaz() {
        driver.get("https://retromagaz.com/");
    }

    private static final String SEARCH_FIELD = "//input[@id='search']";
    private static final String SEARCH_BTN = "//button[@class='search-icon']";
    private static final String SEARCH_LIST = "//a[@class='search_result__item']";
    private static final String CONSOLE_CARDS = "//div[@class='game-card  ']";
    private static final String BTN_BUY = "//a[@id='btn-by']";
    private static final String TO_ORDER_BTN = "//a[contains(@class,'with-shadow')]";


    public WebElement goToSearchField() {
        return $(SEARCH_FIELD);
    }

    public WebElement searchBtn() {
        return $(SEARCH_BTN);
    }

    public List<WebElement> listSearchFieldFrom() {
        return $$(SEARCH_LIST);
    }

    public List<WebElement> listOfSearchResult() {
        return $$(CONSOLE_CARDS);
    }

    public WebElement getBuyBtn() {
        return $(BTN_BUY);
    }

    public List<WebElement> getToOrderBtn() {
        return $$(TO_ORDER_BTN);
    }
}
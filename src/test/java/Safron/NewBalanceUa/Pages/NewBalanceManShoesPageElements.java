package Safron.NewBalanceUa.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NewBalanceManShoesPageElements extends BasePage {
    public NewBalanceManShoesPageElements(WebDriver driver) {
        super(driver);
    }

    private static final String SIZE_BOARD_ELEMENTS = "//label[contains(@for,'sizeCode')]";
    private static final String UK_SIZE_BTN = "//span[@data-size='UK']";
    private static final String EU_SIZE_BTN = "//span[@data-size='EU']";
    private static final String UA_SIZE_BTN = "//span[@data-size='UA']";
    private static final String FOR_RUN = "//li[@class='category-list__item ']//a[contains(@href,'dla-bigu')]";
    private static final String CROSS_COUNTRY = "//ul//a[contains(@href,'dla-pere')]";
    private static final String SHOES_PRICE = "//span[@class='prices__price ']";
    private static final String SORT_LOW_HIGH = "//a[contains(text(),'дешеві')]";

    public List<WebElement> sizeBoard() {
        return $$(SIZE_BOARD_ELEMENTS);
    }

    public WebElement ukSizeBtn() {
        return $(UK_SIZE_BTN);
    }

    public WebElement euSizeBtn() {
        return $(EU_SIZE_BTN);
    }

    public WebElement uaSizeBtn() {
        return $(UA_SIZE_BTN);
    }

    public List<WebElement> runShoes(){
        return $$(FOR_RUN);
    }

    public WebElement shoesForRun(){
        return runShoes().get(0);
    }

    public WebElement crossCountry(){
        return $(CROSS_COUNTRY);
    }

    public List<WebElement> shoesPrice(){
        return $$(SHOES_PRICE);
    }

    public WebElement sortLowHigh(){
        return $(SORT_LOW_HIGH);
    }
}

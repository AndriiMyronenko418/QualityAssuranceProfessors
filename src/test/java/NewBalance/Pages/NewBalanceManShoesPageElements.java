package NewBalance.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NewBalanceManShoesPageElements extends BasePage {
    public NewBalanceManShoesPageElements(WebDriver driver) {
        super(driver);
    }

    private static final String FOR_RUN = "//li[@class='category-list__item ']//a[contains(@href,'dla-bigu')]";
    private static final String CROSS_COUNTRY = "//ul//a[contains(@href,'dla-pere')]";
    private static final String MIN_PRICE = "//input[@id='amount_min']";
    private static final String MAX_PRICE = "//input[@id='amount_max']";
    private static final String SLIDER = "//*[@id='sl-range']/div/div[2]/div";
    private static final String SHOES_PRICE = "//span[@class='prices__price ']";
    private static final String SORT = "//a[contains(text(),'%s')]";
    private static final String PRODUCT_PRICE_OLD_OR_DISCOUNT = "//span[@class='prices__price prices__price_%s']";

    public WebElement minPrice() {
        return $(MIN_PRICE);
    }

    public WebElement maxPrice() {
        return $(MAX_PRICE);
    }

    public WebElement slider() {
        return $(SLIDER);
    }

    public List<WebElement> runShoes() {
        return $$(FOR_RUN);
    }

    public WebElement shoesForRun() {
        return runShoes().get(0);
    }

    public WebElement crossCountry() {
        return $(CROSS_COUNTRY);
    }

    public List<WebElement> shoesPrice() {
        return $$(SHOES_PRICE);
    }

    public WebElement sort(String typeOfSort) {
        return $(String.format((SORT), typeOfSort.toLowerCase()));
    }

    public List<WebElement> priceOldOrDiscount(String kindOfPrice) {
        return $$(String.format((PRODUCT_PRICE_OLD_OR_DISCOUNT), kindOfPrice.toLowerCase()));
    }
}

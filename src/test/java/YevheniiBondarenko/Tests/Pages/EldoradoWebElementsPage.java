package YevheniiBondarenko.Tests.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class EldoradoWebElementsPage extends BasePage {
    public EldoradoWebElementsPage(WebDriver driver) {
        super(driver);
    }

    private static final String SEARCH_FIELD = "//input[@class='search-input']";
    private static final String MOBILE_PHONES = "//li[@class='cat-title']/child::a[contains(text(),'Мобільні телефони')]";
    private static final String BROVARY_CITY = "//div[@id='input-66']";
    private static final String LIST_OF_MOBILE_PHONES = "//div[@class='goods-item-content']";
    private static final String COLOR_OF_THE_PHONE = "//ul[@class='product-color-list product-page-colors-list']/child::li";
    private static final String BUY_BUTTON = "(//div[contains(@class,'buy-button-placeholder')]/div)[2]";
    private static final String CART_ITEMS_NUMBER = "//div[@class='counter counter-cart active']";
    private static final String DELETE_ITEMS_FROM_CART = "//*[name()='svg']";

    public WebElement searchingField() {
        return $(SEARCH_FIELD);
    }

    public WebElement mobilePhones() {
        return $(MOBILE_PHONES);
    }

    public WebElement brovaryCity() {
        return $(BROVARY_CITY);
    }

    public WebElement cartItemsNumber() {
        return $(CART_ITEMS_NUMBER);
    }

    public List<WebElement> listOfMobilePhones() {
        return $$(LIST_OF_MOBILE_PHONES);
    }

    public List<WebElement> colorOfMobilePhones() {
        return $$(COLOR_OF_THE_PHONE);
    }

    public WebElement buyButton() {
        return $(BUY_BUTTON);
    }

    public List<WebElement> deleteItemsFromCart() {
        return $$(DELETE_ITEMS_FROM_CART);
    }
}
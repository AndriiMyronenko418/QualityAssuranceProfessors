package YevheniiBondarenko.Tests.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePageWebElements extends BasePage {

    public HomePageWebElements(WebDriver driver) {
        super(driver);
    }

    public static final String SEARCH_SELECTOR_MENU = "//div[@class='searchSelect']";
    public static final String MUSIC_FROM_SEARCH_MENU = "//*[@id='header']/div[1]/div/div/div[1]/div/ul/li[8]";
    public static final String SEARCH_FIELD = "//input[@type='text']";
    public static final String BUY_BUTTON_FOR_FIST_ELEMENT = "//input[@name='DataListItems$ctl00$btnBuyNow']";
    public static final String ADD_PRODUCT_BUTTON = "//span[@class='jiahao cl_plus']";
    public static final String REMOVE_IN_ONE_CLICK_BUTTON = "//div[@class='remove-from-bag']";
    public static final String BASKET_INFO = "//div[@class='basket-item-info']";
    public static final String HEADER_MENU = "//ul[@class='navs']//child::li";
    public static final String MENS_MENU_LIST_OF_ITEM = "//div[@class='item']//child::li";
    public static final String BRANDS_BTN = "//li[@class='brandlist']";
    public static final String MENS_SHOES_BRAND_LIST = "//div[@id='brandlist']//label[@class='zhuangtai ']";
    public static final String QUANTITY_OF_ITEMS = "//span[@class='Image__Loader']";
    //footer menu
    public static final String LANGUAGE_LIST = "//ul[@class='National-flag']//child::li";
    public static final String CURRENCY_BUTTON = "//div[@class='drop-down-Currency']";

    public List<WebElement> headerMenu() {
        return $$(HEADER_MENU);
    }

    public List<WebElement> mensItemList() {
        return $$(MENS_MENU_LIST_OF_ITEM);
    }

    public WebElement brandsButton() {
        return $(BRANDS_BTN);
    }

    public List<WebElement> shoesBrandList() {
        return $$(MENS_SHOES_BRAND_LIST);
    }

    public List<WebElement> itemQuantityDisplay() {
        return $$(QUANTITY_OF_ITEMS);
    }

    public WebElement searchSelectorMenu() {
        return $(SEARCH_SELECTOR_MENU);
    }

    public WebElement CategoryMusicFromSearchSelectorMenu() {
        return $(MUSIC_FROM_SEARCH_MENU);
    }

    public List<WebElement> searchField() {
        return $$(SEARCH_FIELD);
    }

    public WebElement buyButtonForFirstElement() {
        return $(BUY_BUTTON_FOR_FIST_ELEMENT);
    }

    public WebElement addProductButton() {
        return $(ADD_PRODUCT_BUTTON);
    }

    public WebElement removeInOneClick() {
        return $(REMOVE_IN_ONE_CLICK_BUTTON);
    }

    public WebElement itemsInsideBasket() {
        return $(BASKET_INFO);
    }

    public List<WebElement> languagesMenu() {
        return $$(LANGUAGE_LIST);
    }

    public WebElement currencyButton() {
        return $(CURRENCY_BUTTON);
    }
}


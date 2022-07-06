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
    public static final String SEARCH_FIELD ="//input[@type='text']";
    public static final String BUY_BUTTON_FOR_FIST_ELEMENT = "//input[@name='DataListItems$ctl00$btnBuyNow']";
    public static final String ADD_PRODUCT_BUTTON = "//span[@class='jiahao cl_plus']";
    public static final String REMOVE_IN_ONE_CLICK_BUTTON = "//div[@class='remove-from-bag']";
    public static final String BASKET_INFO = "//div[@class='basket-item-info']";

    public WebElement searchSelectorMenu(){return $(SEARCH_SELECTOR_MENU);
    }
    public WebElement CategoryMusicFromSearchSelectorMenu(){return $(MUSIC_FROM_SEARCH_MENU);}

    public List<WebElement> searchField(){return $$(SEARCH_FIELD);}

    public WebElement buyButtonForFirstElement(){return $(BUY_BUTTON_FOR_FIST_ELEMENT);}

    public WebElement addProductButton(){return $(ADD_PRODUCT_BUTTON);}

    public WebElement removeInOneClick(){return $(REMOVE_IN_ONE_CLICK_BUTTON);}

    public WebElement itemsInsideBasket(){return $(BASKET_INFO);}



}


package IraKaminska.Amazon.PagesAmazon;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageAmazon extends BasePage {

    public HomePageAmazon(WebDriver driver) {
        super(driver);
    }

    private static final String ALL_MENU_BUTTON = "//span[@class='hm-icon-label']";
    private static final String SEE_ALL_BUTTON = "//a[@class='hmenu-item hmenu-compressed-btn']";
    private static final String PET_SUPPLIES = "//a[@data-menu-id='21']";
    private static final String DOGS_PET_SUPPLIES = "//a[text()= 'Dogs']";
    private static final String SIGN_IN_BUTTON = "//span[@id='nav-link-accountList-nav-line-1']";
    private static final String TODAYS_DEALS = "//a[@href='/gp/goldbox?ref_=nav_cs_gb']";
    private static final String BEAUTY_AND_PERSONAL_CARE_BUTTON = "//div[text()= 'Beauty and personal care']";
    private static final String FRAGRANCE_BUTTON = "//a[text()= 'Fragrance']";
    private static final String SHOP_NOW_BY_CATEGORY_BUTTON = "//a[@href='/b?node=17938598011']";
    private static final String CUSTOMER_SERVICE = "//a[@class='hmenu-item' and text()= 'Customer Service']";
    private static final String REGISTRY_BUTTON = "//a[text()= 'Registry']";
    private static final String DELIVER_DONT_CHANGE = "//input[@class='a-button-input']";
    private static final String GIFT_CARDS = "//a[text()= 'Gift Cards']";

    public WebElement getAllMenuButton() {
        return $(ALL_MENU_BUTTON);
    }

    public WebElement getPetSuppliesButton() {
        return $(PET_SUPPLIES);
    }

    public WebElement getSeeAllButton() {
        return $$(SEE_ALL_BUTTON).get(0);
    }

    public WebElement getDogsPetSuppliesButton() {
        return $(DOGS_PET_SUPPLIES);
    }

    public WebElement getSignInButton() {
        return $(SIGN_IN_BUTTON);
    }

    public WebElement getTodaysDealsButton() {
        return $(TODAYS_DEALS);
    }

    public WebElement getBeautyAndPersonalCareButton() {
        return $(BEAUTY_AND_PERSONAL_CARE_BUTTON);
    }

    public WebElement getFragranceButton() {
        return $(FRAGRANCE_BUTTON);
    }

    public WebElement getShopNowByCategoryButton() {
        return $(SHOP_NOW_BY_CATEGORY_BUTTON);
    }

    public WebElement getCustomerServiceButton() {
        return $(CUSTOMER_SERVICE);
    }

    public WebElement getRegisrtyButton() {
        return $(REGISTRY_BUTTON);
    }

    public void getDeliverDontChangeButton() {
        if ($$(DELIVER_DONT_CHANGE).size() > 0) {
            $$(DELIVER_DONT_CHANGE).get(0).click();
        }
    }

    public WebElement getGiftCardsButton() {
        return $(GIFT_CARDS);
    }
}
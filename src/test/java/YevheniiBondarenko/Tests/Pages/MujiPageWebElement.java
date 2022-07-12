package YevheniiBondarenko.Tests.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MujiPageWebElement extends BasePage {
    public MujiPageWebElement(WebDriver driver) {
        super(driver);
    }

    private static final String NORTH_AMERICA = "//div[@class='northAmerica']//ul/child::li/a";
    private static final String COOKIES_CLOSED_BTN = "//button[@class='optanon-alert-box-close banner-close-button']";
    private static final String ONLINE_STORE_BTN = "//div[@class='wrapper']/ul/child::li/a[text()='Online Store']";
    private static final String LOG_IN_BTN = "//li[@class='site-header-account-link']/a[contains(text(),'Login')]";
    private static final String MY_ACCOUNT_BTN = "//a[text()='My Account']";
    private static final String LOGIN_INPUT = "//input[@class='form-field-input form-field-text']";
    private static final String SING_IN_LOG_BTN = "//button[contains(text(),'Sign in')]";
    private static final String HEADER_MENU = "//nav[@class='site-navigation']/ul/child::li";
    private static final String CHOPSTICK_BTN = "//li/a[@class='navmenu-link '][contains(text(),'Chopsticks')]";
    private static final String CHOPSTICK_FILTER = "//*[@class='checkmark']";
    private static final String GROUP_OF_ITEMS_CHOP = "//ul[contains(@class, 'productgrid--items')]//li";
    private static final String ADD_TO_CART = "//button[@class='product-form--atc-button mdc-ripple-surface mdc-ripple-upgraded']";
    private static final String CHECKOUT = "//div[@class='qimify-minicart-btn qimify-minicart-viewcart']";
    private static final String CART_ITEM = "//li[@class='cart-item']";
    private static final String QUANTITY = "//input[@class='form-field-input form-field-number form-field-filled']";
    private static final String PASSWORD = "//input[@id='customer_password']";
    private static final String SING_IN = "//button[contains(text(),'Sign in')]";

    public List<WebElement> northAmericaList() {
        return $$(NORTH_AMERICA);
    }

    public List<WebElement> logInBtn() {
        return $$(LOG_IN_BTN);
    }

    public List<WebElement> loginInput() {
        return $$(LOGIN_INPUT);
    }

    public List<WebElement> headerMenu() {
        return $$(HEADER_MENU);
    }

    public List<WebElement> chopstickFilter() {
        return $$(CHOPSTICK_FILTER);
    }

    public List<WebElement> groupOfItemsChopstick() {
        return $$(GROUP_OF_ITEMS_CHOP);
    }

    public WebElement cookieClosedBtn() {
        return $(COOKIES_CLOSED_BTN);
    }

    public WebElement onlineStoreBtn() {
        return $(ONLINE_STORE_BTN);
    }

    public WebElement myAccountBtn() {
        return $(MY_ACCOUNT_BTN);
    }

    public WebElement singingLogBtn() {
        return $(SING_IN_LOG_BTN);
    }

    public WebElement chopstick() {
        return $(CHOPSTICK_BTN);
    }

    public WebElement addToCartBtn() {
        return $(ADD_TO_CART);
    }

    public WebElement checkout() {
        return $(CHECKOUT);
    }

    public WebElement cartItem() {
        return $(CART_ITEM);
    }

    public WebElement quantity() {
        return $(QUANTITY);
    }

    public WebElement password() {
        return $(PASSWORD);
    }

    public WebElement singIn() {
        return $(SING_IN);
    }

    public void loginInputM() {
        loginInput().get(0).sendKeys("interdancecoach@gmail.com");
        password().sendKeys("1234567888");

    }
}
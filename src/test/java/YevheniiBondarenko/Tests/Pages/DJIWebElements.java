package YevheniiBondarenko.Tests.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DJIWebElements extends BasePage {

    public DJIWebElements(WebDriver driver) {
        super(driver);
    }

    private static final String MAIN_PRODUCT_MENU = "//a[@class='products-menu__title-link _products-menu']";
    private static final String ACTION_2 = "//span[@class='productsMenu-submenu-t'][text()='ACTION 2']";
    private static final String ACTION_2_ITEMS = "//div/a[text()='Екшн-камера DJI Action 2 Power Combo']";
    private static final String BUY_BTN = "//span[@class='btn-content'][text()='Купити']";
    private static final String CLOSED_POP_UP = "//a[@class='popup-close'][@onclick='Modal.close(); return false;']";
    private static final String CART_ITEMS_NUMBER = "//div[@class='basket__items']";
    private static final String ENTER = "//span[@class='userbar__button-text']";
    private static final String INPUT_EMAIL = "//input[@name='user[email]'][@class='field j-focus'][@tabindex='1']";
    private static final String INPUT_PASSWORD = "//input[@type='password'][@tabindex='2']";
    private static final String ENTER_BTN = "//*[contains(text(),'Увійти')]";
    private static final String USER_NAME = "//span[@class='userbar__button-text'][text()='Yevhenii Bondarenko']";
    private static final String EXIT_USER_ACCOUNT = "//a[@class='userbar__menu-link j-widget-ajax-link']";

    public List<WebElement> mainProductMenu() {
        return $$(MAIN_PRODUCT_MENU);
    }

    public WebElement action2() {
        return $(ACTION_2);
    }

    public List<WebElement> action2Items() {
        return $$(ACTION_2_ITEMS);
    }

    public WebElement buyBtn() {
        return $(BUY_BTN);
    }

    public WebElement closedPopUp() {
        return $(CLOSED_POP_UP);
    }

    public WebElement cardItemNumber() {
        return $(CART_ITEMS_NUMBER);
    }

    public WebElement enter() {
        return $(ENTER);
    }

    public WebElement inputEmail() {
        return $(INPUT_EMAIL);
    }

    public WebElement inputPassword() {
        return $(INPUT_PASSWORD);
    }

    public List<WebElement> enterBtn() {
        return $$(ENTER_BTN);
    }

    public WebElement userName() {
        return $(USER_NAME);
    }

    public WebElement exitUserAccount() {
        return $(EXIT_USER_ACCOUNT);
    }
}
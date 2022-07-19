package Sprint2.NewBalance.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewBalanceHeaderViewElements extends BasePage {

    public NewBalanceHeaderViewElements(WebDriver driver) {
        super(driver);
    }

    private static final String MAN_CATALOG_BTN = "//a[contains(text(),'Чоловікам')]";
    private static final String MAN_ALL_SHOES = "//li[@class='nav__arrow']//a[@href='/store/man/vzutta']";
    private static final String SIGN_IN_BTN = "//div[@class='nav__content']//span[contains(text(),'Вхід')]";
    private static final String MY_ACCOUNT_BTN = "//span[contains(text(),'Мій Аккаунт') and not(@class='auth__text auth__text_nav-mob')]";
    private static final String SEARCH_FIELD = "//input[@name='s']";
    private static final String SEARCH_BTN = "//label//button[@type='submit']";
    private static final String CART = "//a[contains(@class,'cart')]";

    public WebElement manCatalogBtn() {
        return $(MAN_CATALOG_BTN);
    }

    public WebElement manAllShoesBtn() {
        return $(MAN_ALL_SHOES);
    }

    public WebElement signInBtn() {
        return $(SIGN_IN_BTN);
    }

    public WebElement myAccountBtn() {
        return $(MY_ACCOUNT_BTN);
    }

    public WebElement searchField() {
        return $(SEARCH_FIELD);
    }

    public WebElement searchBtn() {
        return $(SEARCH_BTN);
    }

    public WebElement cart() {
        return $(CART);
    }

    public void cartClick() {
        try {
            cart().click();
        } catch (ElementClickInterceptedException e) {
            e.printStackTrace();
        }
    }
}

package AndriiTest.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private static final String ALLOW_ALL_COOKIE_BTN = "//div[@id='onetrust-button-group']//button[contains(@id,'accept')]";
    //header
    private static final String HEADER_OPTION = "//ul[@role='menubar']/li/a[contains(@href,'%s')]";
    private static final String DROPDOWN_WINDOW_OPTION = "//ul[@id='topnav-dropdown-1342722']//a[contains(@href,'%s')]";
    private static final String FLAG_BTN = "//a/span[contains(@class,'country')]";
    private static final String FAVOURITES_BTN = "//a[@id='btn_wishlist']";
    //body
    private static final String PRICES = "//span[@class='pr-price']";
    private static final String SHOP_BY_OPTION = "//div[@class='shopby--container row']//a[contains(@href,'%s')]";

    public List<WebElement> getPrices() {
        return $$(PRICES);
    }

    public WebElement getFlag() {
        return $(FLAG_BTN);
    }

    public WebElement getFavourites() {
        return $(FAVOURITES_BTN);
    }

    public WebElement getAllowAllCookieBtn() {
        return $(ALLOW_ALL_COOKIE_BTN);
    }

    public WebElement getDropdownWindowOption(String option) {
        return $(String.format(DROPDOWN_WINDOW_OPTION, option));
    }

    public WebElement getHeaderOption(String option) {
        return $(String.format(HEADER_OPTION, option));
    }

    public WebElement getShopByOption(String option) {
        return $(String.format(SHOP_BY_OPTION, option));
    }
}
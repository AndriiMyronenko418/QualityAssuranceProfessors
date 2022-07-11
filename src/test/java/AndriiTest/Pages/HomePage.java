package AndriiTest.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private static final String ALLOW_ALL_COOKIE_BTN = "//div[@id='onetrust-button-group']//button[contains(@id, 'accept')]";
    private static final String MEN_DROPDOWN_BTN = "//a[contains(@id, '1342722')]";
    private static final String MEN_CLASSICS_BTN = "//a[contains(@href, '/men-shoes-classics')]";
    private static final String FLAG_BTN = "//a/span[contains(@class, 'country')]";
    private static final String PRICES = "//span[@class='pr-price']";

    public List<WebElement> getPrices() {
        return $$(PRICES);
    }

    public WebElement getFlag() {
        return $(FLAG_BTN);
    }

    public WebElement getAllowAllCookieBtn() {
        return $(ALLOW_ALL_COOKIE_BTN);
    }

    public WebElement getManClassicsBtn() {
        return $(MEN_CLASSICS_BTN);
    }

    public WebElement getManDropdownBtn() {
        return $(MEN_DROPDOWN_BTN);
    }
}
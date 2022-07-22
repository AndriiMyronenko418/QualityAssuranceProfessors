package NewBalance.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NewBalanceWomanShoesPage extends BasePage {

    public NewBalanceWomanShoesPage(WebDriver driver) {
        super(driver);
    }

    private static final String WOMEN_SHOE_PRICES = "//span[@class='prices__price ']";
    private static final String SHOES_STR_OPT = "//a[@class='nav__sub-menu-link'][contains(@href,'/%s/%s/%s')]";

    public List<WebElement> shoePrices() {
        return $$(WOMEN_SHOE_PRICES);
    }

    public WebElement getProduct(String sexOrAge, String clothes, String functionality) {
        return $(String.format(SHOES_STR_OPT, sexOrAge, clothes, functionality));
    }
}
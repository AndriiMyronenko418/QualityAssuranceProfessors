package Safron.NewBalanceUa.Pages;

import BasePageAndTestInit.BasePage;
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
}

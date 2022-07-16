package TSibatyykEvhenii.Pages.CustomPage;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CustomPrintMainPage extends BasePage {

    public CustomPrintMainPage(WebDriver driver) {
        super(driver);
    }

    private static final String LANGUAGE_SHOW_BTN = "//div[contains(@class,'item--language')]";
    private static final String DROP_DOWN_MENU_BTN = "(//div[contains(@class,'p-dropdown__button')])[5]";
    private static final String UKRAINIAN_LANGUAGE_BTN = "//a[contains(text(),'Українська')]";
    private static final String ACCEPT_CHANGES = "(//div[contains(@class,'p-button--inline')])[5]";
    private static final String MAIN_BTN = "//div[contains(text(),'Основа')]";
    private static final String MEN_CATALOG = "//a[contains(@href,'catalogue-t-shirts-men')]";
    private static final String FAVOURITE_TISHERTS_BTN = "//a[contains(@class,'p-catalogue-item__favorite')]";
    private static final String LOGIN_BTN = "//div[contains(@class,'p-header-profile__item--profile')]";
    private static final String COOL_TISHERTS = "//a[contains(@href,'catalogue-t-shirts')]";
    private static final String FAVOURITE_BTN = "//div[contains(@class,'p-header-profile__item--favorite')]";

    public WebElement languageBtn() {
        return $(LANGUAGE_SHOW_BTN);
    }

    public WebElement dropDownMenuBtn() {
        return $(DROP_DOWN_MENU_BTN);
    }

    public WebElement ukrainianBtn() {
        return $(UKRAINIAN_LANGUAGE_BTN);
    }

    public WebElement acceptChanges() {
        return $(ACCEPT_CHANGES);
    }

    public WebElement favouriteBtnHart() {
        return $(FAVOURITE_BTN);
    }

    public WebElement mainBtn() {
        return $(MAIN_BTN);
    }

    public WebElement menCatalog() {
        return $(MEN_CATALOG);
    }

    public List<WebElement> favouriteBtn() {
        return $$(FAVOURITE_TISHERTS_BTN);
    }

    public WebElement loginBtn() {
        return $(LOGIN_BTN);
    }

    public WebElement coolTsherts() {
        return $(COOL_TISHERTS);
    }

    public void favouriteTiShertsBtn() {
        favouriteBtn().get(0).click();
        favouriteBtn().get(1).click();
        favouriteBtn().get(2).click();
        favouriteBtn().get(3).click();
    }

    public void changeLanguage() {
        languageBtn().click();
        dropDownMenuBtn().click();
        ukrainianBtn().click();
        acceptChanges().click();
    }
}

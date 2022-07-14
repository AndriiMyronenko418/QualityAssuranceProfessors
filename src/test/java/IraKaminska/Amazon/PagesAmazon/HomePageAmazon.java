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
}
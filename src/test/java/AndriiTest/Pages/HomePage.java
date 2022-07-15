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
    private static final String HELP_BTN = "//a[@title='Get Help']";
    private static final String TRACK_MY_ORDER_BTN = "//a[@title='Track my order']";
    private static final String SIGN_IN_BTN = "//a[@id='btn-myaccount']";
    private static final String SIGN_IN_CREATE_AN_ACCOUNT = "//a[@id='loyaltyEnrollmentLink']";
    private static final String SIGN_IN_INPUT = "//form[@name='registrationform']//input[@name='%s']";
    private static final String SIGN_IN_SELECT_GENDER = "//form[@name='registrationform']//select[@name='gender']";
    private static final String SIGN_IN_PRIVACY_POLICY_CHECKBOX = "//input[@name='privacyPolicyRequirement']";
    private static final String SIGN_IN_NEXT_BTN = "//button[contains(@class,'next button expand ')]";
    private static final String SIGN_IN_ERROR = "//p[@class='error_ERR_GENERIC']";
    //body
    private static final String PRICES = "//span[@class='pr-price']";
    private static final String SHOP_BY_OPTION = "//div[@class='shopby--container row']//a[contains(@href,'%s')]";

    public List<WebElement> getPrices() {
        return $$(PRICES);
    }

    public WebElement getFlag() {
        return $(FLAG_BTN);
    }

    public WebElement getSignInBtn() {
        return $(SIGN_IN_BTN);
    }

    public WebElement getSignInCreateAnAccountBtn() {
        return $(SIGN_IN_CREATE_AN_ACCOUNT);
    }

    public WebElement getFavourites() {
        return $(FAVOURITES_BTN);
    }

    public WebElement getHelpBtn() {
        return $(HELP_BTN);
    }

    public WebElement getTrackMyOrder() {
        return $(TRACK_MY_ORDER_BTN);
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

    public WebElement getSignInInput(String option) {
        return $(String.format(SIGN_IN_INPUT, option));
    }

    public WebElement getSignInSelectGender() {
        return $(SIGN_IN_SELECT_GENDER);
    }

    public WebElement getSignInPrivacyPolicyCheckbox() {
        return $(SIGN_IN_PRIVACY_POLICY_CHECKBOX);
    }

    public WebElement getSignInNextBtn() {
        return $(SIGN_IN_NEXT_BTN);
    }

    public WebElement getSignInError() {
        return $(SIGN_IN_ERROR);
    }
}
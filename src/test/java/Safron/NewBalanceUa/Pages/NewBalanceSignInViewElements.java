package Safron.NewBalanceUa.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewBalanceSignInViewElements extends BasePage {
    public NewBalanceSignInViewElements(WebDriver driver) {
        super(driver);
    }

    private static final String EMAIL_FIELD = "//input[@id='login-email']";
    private static final String PASSWORD_FIELD = "//input[@id='login-pass']";
    private static final String LOGIN_BTN = "//button[@class='btn btn_primary btn_full']";

    public WebElement emailField(){
        return $(EMAIL_FIELD);
    }

    public WebElement passwordField(){
        return $(PASSWORD_FIELD);
    }

    public WebElement loginBtn(){
        return $(LOGIN_BTN);
    }
}

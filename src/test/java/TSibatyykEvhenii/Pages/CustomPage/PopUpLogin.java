package TSibatyykEvhenii.Pages.CustomPage;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PopUpLogin extends BasePage {

    public PopUpLogin(WebDriver driver) {
        super(driver);
    }

    private static final String LOGIN_BTN = "//div[contains(@class,'p-header-profile__item--profile')]";
    private static final String EMAIL_INPUT_FIELD = "(//input[contains(@name,'email')])[2]";
    private static final String PASSWORD_INPUT = "//input[contains(@name,'password')]";
    private static final String ACCEPT_BTN = "(//button[contains(@type,'submit')])[2]";
    private static final String ENTER_BTN = "//li[contains(@class,'p-header-profile-popup__menu-item--accent')]";

    public WebElement loginBtn(){
        return $(LOGIN_BTN);
    }

    public WebElement emailInput(){
        return $(EMAIL_INPUT_FIELD);
    }

    public WebElement passwordInput(){
        return $(PASSWORD_INPUT);
    }

    public WebElement acceptBtn(){
        return $(ACCEPT_BTN);
    }

    public WebElement enterBtn(){
        return $(ENTER_BTN);
    }

    public void logIn(){
        loginBtn().click();
        enterBtn().click();
        emailInput().sendKeys("addres@gmail.com");
        passwordInput().sendKeys("1111qqqq");
        acceptBtn().click();
    }
}
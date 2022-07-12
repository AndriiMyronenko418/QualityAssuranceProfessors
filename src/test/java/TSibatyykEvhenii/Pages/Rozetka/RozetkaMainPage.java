package TSibatyykEvhenii.Pages.Rozetka;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RozetkaMainPage extends BasePage {

    public RozetkaMainPage(WebDriver driver) {
        super(driver);
    }
    private static final String UKR_LANGUAGE = "(//a[contains(@href,'/ua/')])[2]";
    private static final String SEARCH_FIELD = "//input[contains(@name,'search')]";
    private static final String SEARCH_BTN = "//button[contains(@class,'search-form__submit ng-star-inserted')]";
    private static final String CART_BTN = "//button[contains(@class,'header__button--active')]";

    public WebElement ukrLanguage(){
        return $(UKR_LANGUAGE);
    }

    public WebElement searchField(){
        return $(SEARCH_FIELD);
    }

    public WebElement searchBtn(){
        return $(SEARCH_BTN);
    }
    public WebElement cartBtn(){
        return $(CART_BTN);
    }
}
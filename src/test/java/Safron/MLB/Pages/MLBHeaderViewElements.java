package Safron.MLB.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MLBHeaderViewElements extends BasePage {
    public MLBHeaderViewElements(WebDriver driver) {
        super(driver);
    }

    private static final String MEN_CATEGORY_BTN = "//a[@id='4']";
    private static final String NEW_YORK_YANKEES = "//li[@data-trk-id='topnav-group-ga-1']//div[contains(text(),'New York Y')]";
    private static final String POP_UP = "//button[@class='button large modal-close-button unstyled']";

    public WebElement menCategory(){
        return $(MEN_CATEGORY_BTN);
    }

    public WebElement newYorkYankees(){
        return $(MEN_CATEGORY_BTN);
    }

    public WebElement closePopUP(){
        return $(POP_UP);
    }
}

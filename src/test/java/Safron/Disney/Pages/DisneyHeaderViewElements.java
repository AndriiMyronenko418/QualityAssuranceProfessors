package Safron.Disney.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DisneyHeaderViewElements extends BasePage {
    public DisneyHeaderViewElements(WebDriver driver) {
        super(driver);
    }

    private static final String HEADER_SEARCH = "//div[@class='siteSearch__mobile']//span[@class='siteSearch__label']";
    private static final String SEARCH_FIELD = "//form//input[@type='search']";
    private static final String BACK_TO_SCHOOL_CATEGORY_BTN = "//a[@title='Back to School']//span";
    private static final String BAG_BTN = "//span[@class='minicart-quantity-label']";
    private static final String VIEW_WISH_POP_UP_BTN = "//a[@aria-label='View Wish List']";

    public WebElement headerSearch(){
        return $(HEADER_SEARCH);
    }
    public WebElement searchField(){
        return $(SEARCH_FIELD);
    }
    public WebElement backToSchoolCategoryBtn(){
        return $(BACK_TO_SCHOOL_CATEGORY_BTN);
    }
    public WebElement bagBtn(){
        return $(BAG_BTN);
    }
    public WebElement viewWishPopUpBtn(){
        return $(VIEW_WISH_POP_UP_BTN);
    }

}

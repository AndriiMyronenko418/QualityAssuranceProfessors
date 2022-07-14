package YevheniiBondarenko.Tests.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class ChoseNewLocation extends BasePage {

    private static final String CATALOG_OF_PRODUCT ="//div[@class='header__menu-opener-button']";
    private static final String HOUSEHOLD_APPLIANCE ="//a[@title='Побутова техніка']";
    private static final String LIST_OF_PRODUCT_1 = "//a[@class='shop-category__title link link--big link--inverted nc']";
    private static final String AERO_GRILL = "//a[@class='shop-category__title link link--big link--inverted nc'][contains(text(),'Аерогрилі ')]";
    private static final String MY_ITEM ="//a[@class='card__photo'][@title='Аерогриль Saturn ST-CO9151 black']";
    private static final String BUY_BTN = "(//button[@class='p-buy__btn btn btn--yellow'])[1]";
    private static final String BLUE_BUY_BUTTON = "//button[@class='purchase-btn btn btn--1 btn--blue']";
    private static final String YELLOW_NUMBER_ON_THE_CART ="//span[@class='header__cart-counter']";

    public ChoseNewLocation(WebDriver driver) {
        super(driver);
    }
    public WebElement catalogOfProduct(){return $(CATALOG_OF_PRODUCT);}
    public WebElement householdAppliance(){return $(HOUSEHOLD_APPLIANCE);}
    public List<WebElement> listOfProduct1(){return $$(LIST_OF_PRODUCT_1);}
    public WebElement aeroGrill(){return $(AERO_GRILL);}
    public WebElement myChooiseItem(){return $(MY_ITEM);}
    public WebElement buyBtn(){return $(BUY_BTN);}
    public WebElement blueBuyButton(){return $(BLUE_BUY_BUTTON);}
    public WebElement yellowNumberOnACart(){return $(YELLOW_NUMBER_ON_THE_CART);}
}
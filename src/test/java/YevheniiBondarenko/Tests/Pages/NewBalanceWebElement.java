package YevheniiBondarenko.Tests.Pages;
import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class NewBalanceWebElement extends BasePage {
    public NewBalanceWebElement(WebDriver driver) {
        super(driver);
    }

    private static final String SEARCH_FIELD = "//input[@name='s']";
    private static final String SEARCH_BTN = "//button[@type='submit'][@class='search-form__btn icon-search']";
    private static final String SHOES = "//a[@class='category-list__link'][contains(text(),'Взуття')]";
    private static final String FOR_CITY_ROAD = "//a[@class='category-list__link category-list__link_inside'][contains(text(),'Для асфальтного покриття')]";
    private static final String GENDER_MAN = "//label[@data-id='1']";
    private static final String LIST_OF_SIZE = "//div[@class='model-grid__item model-grid__item_size']";
    private static final String KIND_OF_SHOES ="//a[@class='category-list__link category-list__link_inside'][contains(text(),'Для бігу')]";
    private static final String MY_CHOICE = "//a[@class='products__link']";
    private static final String SIZE_BEFORE_CART = "//button[@value='63170']";
    private static final String ADD_TO_CART = "//button[contains(text(),'Додати у кошик')]";
    private static final String ITEM_INSIDE_CART = "//a[@data-shoping='1']";

    public WebElement searchField(){return $(SEARCH_FIELD);}
    public WebElement searchButton(){return $(SEARCH_BTN);}
    public WebElement shoes(){return $(SHOES);}
    public WebElement genderMan(){return $(GENDER_MAN);}
    public WebElement shoesForCityRoad(){return $(FOR_CITY_ROAD);}
    public WebElement myChoice(){return $(MY_CHOICE);}
    public WebElement sizeBeforeCart(){return $(SIZE_BEFORE_CART);}
    public WebElement addToCart(){return $(ADD_TO_CART);}
    public WebElement itemInsideTheCartVisible(){return $(ITEM_INSIDE_CART);}

    public List<WebElement> listOfSize(){return $$(LIST_OF_SIZE);}
    public List<WebElement> kindOfShoes(){return $$(KIND_OF_SHOES);}
}

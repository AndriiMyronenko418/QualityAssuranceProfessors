package TSibatyykEvhenii.Pages.Zakaz;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PelmeniPage extends BasePage {

    public PelmeniPage(WebDriver driver) {
        super(driver);
    }

    private static final String ADD_TO_CART = "//span[contains(text(),'Добавить в корзину')]";
    private static final String GO_TO_CART = "//li[contains(@id,'react-tabs-2')]";
    private static final String  CHOOSE_DELIVERY_TYPE = "//div[contains(@class,'RegionSelect css-2b097c-container']";
    private static final String CHOOSE_TO_KIEV = "//div[text()='Киев']";
    private static final String STORE_CHOOSE_BTN = "//input[@id='pickup-city-store-482010105']";
    private static final String STORE_CHOOSE = "//input[@id='pickup-city-store-482010105']";

    public WebElement addTocart(){
        return $(ADD_TO_CART);
    }

    public WebElement goToCart(){
        return $(GO_TO_CART);
    }

    public WebElement deliveryType(){
        return $(CHOOSE_DELIVERY_TYPE);
    }

    public WebElement toKiev(){
        return $(CHOOSE_TO_KIEV);
    }

    public WebElement storeChooseBtn(){
        return $(STORE_CHOOSE_BTN);
    }

    public WebElement storeChose (){
        return $(STORE_CHOOSE);
    }
}

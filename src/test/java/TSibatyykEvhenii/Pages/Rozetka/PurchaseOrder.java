package TSibatyykEvhenii.Pages.Rozetka;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PurchaseOrder extends BasePage {

    public PurchaseOrder(WebDriver driver) {
        super(driver);
    }

    private static final String PURCHASE_CONFIRM = "//a[contains(@href,'checkout')]";
    private static final String PRICE = "//dd[contains(@class,'total__value_size_large')]";
    private static final String CONFIRM_PURCHASE = "(//input[contains(@class,'ng-touched')])[8]";
    private static final String CART_BTN = "//button[contains(@class,'button_state_in-cart')]";

    public WebElement purchaseConfirmBtn(){
        return $(PURCHASE_CONFIRM);
    }

    public WebElement price(){
        return $(PRICE);
    }

    public WebElement confirmBtn(){
        return $(CONFIRM_PURCHASE);
    }

    public WebElement cartBtn(){
        return $(CART_BTN);
    }
}
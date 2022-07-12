package TSibatyykEvhenii.Pages.Epicentr;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    private static final String PURCHASE_BTN = "//button[contains(@class,'purchase-btn')]";

    public WebElement getPurchaseBtn(){
        return $(PURCHASE_BTN);
    }
}

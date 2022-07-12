package TSibatyykEvhenii.Pages.Rozetka;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TvPurchasePage extends BasePage {

    public TvPurchasePage(WebDriver driver) {
        super(driver);
    }

    private static final String BUY_BTN = "//button[contains(@aria-label,'Купити')]/span";

    public WebElement buyBtn(){
        return $(BUY_BTN);
    }
}
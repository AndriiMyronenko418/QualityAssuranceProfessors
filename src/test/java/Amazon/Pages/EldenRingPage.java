package Amazon.Pages;

import BasePageAndTestInit.BasePage;
import com.google.gson.internal.bind.util.ISO8601Utils;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EldenRingPage extends BasePage {

    public EldenRingPage(WebDriver driver) {
        super(driver);
    }

    private static final String PRICE_FOR_GAME = "//span[contains(@class,'sc-product-price a-text-bold')]";
    private static final String TOTAL_ITEMS = "//span[contains(@id,'%s')]";
    private static final String TOTAL_PRICE = "(//span[contains(@class,'sc-price sc-white-space-nowrap')])[3]";
    private static final String CURRENCY_ON_THE_PAGE = "//span[contains(@id,'priceblock_ourprice') and contains(text(),'%s')]";
    private static final String ACCEPT_CHANGES = "//span[@id='icp-save-button']";

    public  WebElement price(){
        return driver.findElement(By.xpath(PRICE_FOR_GAME));
    }

    public WebElement totalPrice(){
        return $(TOTAL_PRICE);
    }

    public WebElement spanId(String option){
        return $(String.format(TOTAL_ITEMS, option));
    }
    
    public WebElement currencyValue(String option){
        return $(String.format(CURRENCY_ON_THE_PAGE, option));
    }

    public WebElement acceptChanges(){
        return $(ACCEPT_CHANGES);
    }

    public void gameUrl(){
        driver.get("https://www.amazon.com/gp/product/B09QQYB8D9/ref=ewc_pr_img_1?smid=A3ODHND3J0WMC8&th=1");
    }
}

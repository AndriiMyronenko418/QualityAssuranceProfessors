package Amazon.Pages;

import BasePageAndTestInit.BasePage;
import com.google.gson.internal.bind.util.ISO8601Utils;
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

    public  WebElement price(){
        return driver.findElement(By.xpath(PRICE_FOR_GAME));
    }

    public WebElement totalPrice(){
        return $(TOTAL_PRICE);
    }

    public WebElement spanId(String option){
        return $(String.format(TOTAL_ITEMS, option));
    }
}
package TSibatyykEvhenii.Pages.Epicentr;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PurchasePage extends BasePage {
    public PurchasePage(WebDriver driver) {
        super(driver);
    }

    private static final String TEL_NUMBER = "//div[contains(@class,'input-wrapper')]";
    private static final String NUMBER_OF_ELEMENT = "//div[contains(@class,'checkout-goods__code')]";

    public List<WebElement> setPhoneNum(){
        return $$(TEL_NUMBER);
    }

    public WebElement getNumberBuyingElement(){
        return $(NUMBER_OF_ELEMENT);
    }

}
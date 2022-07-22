package NewBalance.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NewBalanceManPageElements extends BasePage {

    public NewBalanceManPageElements(WebDriver driver) {
        super(driver);
    }

    private static final String CATEGORY_FILTER = "//li[contains(@class,'list')]//a[@href='/store/man/%s']";
    private static final String SUBCATEGORY_FILTER = "//li[contains(@class,'list')]//a[@href='/store/man/%s/%s']";
    private static final String SUB_SUBCATEGORY_FILTER = "//li[contains(@class,'list')]//a[@href='/store/man/%s/%s/%s']";
    private static final String LABEL = "//div[@class='select-label__item']";
    private static final String BRAND = "//div[@class='products__brand']";

    public WebElement categoryFilter(String kindFilter){
        return $(String.format(CATEGORY_FILTER, kindFilter));
    }

    public WebElement subcategory(String category, String subcategory){
        return $(String.format(SUBCATEGORY_FILTER, category, subcategory));
    }

    public WebElement subSubcategory(String category, String subcategory, String subSubcategory){
        return $(String.format(SUB_SUBCATEGORY_FILTER, category, subcategory, subSubcategory));
    }

    public List<WebElement> label(){
        return $$(LABEL);
    }

    public List<WebElement> brand(){
        return $$(BRAND);
    }
}

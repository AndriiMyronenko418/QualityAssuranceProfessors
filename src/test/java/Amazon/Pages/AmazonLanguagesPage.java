package Amazon.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonLanguagesPage extends BasePage {

    public AmazonLanguagesPage(WebDriver driver) {
        super(driver);
    }

    private static final String LANGUAGE ="//span[contains(text(),'%s')]";
    private static final String TEXT_FOR_ASSERT = "//h3[contains(@id,'icp-language-heading')]";
    private static final String CURRENCY_BTN = "//span[contains(@class,'a-button-text a-declarative')]";

    public WebElement language(String option){
        return $(String.format(LANGUAGE, option));
    }

    public WebElement spanText(String option){
        return $(String.format(LANGUAGE, option));
    }

    public WebElement textOnPageForAssert(){
        return $(TEXT_FOR_ASSERT);
    }

    public WebElement currencyBtn(){
        return $(CURRENCY_BTN);
    }
}
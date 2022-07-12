package Safron.MLB.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MLBNewYorkYankeesPageElements extends BasePage {
    public MLBNewYorkYankeesPageElements(WebDriver driver) {
        super(driver);
    }

    private static final String T_SHORT = "//div[@class='product-card-title']//a[@data-trk-id='p-4783546']";

    public WebElement tShort(){
        return $(T_SHORT);
    }
}

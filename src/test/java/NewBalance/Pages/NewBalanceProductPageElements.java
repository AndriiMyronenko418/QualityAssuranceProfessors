package NewBalance.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewBalanceProductPageElements extends BasePage {

    public NewBalanceProductPageElements(WebDriver driver) {
        super(driver);
    }

    private static final String COLOR_LABEL = "//span[@class='product-info-control__label-val']";

    public WebElement colorLabel() {
        return $(COLOR_LABEL);
    }
}

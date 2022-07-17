package IraKaminska.Amazon.PagesAmazon;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FragrancePageAmazon extends BasePage {

    public FragrancePageAmazon(WebDriver driver) {
        super(driver);
    }

    private static final String WOMENS_FRAGRANCE_BUTTON = "//li[@id='n/11056931']";
    private static final String RESULTS_BUTTON = "//span[@class='a-size-medium-plus a-color-base a-text-normal']";

    public WebElement getWomensFragranceButton() {
        return $(WOMENS_FRAGRANCE_BUTTON);
    }

    public WebElement checkResults() {
        return $(RESULTS_BUTTON);
    }
}
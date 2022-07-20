package Amazon.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonBrandProductsPage extends BasePage {

    public AmazonBrandProductsPage(WebDriver driver) {
        super(driver);
    }

    private static final String SEE_ALL_RESULTS_BTN = "//div[@class='a-cardui-body']//a[@class='a-link-normal']/span";

    public WebElement getSeeAllResultsBtn() {
        return $(SEE_ALL_RESULTS_BTN);
    }
}

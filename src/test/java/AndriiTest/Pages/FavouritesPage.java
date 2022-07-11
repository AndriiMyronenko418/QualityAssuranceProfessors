package AndriiTest.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FavouritesPage extends BasePage {

    public FavouritesPage(WebDriver driver) {
        super(driver);
    }

    private static final String PRODUCT_NAME = "//span[@class='product-block-name-wrapper']";

    public List<WebElement> getProductNames() {
        return $$(PRODUCT_NAME);
    }
}
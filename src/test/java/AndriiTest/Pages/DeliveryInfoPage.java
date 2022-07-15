package AndriiTest.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeliveryInfoPage extends BasePage {

    public DeliveryInfoPage(WebDriver driver) {
        super(driver);
    }

    private static final String DELIVERY_HEADER = "//div[@class='garnish-wrapper ']//h2";

    public WebElement getDeliveryHeader() {
        return $(DELIVERY_HEADER);
    }
}
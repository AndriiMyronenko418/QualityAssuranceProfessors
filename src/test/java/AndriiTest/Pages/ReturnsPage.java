package AndriiTest.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReturnsPage extends BasePage {

    public ReturnsPage(WebDriver driver) {
        super(driver);
    }

    private static final String HEADER = "//div[contains(@class,'wrapper')]//h2";
    private static final String RETURN_MY_ORDER_BTN = "//a[contains(@class,'track-my-order')]";

    public WebElement getHeader() {
        return $(HEADER);
    }

    public WebElement getReturnMyOrderBtn() {
        return $(RETURN_MY_ORDER_BTN);
    }
}
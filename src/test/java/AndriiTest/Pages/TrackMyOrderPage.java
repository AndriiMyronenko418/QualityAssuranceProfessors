package AndriiTest.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TrackMyOrderPage extends BasePage {

    public TrackMyOrderPage(WebDriver driver) {
        super(driver);
    }

    private static final String HEADER = "//div[@id='order-lookup']//h3";
    private static final String ORDER_NUMBER_INPUT = "//input[@id='order-number']";
    private static final String EMAIL_ADDRESS_INPUT = "//input[@id='email-address']";
    private static final String CHECK_STATUS_BTN = "//button[@value='Check status']";
    private static final String ERROR_MASSAGE = "//p[contains(@class,'error')]";

    public WebElement getHeader() {
        return $(HEADER);
    }

    public WebElement getOrderNumberInput(){
        return $(ORDER_NUMBER_INPUT);
    }

    public WebElement getEmailAddressInput(){
        return $(EMAIL_ADDRESS_INPUT);
    }

    public WebElement getCheckStatusBtn(){
        return $(CHECK_STATUS_BTN);
    }

    public WebElement getErrorMassage(){
        return $(ERROR_MASSAGE);
    }
}
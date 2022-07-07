package Safron.Pages;
import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HotlineLocationViewElements extends BasePage {
    public HotlineLocationViewElements(WebDriver driver) {
        super(driver);
    }
    private static final String SEARCH_LOCATION_FIELD = "//div[@class='m_b-lg']//input[@class='field']";
    private static final String LOCATION_KYIV = "//li[@data-id='187']";
    private static final String EXCEPTION_MESSAGE = "//li[@class='ui-state-disabled ui-menu-item']";

    public WebElement searchLocationField(){
        return $(SEARCH_LOCATION_FIELD);
    }

    public WebElement locationKyiv(){
        return $(LOCATION_KYIV);
    }

    public WebElement exceptionMessage(){
        return $(EXCEPTION_MESSAGE);
    }
}
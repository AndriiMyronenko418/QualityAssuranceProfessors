package Safron.Pages;
import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HotlineHeaderViewElements extends BasePage {
    public HotlineHeaderViewElements(WebDriver driver) {
        super(driver);
    }
    private static final String LOCATION_BTN = "//span[@class='city-name ellipsis']";
    private static final String LOCATION_BTN_KYIV = "//span[contains(text(),'Київ')]";

    public WebElement locationBtn(){
        return $(LOCATION_BTN);
    }
    public WebElement locationBtnKyiv(){
        return $(LOCATION_BTN_KYIV);
    }
}

package TSibatyykEvhenii.Pages.Hotline;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ConditionareSectionPage extends BasePage {

    public ConditionareSectionPage(WebDriver driver) {
        super(driver);
    }

    private static final String SORTING_FILTER = "//select[contains(@class,'select__field')]";
    private static final String PRICE_INCREASING = "//option[contains(text(),'зростанням ціни')]";
    private static final String PRICE_FOR_ASSERT = "//div[contains(@class,'list-item__title-container')]";

    public WebElement sortingFilter(){
        return $(SORTING_FILTER);
    }

    public WebElement priceIncreasing(){
        return $(PRICE_INCREASING);
    }

    public List<WebElement> firstElementAfterSearchig(){
        return $$(PRICE_FOR_ASSERT);
    }
}
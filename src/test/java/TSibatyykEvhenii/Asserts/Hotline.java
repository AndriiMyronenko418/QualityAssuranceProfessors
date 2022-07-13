package TSibatyykEvhenii.Asserts;

import BasePageAndTestInit.BasePage;
import TSibatyykEvhenii.Pages.Hotline.ConditionareSectionPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Hotline extends BasePage {

    public Hotline(WebDriver driver) {
        super(driver);
    }

    public void assertHotlinePrice(){
        ConditionareSectionPage conditionareSectionPage = new ConditionareSectionPage(driver);

        String expected = "28";
        String actual = priceForAssert().getText();
        Assert.assertEquals(expected,actual);
        System.out.println("Assert acepted, minimal price is 28");
    }

    private static final String PRICE_FOR_ASSERT = "(//span[contains(@class,'price__value')])[1]";

    public WebElement priceForAssert(){
        return $(PRICE_FOR_ASSERT);
    }


}

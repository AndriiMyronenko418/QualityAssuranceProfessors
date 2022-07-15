package TSibatyykEvhenii.Asserts;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Alteya extends BasePage {

    public Alteya(WebDriver driver) {
        super(driver);
    }

    public void alteyaAssert(){
        String actual = "Протезування";
        String expected = lineToCheck().getText();
        Assert.assertEquals(actual, expected);
        System.out.println("Assert accepted, it show price");
    }

    private static final String FOR_ASSERT = "(//div[contains(@class,'t668__header')])[5]";

    public WebElement lineToCheck(){
        return $(FOR_ASSERT);
    }
}
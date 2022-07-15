package TSibatyykEvhenii.Asserts;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class InternationalTest extends BasePage {

    public InternationalTest(WebDriver driver) {
        super(driver);
    }
    public void internationalTestAssert(){
        String actual = price().getText();
        String expected = "2.99€";
        Assert.assertEquals(actual, expected);
        System.out.println("Assert accepted, price is - 2.99€");

    }
    private static final String PRICE = "(//span[contains(text(),'2.99€')])[1]";

    public WebElement price(){
        return $(PRICE);
    }
}

package TSibatyykEvhenii.Asserts;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Citrus extends BasePage {

    public Citrus(WebDriver driver) {
        super(driver);
    }

    private static final String NAME_ELEMENT = "//h1[contains(@class,'title-0-2-370')]";

    public WebElement nameOfElement() {
        return $(NAME_ELEMENT);
    }

    public void assertForCitrus(){
        Assert.assertTrue(nameOfElement().getText().contains("Apple MacBook Air M1 Chip 13 7GPU 16/256GB Gold (Z12A0008Q) Custom"));

    }
}

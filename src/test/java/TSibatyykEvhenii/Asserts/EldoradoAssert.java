package TSibatyykEvhenii.Asserts;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class EldoradoAssert extends BasePage {

    public EldoradoAssert(WebDriver driver) {
        super(driver);
    }

    public void nameOfFirstElement(){
        String expected = "Бінокль PRAKTICA Marine Charter 7x50 White (MHMC750W)";
        String actual = elementToCheckTitle().getText();
        Assert.assertEquals(actual, expected);
        System.out.println("Assert acepted, selected element is White");
    }

    private static final String TITLE = "//div[contains(@class,'product-name')]";

    public WebElement elementToCheckTitle(){
        return $(TITLE);
    }
}
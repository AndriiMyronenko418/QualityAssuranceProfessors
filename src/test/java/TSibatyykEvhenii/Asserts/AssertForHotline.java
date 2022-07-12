package TSibatyykEvhenii.Asserts;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AssertForHotline extends BasePage {

    public AssertForHotline(WebDriver driver) {
        super(driver);
    }

    public void assertBowedInstruments() {
        String actualString = driver.findElement(By.xpath("//b[text()='Вибрані']/..")).getText();
        String expectedString = "2";
        Assert.assertTrue(actualString.contains(expectedString));
        {
            System.out.println("Assert pass");
        }
    }
}
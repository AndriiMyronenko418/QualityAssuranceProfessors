package Safron.NewBalanceUa.Pages;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class NewBalanceSearchResultHelper extends NewBalanceSearchResultPage{
    public NewBalanceSearchResultHelper(WebDriver driver) {
        super(driver);
    }

    public void assertSearchResult(String containsText){
        for (WebElement webElement : products()) {
            Assert.assertTrue(webElement.getText().contains(containsText));
            System.out.println(webElement.getText());
        }
    }
}
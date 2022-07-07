package Safron.Disney.Tests;
import BasePageAndTestInit.TestInit;
import Safron.Disney.Pages.DisneyHeaderViewHelper;
import Safron.Disney.Pages.DisneySearchResultPageElements;
import Safron.Disney.Pages.DisneySearchResultPageHelper;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearchAndFilter extends TestInit {
    @Test
    public void test5(){
        openUrl("https://www.shopdisney.com/");

        DisneyHeaderViewHelper disneyHeaderViewHelper = new DisneyHeaderViewHelper(driver);
        disneyHeaderViewHelper.search("Spider-Man");

        DisneySearchResultPageHelper disneySearchResultPageHelper = new DisneySearchResultPageHelper(driver);
        disneySearchResultPageHelper.setTextCategory();
        disneySearchResultPageHelper.setTextTitle();

        Assert.assertEquals(disneySearchResultPageHelper.getTextCategory(), "Spider-Man");
        Assert.assertEquals(disneySearchResultPageHelper.getTextTitle(), "Spider-Man");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,150)", "");

        DisneySearchResultPageElements disneySearchResultPageElements =new DisneySearchResultPageElements(driver);
        disneySearchResultPageElements.genderFilter().click();
        disneySearchResultPageElements.genderFilterBoys().click();

        disneySearchResultPageHelper.setOneOfProductText();
        disneySearchResultPageHelper.setGenderFilterBoysText();

        Assert.assertTrue(disneySearchResultPageElements.genderFilterBoys().isEnabled());
        Assert.assertEquals(disneySearchResultPageHelper.getGenderFilterBoysText(), disneySearchResultPageHelper.getOneOfProductText());

    }
}

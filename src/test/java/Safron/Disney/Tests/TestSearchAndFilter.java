package Safron.Disney.Tests;

import BasePageAndTestInit.TestInit;
import Safron.Disney.Pages.DisneyHeaderViewHelper;
import Safron.Disney.Pages.DisneySearchResultPageElements;
import Safron.Disney.Pages.DisneySearchResultPageHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearchAndFilter extends TestInit {

    @Test
    public void testSearchAndFilter() {

        DisneyHeaderViewHelper disneyHeaderViewHelper = new DisneyHeaderViewHelper(driver);
        DisneySearchResultPageHelper disneySearchResultPageHelper = new DisneySearchResultPageHelper(driver);
        DisneySearchResultPageElements disneySearchResultPageElements = new DisneySearchResultPageElements(driver);

        openUrl("https://www.shopdisney.com/");

        disneyHeaderViewHelper.search("Spider-Man");
        disneySearchResultPageHelper.setTextCategory();
        disneySearchResultPageHelper.setTextTitle();
        scroll(200);
        disneySearchResultPageElements.genderFilter().click();
        disneySearchResultPageElements.genderFilterBoys().click();
        disneySearchResultPageHelper.setOneOfProductText();
        disneySearchResultPageHelper.setGenderFilterBoysText();

        Assert.assertEquals(disneySearchResultPageHelper.getTextCategory(), "Spider-Man");
        Assert.assertEquals(disneySearchResultPageHelper.getTextTitle(), "Spider-Man");
        Assert.assertTrue(disneySearchResultPageElements.genderFilterBoys().isEnabled());
        Assert.assertEquals(disneySearchResultPageHelper.getGenderFilterBoysText(), disneySearchResultPageHelper.getOneOfProductText());
    }
}

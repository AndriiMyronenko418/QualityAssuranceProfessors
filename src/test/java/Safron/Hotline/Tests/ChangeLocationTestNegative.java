package Safron.Hotline.Tests;

import BasePageAndTestInit.TestInit;
import Safron.Hotline.Pages.HotlineHeaderViewElements;
import Safron.Hotline.Pages.HotlineHeaderViewHelper;
import Safron.Hotline.Pages.HotlineLocationViewElements;
import Safron.Hotline.Pages.HotlineLocationViewHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeLocationTestNegative extends TestInit {

    @Test
    public void testWithIncorrectLocation() {
        openUrl("https://hotline.ua/");

        HotlineHeaderViewHelper hotlineHeaderViewHelper = new HotlineHeaderViewHelper(driver);
        HotlineHeaderViewElements hotlineHeaderViewElements = new HotlineHeaderViewElements(driver);
        HotlineLocationViewHelper hotlineLocationViewHelper = new HotlineLocationViewHelper(driver);
        HotlineLocationViewElements hotlineLocationViewElements = new HotlineLocationViewElements(driver);

        hotlineHeaderViewHelper.closePopUp();
        hotlineHeaderViewElements.locationBtn().click();
        hotlineLocationViewHelper.search("SafroN");

        Assert.assertTrue(hotlineLocationViewElements.exceptionMessage().isDisplayed());
    }
}
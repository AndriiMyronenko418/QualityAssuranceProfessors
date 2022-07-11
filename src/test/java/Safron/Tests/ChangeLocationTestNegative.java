package Safron.Tests;
import BasePageAndTestInit.TestInit;
import Safron.Pages.HotlineHeaderViewElements;
import Safron.Pages.HotlineHeaderViewHelper;
import Safron.Pages.HotlineLocationViewElements;
import Safron.Pages.HotlineLocationViewHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeLocationTestNegative extends TestInit {

    @Test
    public void test2(){

        openUrl("https://hotline.ua/");

        HotlineHeaderViewHelper hotlineHeaderViewHelper = new HotlineHeaderViewHelper(driver);
        hotlineHeaderViewHelper.closePopUp();

        HotlineHeaderViewElements hotlineHeaderViewElements = new HotlineHeaderViewElements(driver);
        hotlineHeaderViewElements.locationBtn().click();

        HotlineLocationViewHelper hotlineLocationViewHelper = new HotlineLocationViewHelper(driver);
        hotlineLocationViewHelper.search("SafroN");

        HotlineLocationViewElements hotlineLocationViewElements = new HotlineLocationViewElements(driver);

        Assert.assertTrue(hotlineLocationViewElements.exceptionMessage().isDisplayed());
    }
}
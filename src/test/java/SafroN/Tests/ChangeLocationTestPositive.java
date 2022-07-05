package SafroN.Tests;

import BasePageAndTestInit.TestInit;
import SafroN.Pages.HotlineHeaderViewElements;
import SafroN.Pages.HotlineHeaderViewHelper;
import SafroN.Pages.HotlineLocationViewElements;
import SafroN.Pages.HotlineLocationViewHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeLocationTestPositive extends TestInit {
    //enter the correct location
    @Test
    public void test1() {
        openUrl("https://hotline.ua/");

        HotlineHeaderViewElements hotlineHeaderViewElements = new HotlineHeaderViewElements(driver);
        hotlineHeaderViewElements.locationBtn().click();

        HotlineLocationViewHelper hotlineLocationViewHelper = new HotlineLocationViewHelper(driver);
        hotlineLocationViewHelper.search("Київ");

        HotlineLocationViewElements hotlineLocationViewElements = new HotlineLocationViewElements(driver);
        hotlineLocationViewElements.locationKyiv().click();

        HotlineHeaderViewHelper hotlineHeaderViewHelper = new HotlineHeaderViewHelper(driver);
        hotlineHeaderViewHelper.getLocationText();

        Assert.assertEquals(hotlineHeaderViewHelper.getLocation(), "Київ");
    }
}

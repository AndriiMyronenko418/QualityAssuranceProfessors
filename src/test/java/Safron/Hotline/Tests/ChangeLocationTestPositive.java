package Safron.Hotline.Tests;
import BasePageAndTestInit.TestInit;
import Safron.Hotline.Pages.HotlineHeaderViewElements;
import Safron.Hotline.Pages.HotlineHeaderViewHelper;
import Safron.Hotline.Pages.HotlineLocationViewElements;
import Safron.Hotline.Pages.HotlineLocationViewHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeLocationTestPositive extends TestInit {
    //enter the correct location
    @Test
    public void test1() {
        openUrl("https://hotline.ua/");

        HotlineHeaderViewHelper hotlineHeaderViewHelper = new HotlineHeaderViewHelper(driver);
        hotlineHeaderViewHelper.closePopUp();

        HotlineHeaderViewElements hotlineHeaderViewElements = new HotlineHeaderViewElements(driver);
        hotlineHeaderViewElements.locationBtn().click();

        HotlineLocationViewHelper hotlineLocationViewHelper = new HotlineLocationViewHelper(driver);
        hotlineLocationViewHelper.search("Київ");

        HotlineLocationViewElements hotlineLocationViewElements = new HotlineLocationViewElements(driver);
        hotlineLocationViewElements.locationKyiv().click();

        hotlineHeaderViewHelper.getLocationText();

        Assert.assertEquals(hotlineHeaderViewHelper.getLocation(), "Київ");
    }
}

package Safron.Hotline.Tests;

import BasePageAndTestInit.TestInit;
import Safron.Hotline.Pages.HotlineHeaderViewElements;
import Safron.Hotline.Pages.HotlineHeaderViewHelper;
import Safron.Hotline.Pages.HotlineLocationViewElements;
import Safron.Hotline.Pages.HotlineLocationViewHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeLocationTestPositive extends TestInit {

    @Test
<<<<<<< HEAD:src/test/java/Safron/Hotline/Tests/ChangeLocationTestPositive.java
    public void testWithCorrectLocation() {
=======
    public void test1() {

>>>>>>> master:src/test/java/Safron/Tests/ChangeLocationTestPositive.java
        openUrl("https://hotline.ua/");

        HotlineHeaderViewHelper hotlineHeaderViewHelper = new HotlineHeaderViewHelper(driver);
        HotlineHeaderViewElements hotlineHeaderViewElements = new HotlineHeaderViewElements(driver);
        HotlineLocationViewHelper hotlineLocationViewHelper = new HotlineLocationViewHelper(driver);
        HotlineLocationViewElements hotlineLocationViewElements = new HotlineLocationViewElements(driver);

        hotlineHeaderViewHelper.closePopUp();
        hotlineHeaderViewElements.locationBtn().click();
        hotlineLocationViewHelper.search("Київ");
        hotlineLocationViewElements.locationKyiv().click();
        hotlineHeaderViewHelper.setLocationText();

        Assert.assertEquals(hotlineHeaderViewHelper.getLocation(), "Київ");
    }
}
package Safron.Hotline.Tests;

import BasePageAndTestInit.TestInit;
import Safron.Hotline.Pages.HotlineHeaderViewElements;
import Safron.Hotline.Pages.HotlineHeaderViewHelper;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonsChangeColorTest extends TestInit {

    @Test
    public void testColorChanged() {

        HotlineHeaderViewHelper hotlineHeaderViewHelper = new HotlineHeaderViewHelper(driver);
        HotlineHeaderViewElements hotlineHeaderViewElements = new HotlineHeaderViewElements(driver);

        openUrl("https://hotline.ua/");

        hotlineHeaderViewHelper.closePopUp();

        for (WebElement element : hotlineHeaderViewElements.rightSideHeaderButtons()) {
            hotlineHeaderViewHelper.moveCursor(element);
            Assert.assertNotEquals(hotlineHeaderViewHelper.getColorBefore(element), hotlineHeaderViewHelper.getColorAfter(element));
        }
    }
}

package Safron.Hotline.Tests;

import BasePageAndTestInit.TestInit;
import Safron.Hotline.Pages.HotlineHeaderViewElements;
import Safron.Hotline.Pages.HotlineHeaderViewHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeLanguageTest extends TestInit {

    @Test
    public void testLanguageChanged() {
        openUrl("https://hotline.ua/");

        HotlineHeaderViewHelper hotlineHeaderViewHelper = new HotlineHeaderViewHelper(driver);
        HotlineHeaderViewElements hotlineHeaderViewElements = new HotlineHeaderViewElements(driver);

        hotlineHeaderViewHelper.closePopUp();
        hotlineHeaderViewElements.languageHeaderBtnRu().click();

        Assert.assertTrue(hotlineHeaderViewElements.languageHeaderBtnRu().isEnabled());

        hotlineHeaderViewElements.languageHeaderBtnUk().click();

        Assert.assertTrue(hotlineHeaderViewElements.languageHeaderBtnUk().isEnabled());
    }
}

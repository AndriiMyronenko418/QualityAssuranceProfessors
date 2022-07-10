package Safron.Tests;

import BasePageAndTestInit.TestInit;
import Safron.Pages.HotlineHeaderViewElements;
import Safron.Pages.HotlineHeaderViewHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeLanguageTest extends TestInit {

    @Test
    public void test3(){

        openUrl("https://hotline.ua/");

        HotlineHeaderViewHelper hotlineHeaderViewHelper = new HotlineHeaderViewHelper(driver);
        hotlineHeaderViewHelper.closePopUp();

        HotlineHeaderViewElements hotlineHeaderViewElements = new HotlineHeaderViewElements(driver);
        hotlineHeaderViewElements.languageHeaderBtnRu().click();

        Assert.assertTrue(hotlineHeaderViewElements.languageHeaderBtnRu().isEnabled());

        hotlineHeaderViewElements.languageHeaderBtnUk().click();

        Assert.assertTrue(hotlineHeaderViewElements.languageHeaderBtnUk().isEnabled());
    }
}

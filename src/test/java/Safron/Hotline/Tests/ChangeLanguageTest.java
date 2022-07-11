package Safron.Hotline.Tests;

import BasePageAndTestInit.TestInit;
import Safron.Hotline.Pages.HotlineHeaderViewElements;
import Safron.Hotline.Pages.HotlineHeaderViewHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeLanguageTest extends TestInit {

    @Test
<<<<<<< HEAD:src/test/java/Safron/Hotline/Tests/ChangeLanguageTest.java
    public void testLanguageChanged() {
=======
    public void test3(){

>>>>>>> master:src/test/java/Safron/Tests/ChangeLanguageTest.java
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

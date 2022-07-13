package Safron.JollyBell.Tests;

import BasePageAndTestInit.TestInit;
import Safron.JollyBell.Pages.JollyHeaderViewHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestChangeLanguage extends TestInit {

    @Test
    public void testLanguage(){

        JollyHeaderViewHelper jollyHeaderViewHelper = new JollyHeaderViewHelper(driver);

        openUrl("https://jolybell.com/");

        jollyHeaderViewHelper.setRuTextHeader();
        jollyHeaderViewHelper.language().click();
        jollyHeaderViewHelper.engRuUk().get(2).click();
        jollyHeaderViewHelper.waitTo("Нова");
        jollyHeaderViewHelper.setUkTextHeader();
        jollyHeaderViewHelper.language().click();
        jollyHeaderViewHelper.engRuUk().get(0).click();
        jollyHeaderViewHelper.waitTo("New");
        jollyHeaderViewHelper.setEngTextHeader();

        Assert.assertNotEquals(jollyHeaderViewHelper.getRuTextHeader(), jollyHeaderViewHelper.getUkTextHeader());
        Assert.assertNotEquals(jollyHeaderViewHelper.getUkTextHeader(), jollyHeaderViewHelper.getEngTextHeader());
        Assert.assertNotEquals(jollyHeaderViewHelper.getRuTextHeader(), jollyHeaderViewHelper.getEngTextHeader());
    }
}

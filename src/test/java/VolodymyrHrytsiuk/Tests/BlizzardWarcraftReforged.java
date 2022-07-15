package VolodymyrHrytsiuk.Tests;

import BasePageAndTestInit.TestInit;
import VolodymyrHrytsiuk.Tests.Pages.BlizzardHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BlizzardWarcraftReforged extends TestInit {

    @Test
    public void battleNetShop() {
        BlizzardHomePage blizzHomePage = new BlizzardHomePage(driver);

        openUrl("https://eu.shop.battle.net/en-gb");
        String home = driver.getCurrentUrl();
        blizzHomePage.checkWorldOfWarcraftGame().click();
        driver.get(home);
        blizzHomePage.checkWorldOfWarcraftClassicGame().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("classic"));

        driver.get(home);
        blizzHomePage.checkHearthstoneGame().click();
        driver.get(home);
        blizzHomePage.checkOverwatchGame().click();
        driver.get(home);
        blizzHomePage.checkDiabloImmortalGame().click();
        driver.get(home);
        blizzHomePage.checkDiabloIIResurrectedGame().click();
        driver.get(home);
        blizzHomePage.checkDiabloIIIGame().click();
        driver.get(home);
        blizzHomePage.checkWarcraftIII().click();
        blizzHomePage.wrctReforgedIcon().click();

        Assert.assertTrue(blizzHomePage.buyNowReforgedIIIButton().isDisplayed());
    }
}

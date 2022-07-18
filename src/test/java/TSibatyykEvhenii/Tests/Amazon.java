package TSibatyykEvhenii.Tests;

import BasePageAndTestInit.TestInit;
import TSibatyykEvhenii.Pages.Amazon.AmazonPageObjects;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon extends TestInit {

    @Test
    public void amazonTest() {

        AmazonPageObjects amazonPageObjects = new AmazonPageObjects(driver);

        openUrl("https://amazon.com");
        amazonPageObjects.clickToLeftMenu().get(2).click();
        amazonPageObjects.sectionElectronic().get(6).click();
        amazonPageObjects.videoGameSection().click();
        amazonPageObjects.xboxSection().click();
        amazonPageObjects.consoleChoose().click();
        amazonPageObjects.gamePadSelect().get(0).click();
        amazonPageObjects.toWhiteGamepadBtn().click();
        Assert.assertTrue(amazonPageObjects.titleOfElement().getText().contains("Bionik Quickshot Trigger Grips for Xbox One: Better Grip, Faster Response Time- White - Xbox One"));
    }
}
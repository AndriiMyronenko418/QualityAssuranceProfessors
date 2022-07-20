package Amazon.Tests;

import Amazon.Pages.AmazonSearchResult;
import Amazon.Pages.AmazonXboxPage;
import Amazon.Pages.RegistrationPage;
import BasePageAndTestInit.BasePage;
import BasePageAndTestInit.TestInit;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonXboxImagenPresentstion extends TestInit {

    @Test
    public void xBoxPresetation() {

        BasePage basePage = new BasePage(driver);
        AmazonXboxPage amazonXboxPage = new AmazonXboxPage(driver);
        RegistrationPage registrationPage = new RegistrationPage(driver);
        AmazonSearchResult amazonSearchResult = new AmazonSearchResult(driver);

        openUrl("https://www.amazon.com/");
        registrationPage.inputIdOption("twotabsearchtextbox").sendKeys("Xbox Series X" + Keys.ENTER);
        amazonSearchResult.spanTextOption("Xbox Series X").click();
        amazonXboxPage.inputLabelOption("a-autoid-4-announce").click();
        Assert.assertTrue(amazonXboxPage.textUnderImage().getText().contains("Roll over image to zoom in"));
        amazonXboxPage.bigImage("2");
        Assert.assertTrue(amazonXboxPage.textUnderImage().getText().contains("Click image to open expanded view"));
        amazonXboxPage.inputLabelOption("a-autoid-5-announce").click();
        Assert.assertTrue(amazonXboxPage.textUnderImage().getText().contains("Roll over image to zoom in"));
        amazonXboxPage.moveToCordinate(184, 211);
        Assert.assertTrue(amazonXboxPage.textUnderImage().getText().contains("Click image to open expanded view"));
        amazonXboxPage.inputLabelOption("a-autoid-6-announce").click();
        Assert.assertTrue(amazonXboxPage.textUnderImage().getText().contains("Roll over image to zoom in"));
        basePage.moveCursor(amazonXboxPage.bigImage("4"));
        Assert.assertEquals(amazonXboxPage.textUnderImage().getText(), "Click image to open expanded view");
        amazonXboxPage.inputLabelOption("a-autoid-7-announce").click();
        Assert.assertTrue(amazonXboxPage.textUnderImage().getText().contains("Roll over image to zoom in"));
        amazonXboxPage.moveToCordinate(184, 211);
        Assert.assertEquals(amazonXboxPage.textUnderImage().getText(), "Click image to open expanded view");
        amazonXboxPage.inputLabelOption("a-autoid-8-announce").click();
        Assert.assertTrue(amazonXboxPage.textUnderImage().getText().contains("Roll over image to zoom in"));
        amazonXboxPage.bigImage("6");
        Assert.assertEquals(amazonXboxPage.textUnderImage().getText(), "Click image to open expanded view");
        amazonXboxPage.inputLabelOption("a-autoid-9-announce").click();
        Assert.assertTrue(amazonXboxPage.videoTitle().getText().contains("Series X_Power Your Dreams"));
    }
}
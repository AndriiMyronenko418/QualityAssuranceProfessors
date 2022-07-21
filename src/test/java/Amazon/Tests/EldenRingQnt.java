package Amazon.Tests;

import Amazon.Pages.AmazonVideoGamesSection;
import Amazon.Pages.EldenRingPage;
import Amazon.Pages.HomePage;
import Amazon.Pages.RegistrationPage;
import Amazon.TryCatch.TryCatchAmazon;
import BasePageAndTestInit.TestInit;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EldenRingQnt extends TestInit {

    @Test
    public void eldenRingQnt() {

        AmazonVideoGamesSection amazonVideoGamesSection = new AmazonVideoGamesSection(driver);
        RegistrationPage registrationPage = new RegistrationPage(driver);
        TryCatchAmazon tryCatchAmazon = new TryCatchAmazon(driver);
        EldenRingPage eldenRingPage = new EldenRingPage(driver);
        HomePage homePage = new HomePage(driver);

        openUrl("https://www.amazon.com/");
        tryCatchAmazon.tryCatchAllMenuBtn();
        homePage.seeAllBtn().get(0).click();
        homePage.videoGame().click();
        homePage.videoGameS().click();
        amazonVideoGamesSection.videoGameSection("Xbox Series X & S").click();
        amazonVideoGamesSection.videoGameSection("Games").click();
        registrationPage.inputIdOption("twotabsearchtextbox").sendKeys("Elden Ring - Standard - Xbox [Digital Code]" + Keys.ENTER);
        amazonVideoGamesSection.videoGameSection("Elden Ring - Standard - Xbox [Digital Code]").click();
        amazonVideoGamesSection.videoGameSection("Qty:").click();
        homePage.aIdOption("quantity_1").click();
        registrationPage.inputIdOption("add-to-cart-button").click();
        homePage.aText("Go to Cart").click();
        Assert.assertTrue(eldenRingPage.price().getText().contains("$59.99"));
        Assert.assertTrue(eldenRingPage.totalPrice().getText().contains("$119.98"));
        Assert.assertTrue(eldenRingPage.spanId("sc-subtotal-label-activecart").getText().contains("Subtotal (2 items):"));
        eldenRingPage.spanId("a-autoid-0-announce").click();
        homePage.aIdOption("quantity_3").click();
        Assert.assertTrue(eldenRingPage.totalPrice().getText().contains("$179.97"));
        Assert.assertTrue(eldenRingPage.spanId("sc-subtotal-label-activecart").getText().contains("Subtotal (3 items):"));
    }
}
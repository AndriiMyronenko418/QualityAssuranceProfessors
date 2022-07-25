package Amazon.Tests;

import Amazon.Pages.FilterSection;
import Amazon.Pages.HomePage;
import Amazon.Pages.PaintingDrawingArtSuppliesPage;
import Amazon.Pages.TestUserForAmazon;
import BasePageAndTestInit.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFullProcessOfOrderingE2EArtsStuff extends TestInit {

    @Test
    public void testFullProcessOfOrderingE2EArtsStuff() {

        HomePage homePage = new HomePage(driver);
        PaintingDrawingArtSuppliesPage paintingDrawingArtSuppliesPage = new PaintingDrawingArtSuppliesPage(driver);
        FilterSection filterSection = new FilterSection(driver);

        openUrl("https://www.amazon.com/ref=nav_logo");
        sleep(3);
        homePage.getDeliveryDontChangeButton();

        homePage.aIdOption("nav-link-accountList").click();
        homePage.getSignInButton("email").sendKeys(TestUserForAmazon.USER_EMAIL);
        homePage.getSignInButton("continue").click();
        homePage.getSignInButton("password").sendKeys(TestUserForAmazon.PASSWORD);
        homePage.getSignInButton("signInSubmit").click();

        homePage.getAllMenuButton().click();
        homePage.getArtsAndCraftsDepartmentButton().click();
        homePage.getPaintingDrawingAndArtSuppliesBtn().click();
        paintingDrawingArtSuppliesPage.getDrawingDepartmentBtn().click();
        paintingDrawingArtSuppliesPage.getFilterDrawingCheckbox("Art Sets").click();
        filterSection.getStarsFilter("4 Stars & Up").click();
        paintingDrawingArtSuppliesPage.getFilterDrawingCheckbox("Royal & Langnickel").click();
        scroll(30);

        for (int i = 0; i < paintingDrawingArtSuppliesPage.getRoyalArtSetsStars().size(); i++) {
            Assert.assertTrue(paintingDrawingArtSuppliesPage.getRoyalArtSetsStars().get(i) >= 4.0);
            scroll(75);
        }

        paintingDrawingArtSuppliesPage.getSotrByButton().click();
        paintingDrawingArtSuppliesPage.getSortByAverageCustomerReview().click();
        paintingDrawingArtSuppliesPage.getChoosenArtSet("RSET-ART2503 Small Tin Charcoal").click();
        paintingDrawingArtSuppliesPage.getSeeAllBuyingOptionsBtn().click();
        paintingDrawingArtSuppliesPage.getAddToCartButton().click();
        paintingDrawingArtSuppliesPage.getViewCartButton().click();
        sleep(3);

        System.out.println(paintingDrawingArtSuppliesPage.checkShoppingCart().getText().replace(" ", ""));
        System.out.println(paintingDrawingArtSuppliesPage.checkOrderAmount().getText().replace(" ", ""));
        Assert.assertEquals(paintingDrawingArtSuppliesPage.checkShoppingCart().getText().replace(" ", ""), paintingDrawingArtSuppliesPage.checkOrderAmount().getText().replace(" ", ""));
    }
}
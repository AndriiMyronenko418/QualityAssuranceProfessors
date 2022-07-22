package Amazon.Tests;

import Amazon.Pages.*;
import BasePageAndTestInit.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OutletPremiumBrandsFilterTest extends TestInit {

    @Test
    public void outletPremiumBrandsFilterTest() {

        HomePage homePage = new HomePage(driver);
        OutletPage outletPage = new OutletPage(driver);
        AmazonBrandProductsPage amazonBrandProductsPage = new AmazonBrandProductsPage(driver);
        FilterSection filterSection = new FilterSection(driver);
        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);

        openUrl("https://www.amazon.com/ref=nav_logo");

        homePage.getDeliveryDontChangeButton();
        homePage.getHeaderSpecialSections("Deals").click();
        homePage.getTodaysDealsOption("Outlet").click();
        outletPage.getTopCategoryBtn("PREMIUM BRANDS").click();
        amazonBrandProductsPage.getSeeAllResultsBtn().click();
        filterSection.getFilterCheckbox("Lacoste").click();

        int lastPage = searchResultsPage.getLastPage();

        for (int i = 0; i < lastPage - 1; i++) {
            for (int j = 0; j < searchResultsPage.getProducts().size(); j++) {
                Assert.assertTrue(searchResultsPage.getProductName().get(j).getText().contains("Lacoste"));
                scroll(100);
            }
            searchResultsPage.getNextBtn().click();
        }
    }
}
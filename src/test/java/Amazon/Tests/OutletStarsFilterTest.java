package Amazon.Tests;

import Amazon.Pages.FilterSection;
import Amazon.Pages.HomePage;
import Amazon.Pages.OutletPage;
import Amazon.Pages.SearchResultsPage;
import BasePageAndTestInit.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OutletStarsFilterTest extends TestInit {

    @Test
    public void outletStarsFilterTest() {

        HomePage homePage = new HomePage(driver);
        OutletPage outletPage = new OutletPage(driver);
        FilterSection filterSection = new FilterSection(driver);
        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);

        openUrl("https://www.amazon.com");
        homePage.getDeliveryDontChangeButton();
        homePage.getHeaderSpecialSections("Deals").click();
        homePage.getTodaysDealsOption("Outlet").click();
        outletPage.getShopByCategoryOptionBtn("Kitchen").click();
        filterSection.getStarsFilter("4 Stars").click();
        scroll(50);

        for (int i = 0; i < searchResultsPage.getProductStars().size(); i++) {
            Assert.assertTrue(searchResultsPage.getProductStars().get(i) >= 4.0);
            scroll(75);
        }
    }
}
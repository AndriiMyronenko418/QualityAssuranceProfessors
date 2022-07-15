package IraKaminska.Amazon.TestsAmazon;

import BasePageAndTestInit.TestInit;
import IraKaminska.Amazon.PagesAmazon.HomePageAmazon;
import IraKaminska.Amazon.PagesAmazon.TodaysDealsPageAmazon;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckTodaysTop50OffDeals extends TestInit {

    @Test
    public void checkTodaysTop50OffDeals() {
        HomePageAmazon homePageAmazon = new HomePageAmazon(driver);
        TodaysDealsPageAmazon todaysdealsPageAmazon = new TodaysDealsPageAmazon(driver);

        openUrl("https://www.amazon.com/");
        homePageAmazon.getTodaysDealsButton().click();
        todaysdealsPageAmazon.getAvailableTodaysDealsButton().click();
        todaysdealsPageAmazon.getPrimeDealsButton().click();
        todaysdealsPageAmazon.getBestDealButton().click();
        todaysdealsPageAmazon.get50OffAndMoreDiscountButton().click();
        todaysdealsPageAmazon.getPrice50To100Button().click();
        todaysdealsPageAmazon.getHighestAvarageCustomerReviewButton().click();
        todaysdealsPageAmazon.getSortByButton().click();
        todaysdealsPageAmazon.getDiscountHighToLow().click();

        Assert.assertTrue(todaysdealsPageAmazon.checkSortedTodaysDeals().getText().contains("Discount - High to Low"));
    }
}
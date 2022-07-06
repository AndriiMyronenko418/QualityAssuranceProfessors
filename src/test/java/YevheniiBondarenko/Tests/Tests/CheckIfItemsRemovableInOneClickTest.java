package YevheniiBondarenko.Tests.Tests;
import BasePageAndTestInit.TestInit;
import YevheniiBondarenko.Tests.Pages.DanceShopperHelper;
import YevheniiBondarenko.Tests.Pages.HomePageWebElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckIfItemsRemovableInOneClickTest extends TestInit {

    @Test

    public void checkIfItemsARemovable(){
        DanceShopperHelper danceShopperHelper = new DanceShopperHelper(driver);
        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);

        danceShopperHelper.goToDanceShopper();                                         //open Dance Shopper web-product
        homePageWebElements.searchSelectorMenu().click();                              // Step 1: click on Selection Menu button
        homePageWebElements.CategoryMusicFromSearchSelectorMenu().click();             // Step 2: click on Music category
        homePageWebElements.searchField().get(0).sendKeys("latin\n");      // Step 3: type searching element name in search field(press enter)
        homePageWebElements.buyButtonForFirstElement().click();                        // Step 4: buy first music CD from list
        for (int i = 0; i <11; i++) {homePageWebElements.addProductButton().click();}  // Step 5: add 12 product in cart
        homePageWebElements.removeInOneClick().click();                                // Step 6: delete product in one click

        Assert.assertTrue(homePageWebElements.itemsInsideBasket().isEnabled());        // check if cart is empty if true - test passed!


    }

}

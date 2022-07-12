package YevheniiBondarenko.Tests.Tests;

import BasePageAndTestInit.TestInit;
import YevheniiBondarenko.Tests.Pages.HomePageWebElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class QuantityOfMensShoesAfterBrandsFilterTest extends TestInit {

    @Test

    public void quantityOfShoesAfterBrandsFilter() {
        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);

        openUrl("https://www.danceshopper.com/Default");
        homePageWebElements.headerMenu().get(1).click();
        homePageWebElements.mensItemList().get(6).click();

        Assert.assertTrue(homePageWebElements.itemQuantityDisplay().size() > 53);
        homePageWebElements.brandsButton().click();
        homePageWebElements.shoesBrandList().get(1).click();
        homePageWebElements.brandsButton().click();
        homePageWebElements.shoesBrandList().get(2).click();
        homePageWebElements.brandsButton().click();
        homePageWebElements.shoesBrandList().get(4).click();

        Assert.assertTrue(homePageWebElements.itemQuantityDisplay().size() > 21);
    }
}
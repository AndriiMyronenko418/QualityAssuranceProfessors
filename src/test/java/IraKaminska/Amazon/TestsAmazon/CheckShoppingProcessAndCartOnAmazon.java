package IraKaminska.Amazon.TestsAmazon;

import BasePageAndTestInit.TestInit;
import IraKaminska.Amazon.PagesAmazon.DepartmentsPageAmazon;
import IraKaminska.Amazon.PagesAmazon.ElectronicsPage;
import IraKaminska.Amazon.PagesAmazon.HomePageAmazon;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckShoppingProcessAndCartOnAmazon extends TestInit {

    @Test
    public void checkShoppingProcessAndCartOnAmazon() {

        HomePageAmazon homePageAmazon = new HomePageAmazon(driver);
        DepartmentsPageAmazon departmentsPageAmazon = new DepartmentsPageAmazon(driver);
        ElectronicsPage electronicsPage = new ElectronicsPage(driver);

        openUrl("https://www.amazon.com/");
        scroll(200);
        homePageAmazon.getShopNowByCategoryButton().click();
        departmentsPageAmazon.getElectronicsDepartment().click();
        electronicsPage.getCellPhonesAndAccessoriesButton().click();
        electronicsPage.getAccessoriesButton().click();
        electronicsPage.getHeadphonesButton().click();
        electronicsPage.getEarbudHeadphonesButton().click();
        electronicsPage.getScullcandyBrandButton().click();
        electronicsPage.getHighestAverageCustomerReviewBunnon().click();
        electronicsPage.getEarbudScullcandy().click();
        electronicsPage.getColourOfEarbud().click();
        electronicsPage.getQuantityButton().click();
        electronicsPage.getTwoEarbudSkullcandy().click();
        electronicsPage.getAddToCartButton().click();
        electronicsPage.getCartButton().click();

        Assert.assertTrue(electronicsPage.checkCart().getText().contains("Shopping Cart"));
    }
}
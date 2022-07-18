package IraKaminska.Amazon.TestsAmazon;

import BasePageAndTestInit.TestInit;
import IraKaminska.Amazon.PagesAmazon.DogPageAmazon;
import IraKaminska.Amazon.PagesAmazon.HomePageAmazon;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckProcessOrderAmazon extends TestInit {

    @Test
    public void checkProcessOrderAmazon() {

        HomePageAmazon homePageAmazon = new HomePageAmazon(driver);
        DogPageAmazon dogPageAmazon = new DogPageAmazon(driver);

        openUrl("https://www.amazon.com/");
        homePageAmazon.getAllMenuButton().click();
        homePageAmazon.getSeeAllButton().click();
        homePageAmazon.getPetSuppliesButton().click();
        homePageAmazon.getDogsPetSuppliesButton().click();
        dogPageAmazon.getDogFoodButton().click();
        dogPageAmazon.getDryDogFoodButton().click();
        dogPageAmazon.getTheHighestCustomerReview().click();
        dogPageAmazon.getRoyalCaninBrandButton().click();
        dogPageAmazon.getRoyalCaninForAdultDogs().click();
        dogPageAmazon.getVegetableFlavorRoyalCanin().click();
        dogPageAmazon.getProdukt().click();
        dogPageAmazon.getSizeOfPackofProduct().click();

        Assert.assertTrue(dogPageAmazon.checkAvailabilityOfProduct().getText().contains("Currently unavailable"));
    }
}
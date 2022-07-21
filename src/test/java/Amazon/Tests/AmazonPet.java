package Amazon.Tests;

import Amazon.Pages.AmazonPetPage;
import Amazon.Pages.HomePage;
import BasePageAndTestInit.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonPet extends TestInit {

    @Test
    public void amazonPetFilter() {
        AmazonPetPage amazonPetPage = new AmazonPetPage(driver);
        HomePage homePage = new HomePage(driver);

        openUrl("https://www.amazon.com");
        homePage.getPetButton().click();
        amazonPetPage.getSeeMoreButtonFilters().click();
        String nameBrand = amazonPetPage.filterBrandName("Amazon Basics").getText();
        amazonPetPage.choseFilterBrand("Amazon Basics").click();
        amazonPetPage.getChosenButtonItems("1").click();

        Assert.assertEquals(nameBrand, amazonPetPage.brandNameChosenItems().getText());
    }
}

package Amazon.Tests;

import Amazon.Pages.AmazonPetPage;
import Amazon.Pages.FilterSection;
import Amazon.Pages.HomePage;
import BasePageAndTestInit.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonPet extends TestInit {

    @Test
    public void amazonPetFilter() {

        AmazonPetPage amazonPetPage = new AmazonPetPage(driver);
        HomePage homePage = new HomePage(driver);
        FilterSection filterSection = new FilterSection(driver);

        openUrl("https://www.amazon.com");
        homePage.getPetButton().click();
        amazonPetPage.getSeeMoreButtonFilters().click();
        String nameBrand = amazonPetPage.filterBrandName("Amazon Basics").getText();
        filterSection.getFilterCheckbox("Amazon Basics").click();
        amazonPetPage.getChosenButtonItems("1").click();

        Assert.assertEquals(nameBrand, amazonPetPage.brandNameChosenItems().getText());
    }

    @Test
    public void amazonPetPriceFilter() {
        AmazonPetPage amazonPetPage = new AmazonPetPage(driver);
        HomePage homePage = new HomePage(driver);
        FilterSection filterSection = new FilterSection(driver);

        openUrl("https://www.amazon.com");
        homePage.getPetButton().click();
        filterSection.getPriceInputFilter("low-price").click();
        filterSection.getPriceInputFilter("low-price").sendKeys("10");
        filterSection.getPriceInputFilter("high-price").click();
        filterSection.getPriceInputFilter("high-price").sendKeys("100 \n");
        String priceProduct = amazonPetPage.priceProductMainPage().getText();
        amazonPetPage.clickChosenProduct().click();

        Assert.assertEquals(priceProduct, amazonPetPage.priceOnChosenProductPage().getText());
    }
}

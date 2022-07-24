package Amazon.Tests;

import Amazon.Pages.AmazonPetPage;
import Amazon.Pages.FilterSection;
import Amazon.Pages.HomePage;
import BasePageAndTestInit.TestInit;
import org.openqa.selenium.JavascriptExecutor;
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

    @Test
    public void amazonPetCart() {
        AmazonPetPage amazonPetPage = new AmazonPetPage(driver);
        HomePage homePage = new HomePage(driver);

        openUrl("https://www.amazon.com");
        homePage.getPetButton().click();
        amazonPetPage.getSeeMoreButtonFilters().click();
        amazonPetPage.getChosenButtonItems("11").click();
        String nameFirstProduct = amazonPetPage.nameOnChosenProductPage().getText();
        amazonPetPage.getAddOnCartProduct().click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.history.go(-1)");
        js.executeScript("window.history.go(-1)");
        amazonPetPage.getChosenButtonItems("15").click();
        String nameSecondProduct = amazonPetPage.nameOnChosenProductPage().getText();
        amazonPetPage.getAddOnCartProduct().click();
        amazonPetPage.getOpenButtonCart().click();

        Assert.assertEquals(nameSecondProduct, amazonPetPage.verifyNameCartProducts("1").getText());
        Assert.assertEquals(nameFirstProduct, amazonPetPage.verifyNameCartProducts("2").getText());
    }
}

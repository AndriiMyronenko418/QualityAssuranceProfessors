package Amazon.Tests;

import Amazon.Pages.ComputersTabletsPage;
import Amazon.Pages.HomePage;
import BasePageAndTestInit.TestInit;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class CheckSortedByPriceLaptops extends TestInit {

    @Test
    public void checkSortedByPriceLaptops() {

        HomePage homePage = new HomePage(driver);
        ComputersTabletsPage computersTabletsPage = new ComputersTabletsPage(driver);

        openUrl("https://www.amazon.com");
        homePage.getDeliverToButton().click();
        homePage.getCountriesListDropdawn().click();
        homePage.getCanadaFromListDropdawn().click();
        homePage.getDoneOfChooseYourLocationButton().click();
        sleep(3);
        homePage.getAllMenuButton().click();
        homePage.getComputersDepartmentButton().click();
        homePage.getComputersAndTabletsButton().click();
        computersTabletsPage.getLaptopsButton().click();
        computersTabletsPage.getTraditionalLaptopsButton().click();
        scroll(300);
        computersTabletsPage.getEnterMinPrice().sendKeys("2200");
        computersTabletsPage.getEnterMaxPrice().sendKeys("2500");
        computersTabletsPage.getGoPriceButton().click();
        computersTabletsPage.getSortByButton().click();
        computersTabletsPage.getPriceLowToHighButton().click();
        List<Double> prices = computersTabletsPage.checkPrice()
                .stream().map(WebElement::getText)
                .map(str -> str.replace(",", ""))
                .map(Double::parseDouble).toList();
        System.out.println(prices);
        for (int i = 0; i < prices.size() - 1; i++) {

            Assert.assertTrue(prices.get(i) <= prices.get(i + 1));
        }
    }
}
package YevheniiBondarenko.Tests.Tests;
import BasePageAndTestInit.TestInit;
import YevheniiBondarenko.Tests.Pages.NewBalanceHelper;
import YevheniiBondarenko.Tests.Pages.NewBalanceWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewBalance1E2EByingRunningShoes extends TestInit {
    @Test
    public void newBalanceE2EByingShoes(){

        NewBalanceWebElement newBalanceWebElement = new NewBalanceWebElement(driver);
        NewBalanceHelper newBalanceHelper = new NewBalanceHelper(driver);

        newBalanceHelper.navigateNewBalance();
        newBalanceWebElement.searchField().sendKeys("взуття для бігу");
        newBalanceWebElement.searchButton().click();
        newBalanceWebElement.shoes().click();
        newBalanceWebElement.kindOfShoes().get(0).click();
        newBalanceWebElement.shoesForCityRoad().click();
        newBalanceWebElement.genderMan().click();
        newBalanceWebElement.listOfSize().get(1).click();
        newBalanceWebElement.myChoice().click();
        newBalanceWebElement.sizeBeforeCart().click();
        newBalanceWebElement.addToCart().click();

        sleep(1); // without a 'sleep' it's falling, but you can try to change if you want
        Assert.assertTrue(newBalanceWebElement.itemInsideTheCartVisible().isDisplayed());
    }
}
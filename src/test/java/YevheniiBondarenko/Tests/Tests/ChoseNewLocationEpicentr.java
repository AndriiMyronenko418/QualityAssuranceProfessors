package YevheniiBondarenko.Tests.Tests;

import BasePageAndTestInit.TestInit;
import YevheniiBondarenko.Tests.Pages.ItemsInsideTheWebElement;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChoseNewLocationEpicentr extends TestInit {

    @Test
    public void choseNewLocation(){

        ItemsInsideTheWebElement choseNewlocation = new ItemsInsideTheWebElement(driver);

        openUrl("https://epicentrk.ua/personal/cart/");
        choseNewlocation.changeLanguageBtn().click();
        choseNewlocation.chooseLocationBtn().click();
        choseNewlocation.searchCityBtn().click();
        choseNewlocation.searchField().sendKeys("Бровари", Keys.ENTER);
        choseNewlocation.brovaryKyivRegion().click();
        sleep(2);
        choseNewlocation.onAMap().click();
        sleep(2);
        choseNewlocation.epiOnAMap().click();
        choseNewlocation.choose().click();

        Assert.assertTrue(choseNewlocation.cityNameInHeader().isDisplayed());
    }
}

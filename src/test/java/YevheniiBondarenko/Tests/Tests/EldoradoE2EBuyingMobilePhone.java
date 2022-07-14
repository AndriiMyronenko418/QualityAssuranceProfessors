package YevheniiBondarenko.Tests.Tests;

import BasePageAndTestInit.TestInit;
import YevheniiBondarenko.Tests.Pages.EldoradoWebElementsPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EldoradoE2EBuyingMobilePhone extends TestInit {

    @Test
    public void eldoradoE2EAddAndRemoveFromCart(){

        EldoradoWebElementsPage eldoradoWebElementsPage = new EldoradoWebElementsPage(driver);
        Actions act = new Actions(driver);

        openUrl("https://eldorado.ua/uk/");
        eldoradoWebElementsPage.searchingField().sendKeys("мобільні телефони", Keys.ENTER);
        eldoradoWebElementsPage.mobilePhones().click();
        eldoradoWebElementsPage.brovaryCity().click();
        eldoradoWebElementsPage.listOfMobilePhones().get(10).click();
        eldoradoWebElementsPage.colorOfMobilePhones().get(3).click();
        eldoradoWebElementsPage.buyButton().click();

        Assert.assertTrue(eldoradoWebElementsPage.cartItemsNumber().isDisplayed());

        act.moveToElement(eldoradoWebElementsPage.cartItemsNumber()).perform();
        eldoradoWebElementsPage.deleteItemsFromCart().get(0).click();

        Assert.assertTrue(eldoradoWebElementsPage.cartItemsNumber().isEnabled());
    }
}
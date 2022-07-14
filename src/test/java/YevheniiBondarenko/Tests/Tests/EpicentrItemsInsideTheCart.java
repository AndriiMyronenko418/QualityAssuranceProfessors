package YevheniiBondarenko.Tests.Tests;

import BasePageAndTestInit.TestInit;
import YevheniiBondarenko.Tests.Pages.ChoseNewLocation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EpicentrItemsInsideTheCart extends TestInit {

    @Test
    public void epicentrItemsInCart(){
        ChoseNewLocation itemsFromEpicentr = new ChoseNewLocation(driver);

        openUrl("https://epicentrk.ua/");
        itemsFromEpicentr.catalogOfProduct().click();
        itemsFromEpicentr.householdAppliance().click();
        itemsFromEpicentr.listOfProduct1().get(3).click();
        itemsFromEpicentr.aeroGrill().click();
        itemsFromEpicentr.myChooiseItem().click();
        itemsFromEpicentr.buyBtn().click();
        itemsFromEpicentr.blueBuyButton().click();

        Assert.assertTrue(itemsFromEpicentr.yellowNumberOnACart().isDisplayed());
    }
}
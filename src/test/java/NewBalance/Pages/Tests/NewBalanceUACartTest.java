package NewBalance.Pages.Tests;

import BasePageAndTestInit.TestInit;
import NewBalance.Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewBalanceUACartTest extends TestInit {
    @Test
    public void newBalanceUACartTest(){
        NewBalanceHeaderViewElements headerElements = new NewBalanceHeaderViewElements(driver);
        NewBalanceHeaderViewHelper helper = new NewBalanceHeaderViewHelper(driver);
        WomanPageElements womanShoes = new WomanPageElements(driver);
        ShoesDetailPage shoesDetail = new ShoesDetailPage(driver);
        CartViewPage cartItems = new CartViewPage(driver);

        openUrl("https://newbalance.ua/");
        helper.moveCursor(headerElements.getHeaderOption("Жінкам"));
        headerElements.getDropDownOption("/women/vzutta").click();
        womanShoes.getCategory("Повсякденне").click();
        womanShoes.getFavourite().click();
        womanShoes.listOfSize().get(0).click();
        womanShoes.addToCart().click();
        shoesDetail.setProductSizeText();
        shoesDetail.setProductNameText();
        shoesDetail.setProductPriceText();
        cartItems.setCartItemSize();
        cartItems.setCartItemName();
        cartItems.setCartItemPrice();

        Assert.assertEquals(shoesDetail.getTestedSize(),cartItems.getCartItemSize());
        Assert.assertEquals(shoesDetail.getTestedName(),cartItems.getCartItemName());
        Assert.assertEquals(shoesDetail.getTestedPrice(),cartItems.getCartItemPrice());
    }
}
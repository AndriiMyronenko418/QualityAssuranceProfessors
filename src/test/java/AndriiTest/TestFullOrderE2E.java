package AndriiTest;

import BasePageAndTestInit.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFullOrderE2E extends TestInit {

    @Test
    public void fullOrderE2E() {

        HomePage homePage = new HomePage(driver);
        MenShoesClassicsPage menShoesClassicsPage = new MenShoesClassicsPage(driver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        DeliveryDetailsPage deliveryDetailsPage = new DeliveryDetailsPage(driver);
        PaymentPage paymentPage = new PaymentPage(driver);

        openUrl("https://www.vans.co.uk/");
        homePage.getAllowAllCookieBtn().click();
        homePage.moveCursor(homePage.getManDropdownBtn());
        homePage.getManClassicsBtn().click();
        scroll(400);
        menShoesClassicsPage.getSk8HiBlackWhiteShoes().click();
        productDetailsPage.getSizeSelector().click();
        productDetailsPage.getSize("10.5").click();
        productDetailsPage.getProductNameText();
        productDetailsPage.getProductColorText();
        productDetailsPage.getProductPriceText();
        productDetailsPage.getAddToCart().click();
        productDetailsPage.getProceedToCheckoutBtn().click();
        shoppingCartPage.getProductNameText();
        shoppingCartPage.getProductColorText();
        shoppingCartPage.getProductPriceText();
        shoppingCartPage.getProductSizeText();

        String productDetailsName = productDetailsPage.getTestedNameS();
        String productDetailsColor = productDetailsPage.getTestedColorS();
        String productDetailsPrice = productDetailsPage.getTestedPriceS();
        String shoppingCartName = shoppingCartPage.getTestedNameS();
        String shoppingCartColor = shoppingCartPage.getTestedColorS();
        String shoppingCartPrice = shoppingCartPage.getTestedPriceS();
        String shoppingCartSize = shoppingCartPage.getTestedSizeS();

        Assert.assertEquals(productDetailsName, shoppingCartName);
        Assert.assertEquals(productDetailsColor, shoppingCartColor);
        Assert.assertEquals(productDetailsPrice, shoppingCartPrice);
        Assert.assertEquals("10.5", shoppingCartSize);

        shoppingCartPage.getCheckoutSecurelyBtn().click();
        deliveryDetailsPage.getInputFirstName().sendKeys(DeliveryDetailsPage.FIRST_NAME);
        deliveryDetailsPage.getInputLastName().sendKeys(DeliveryDetailsPage.LAST_NAME);
        deliveryDetailsPage.getInputAddress1().sendKeys(DeliveryDetailsPage.ADDRESS_1);
        deliveryDetailsPage.getInputCity().sendKeys(DeliveryDetailsPage.CITY);
        deliveryDetailsPage.getInputPostCode().sendKeys(DeliveryDetailsPage.POST_CODE);
        deliveryDetailsPage.getInputPhone().sendKeys(DeliveryDetailsPage.PHONE);
        deliveryDetailsPage.getInputEmail().sendKeys(DeliveryDetailsPage.EMAIL);
        deliveryDetailsPage.getTermsAndConditionsCheckbox().click();
        deliveryDetailsPage.getProceedToPaymentBtn().click();
        paymentPage.getBillingAddressInfo();

        Assert.assertEquals(paymentPage.getBillingAddressInfo(), deliveryDetailsPage.addingInfo());
    }
}

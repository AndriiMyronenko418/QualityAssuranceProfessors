package TSibatyykEvhenii.Tests;

import BasePageAndTestInit.TestInit;
import TSibatyykEvhenii.Asserts.Rozetka;
import TSibatyykEvhenii.Asserts.TryCatch;
import TSibatyykEvhenii.Pages.Rozetka.PurchaseOrder;
import TSibatyykEvhenii.Pages.Rozetka.RozetkaMainPage;
import TSibatyykEvhenii.Pages.Rozetka.TvPurchasePage;
import org.testng.annotations.Test;

public class BuyTvOnRozetka extends TestInit {

    @Test
    public void buyTvTest() {
        TryCatch tryCatch = new TryCatch(driver);
        RozetkaMainPage rozetkaMainPage = new RozetkaMainPage(driver);
        TvPurchasePage tvPurchaisePage = new TvPurchasePage(driver);
        PurchaseOrder purchaseOrder = new PurchaseOrder(driver);
        Rozetka rozetka = new Rozetka(driver);

        openUrl("https://rozetka.com.ua/");
        tryCatch.tryRozetkaLanguage();
        rozetkaMainPage.searchField().sendKeys("Телевизор Samsung QE65QN900AUXUA\n");
        rozetkaMainPage.searchBtn().click();
        tvPurchaisePage.buyBtn().click();
        purchaseOrder.cartBtn().click();
        purchaseOrder.purchaseConfirmBtn().click();
        rozetka.rozetkaAssert();
    }
}
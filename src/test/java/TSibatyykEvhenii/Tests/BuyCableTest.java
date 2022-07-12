package TSibatyykEvhenii.Tests;

import BasePageAndTestInit.TestInit;
import TSibatyykEvhenii.Asserts.Epicentr;
import TSibatyykEvhenii.Asserts.TryCatch;
import TSibatyykEvhenii.Pages.Epicentr.CartPage;
import TSibatyykEvhenii.Pages.Epicentr.EpicentrkMainPage;
import TSibatyykEvhenii.Pages.Epicentr.PurchasePage;
import TSibatyykEvhenii.Pages.Epicentr.SearchResult;
import org.testng.annotations.Test;

public class BuyCableTest extends TestInit {

    @Test
    public void CabelBuy() {
        Epicentr epicentr = new Epicentr(driver);
        EpicentrkMainPage emp = new EpicentrkMainPage(driver);
        TryCatch tryCatch = new TryCatch(driver);
        SearchResult searchResult = new SearchResult(driver);
        CartPage cartPage = new CartPage(driver);
        PurchasePage purchasePage = new PurchasePage(driver);

        openUrl("https://epicentrk.ua/");
        tryCatch.tryCatchMethod();
        emp.searchField().get(0).sendKeys("кабель");
        emp.searchBtn().click();
        sleep(2);
        searchResult.chooseComputerCable().get(2).click();
        sleep(3);
        searchResult.moveToFirstElementCable();
        searchResult.addToCart().get(0).click();
        cartPage.getPurchaseBtn().click();
        epicentr.assertEnding();
    }
}
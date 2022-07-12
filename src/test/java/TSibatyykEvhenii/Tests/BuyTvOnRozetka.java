package TSibatyykEvhenii.Tests;

import BasePageAndTestInit.TestInit;
import TSibatyykEvhenii.Asserts.TryCatch;
import TSibatyykEvhenii.Pages.Rozetka.RozetkaMainPage;
import org.testng.annotations.Test;

public class BuyTvOnRozetka extends TestInit {

    @Test
    public void buyTvTest() {
        TryCatch tryCatch = new TryCatch(driver);
        RozetkaMainPage rozetkaMainPage = new RozetkaMainPage(driver);

        openUrl("https://rozetka.com.ua/");
        tryCatch.tryRozetkaLanguage();
        rozetkaMainPage.searchField().sendKeys("Телевизор Samsung QE65QN900AUXUA\n");
        rozetkaMainPage.searchBtn().click();

    }
}

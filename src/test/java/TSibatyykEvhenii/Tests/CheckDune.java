package TSibatyykEvhenii.Tests;

import BasePageAndTestInit.TestInit;
import TSibatyykEvhenii.Pages.AmazonMainPage;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class CheckDune extends TestInit {

    @Test
    public void duneCheck() {
        AmazonMainPage amazonMainPage = new AmazonMainPage(driver);

        openUrl("https://www.amazon.com/");
        amazonMainPage.searchField().sendKeys("Dune" + Keys.ENTER);
        sleep(3);                                                       //wait for sorting result load
        amazonMainPage.searchResult().click();
        System.out.println(amazonMainPage.imdbRating().getText());
    }
}

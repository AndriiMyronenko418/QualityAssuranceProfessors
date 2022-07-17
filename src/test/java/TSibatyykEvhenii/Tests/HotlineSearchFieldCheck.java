package TSibatyykEvhenii.Tests;

import BasePageAndTestInit.TestInit;
import TSibatyykEvhenii.Asserts.TryCatch;
import TSibatyykEvhenii.Pages.Hotline.ElementPage;
import TSibatyykEvhenii.Pages.Hotline.HotlineSite;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HotlineSearchFieldCheck extends TestInit {

    @Test
    public void checkSearchField() {
    
        HotlineSite hotlineSite = new HotlineSite(driver);
        TryCatch tryCatch = new TryCatch(driver);
        ElementPage elementPage = new ElementPage(driver);

        openUrl("https://hotline.ua/");
        tryCatch.hotlineLanguage();
        hotlineSite.searchField().sendKeys("Sony PlayStation 5 Digital Edition 825GB" + Keys.ENTER);
        hotlineSite.searchResult().click();
        
        Assert.assertTrue(elementPage.titleOfElement().getText().contains("Стаціонарна ігрова приставка Sony PlayStation 5 Digital Edition 825GB"));
        System.out.println("Assert acepted, searchField works right");
    }
}

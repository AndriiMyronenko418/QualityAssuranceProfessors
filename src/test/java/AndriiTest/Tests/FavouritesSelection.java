package AndriiTest.Tests;

import AndriiTest.Pages.FavouritesPage;
import AndriiTest.Pages.HomePage;
import AndriiTest.Pages.MensShoesPage;
import BasePageAndTestInit.TestInit;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FavouritesSelection extends TestInit {

    @Test
    public void favouriteSelection() {

        HomePage homePage = new HomePage(driver);
        MensShoesPage mensShoesPage = new MensShoesPage(driver);
        FavouritesPage favouritesPage = new FavouritesPage(driver);

        openUrl("https://www.vans.co.uk/");
        homePage.getAllowAllCookieBtn().click();
        scroll(3500);
        homePage.getShopByOption("CategoryMenShoes").click();
        scroll(300);
        sleep(2);
        mensShoesPage.getAddToFavourites().forEach(WebElement::click);
        int favouriteItems = mensShoesPage.getAddToFavourites().size();
        homePage.getFavourites().click();
        scroll(9000);

        Assert.assertEquals(favouritesPage.getProductNames().size(), favouriteItems);
    }
}
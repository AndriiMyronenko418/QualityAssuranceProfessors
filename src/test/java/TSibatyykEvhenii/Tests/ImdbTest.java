package TSibatyykEvhenii.Tests;

import BasePageAndTestInit.TestInit;
import TSibatyykEvhenii.Asserts.ImdbAssert;
import TSibatyykEvhenii.Pages.Imdb.ImdbMainPage;
import org.testng.annotations.Test;

public class ImdbTest extends TestInit {

    @Test
    public void searchMovieTest(){

        ImdbMainPage imdb = new ImdbMainPage(driver);
        ImdbAssert imdbAssert = new ImdbAssert(driver);

        openUrl("https://www.imdb.com/");
        imdb.getSearchField().sendKeys("Jaws");
        imdb.getJawsFromSearch().get(0).click();
        imdbAssert.assertationImdb();
    }
}

package TSibatyykEvhenii.Asserts;

import BasePageAndTestInit.BasePage;
import TSibatyykEvhenii.Pages.ImdbMainPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ImdbAssert extends BasePage {

    public ImdbAssert(WebDriver driver) { super(driver); }
    public void assertationImdb(){
        ImdbMainPage imdbMP = new ImdbMainPage(driver);
        String expected = "Steven Spielberg";
        String actual = imdbMP.getDirectorName().get(0).getText();
        Assert.assertEquals(expected, actual);
        System.out.println("Assert accepted");
    }
}

package TSibatyykEvhenii.Asserts;

import BasePageAndTestInit.BasePage;
import TSibatyykEvhenii.Pages.Epicentr.EpicentrkMainPage;
import TSibatyykEvhenii.Pages.Epicentr.PurchasePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Epicentr extends BasePage {

    public Epicentr(WebDriver driver) {
        super(driver);
    }

    public void assertMethodForEpicentr(){
        EpicentrkMainPage epicentrkMainPage = new EpicentrkMainPage(driver);

        String expectet = "ІНФОРМАЦІЯ";
        String actual = epicentrkMainPage.informationBtn().getText();
        Assert.assertEquals(expectet, actual);
        System.out.println("Assert acepted");
    }

    public void assertEnding(){
        PurchasePage purchasePage = new PurchasePage(driver);

        String expected = "30204426";
        String actual = purchasePage.getNumberBuyingElement().getText();
        Assert.assertEquals(expected, actual);
        System.out.println("We choose right cabel");
    }
}
package LevchenkoAlinka;
import BasePageAndTestInit.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests extends TestInit {


    @Test
    public void designApartmentInSmartRoom() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://polyakova.biz/ua");
        homePage.portfolioBtn().click();
        homePage.smartRoomsOpen().click();
        homePage.roomInCampus().click();

        Assert.assertTrue(homePage.photoDesignFlatCampus().isDisplayed());
    }
}



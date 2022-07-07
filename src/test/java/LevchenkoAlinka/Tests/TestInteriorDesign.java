package LevchenkoAlinka.Tests;
import BasePageAndTestInit.TestInit;
import LevchenkoAlinka.Pages.HomePageInteriorDesign;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestInteriorDesign extends TestInit {

    @Test
    public void designApartmentInSmartRoom() {
        HomePageInteriorDesign homePageInteriorDesign = new HomePageInteriorDesign(driver);
        openUrl("https://polyakova.biz/ua");
        homePageInteriorDesign.portfolioBtn().click();
        homePageInteriorDesign.smartRoomsopen().click();
        homePageInteriorDesign.roomInCampus().click();

        Assert.assertTrue(homePageInteriorDesign.photoDesignFlatCampus().isDisplayed());
    }
}



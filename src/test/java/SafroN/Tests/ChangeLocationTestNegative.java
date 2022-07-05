package SafroN.Tests;
import BasePageAndTestInit.TestInit;
import SafroN.Pages.HotlineHeaderViewElements;
import SafroN.Pages.HotlineLocationViewElements;
import SafroN.Pages.HotlineLocationViewHelper;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeLocationTestNegative extends TestInit {
    //enter the correct location
    @Test
    public void test2(){
        openUrl("https://hotline.ua/");
        HotlineHeaderViewElements hotlineHeaderViewElements = new HotlineHeaderViewElements(driver);
        hotlineHeaderViewElements.locationBtn().click();

        HotlineLocationViewHelper hotlineLocationViewHelper = new HotlineLocationViewHelper(driver);
        hotlineLocationViewHelper.search("SafroN");

        HotlineLocationViewElements hotlineLocationViewElements = new HotlineLocationViewElements(driver);

        Assert.assertTrue(hotlineLocationViewElements.exceptionMessage().isDisplayed());

    }
}

package ShidlovskiyMax.Tests;

import BasePageAndTestInit.TestInit;
import ShidlovskiyMax.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductSearch extends TestInit {

@Test
    public void ProductSearch(){
    
    HomePage homePage = new HomePage(driver);
    
    openUrl("https://www.amazon.com/ref=nav_logo");
    homePage.fieldkeywords().click();
    homePage.fieldkeywords().sendKeys("Клавиатура");
    homePage.Search().click();
    Assert.assertTrue(homePage.Resultfound().isDisplayed());
    }
}

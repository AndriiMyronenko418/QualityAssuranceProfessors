package TSibatyykEvhenii.Asserts;

import BasePageAndTestInit.BasePage;
import TSibatyykEvhenii.Pages.CustomPage.CustomPrintMainPage;
import TSibatyykEvhenii.Tests.CustomPrint;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CcustomPrintAssert extends BasePage {

    public CcustomPrintAssert(WebDriver driver) {
        super(driver);
    }

    public void assertCustoPrint(){

        CustomPrintMainPage customPrintMainPage = new CustomPrintMainPage(driver);

        Assert.assertTrue(customPrintMainPage.languageBtn().getText().contains("UK, ₴"));
        System.out.println("Language allready Ukrainian");
    }

    public void assertFavouriteBtn(){

        CustomPrintMainPage customPrintMainPage = new CustomPrintMainPage(driver);

        customPrintMainPage.favouriteBtnHart().click();
        Assert.assertTrue(driver.findElement(By.xpath("(//div[contains(@class,'p-cart-item__info-title')]/a)[1]")).getText().contains("Футболка чоловіча з принтом"));
        System.out.println("Assert acepted, buttom Fauvorite works");
    }
}
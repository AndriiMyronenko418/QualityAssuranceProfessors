package NewBalance.Tests;

import BasePageAndTestInit.TestInit;
import NewBalance.Pages.NewBalanceHeaderViewElements;
import NewBalance.Pages.NewBalanceLogInAndRegistrationPage;
import NewBalance.Pages.NewBalanceProductPageElements;
import NewBalance.Pages.NewBalanceWomanShoesPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewBalanceE2ETestBlackSneakers extends TestInit {

    @Test
    public void NewBalanceE2EShoes() {

        NewBalanceHeaderViewElements hpViewElements = new NewBalanceHeaderViewElements(driver);
        NewBalanceLogInAndRegistrationPage hpLogReg = new NewBalanceLogInAndRegistrationPage(driver);
        NewBalanceWomanShoesPage hpWSPage = new NewBalanceWomanShoesPage(driver);
        NewBalanceProductPageElements hpProductPE = new NewBalanceProductPageElements(driver);
        Actions actions = new Actions(driver);

        openUrl("https://newbalance.ua/");
        hpViewElements.signInBtn().click();
        hpLogReg.lineForEmailInLogin().sendKeys("elsafronitaz@gmail.com");
        hpLogReg.lineForPasswordInLogin().sendKeys("E8crmWqTtYU2GD7");
        hpLogReg.getLoginButton().sendKeys(Keys.ENTER);
        sleep(1);
        openUrl("https://newbalance.ua/");
        hpViewElements.manCatalogBtn().click();
        hpViewElements.moveCursor(hpViewElements.manCatalogBtn());
        hpWSPage.getProduct("man", "vzutta", "dla-bigu").click();
        hpProductPE.shoeSizeValue("10").click();
        hpProductPE.chooseColorOfProduct("5545").click();
        hpProductPE.choosePriceFieldMinOrmAx("min").clear();
        hpProductPE.choosePriceFieldMinOrmAx("min").sendKeys("4000");
        hpProductPE.choosePriceFieldMinOrmAx("min").sendKeys(Keys.ENTER);
        hpProductPE.getNameOfGoods("Fresh Foam 1080").click();
        hpProductPE.getConcreteSizeOfShoeInUSA("10");
        actions.click(hpProductPE.getConcreteSizeOfShoeInUSA("10")).perform();
        hpProductPE.getSomethingToCart().click();
        hpProductPE.toOrder().click();

        Assert.assertTrue(hpProductPE.chooseDeliveryMethod().isDisplayed());
    }
}
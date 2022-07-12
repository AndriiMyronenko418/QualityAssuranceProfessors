package TSibatyykEvhenii.Asserts;

import BasePageAndTestInit.BasePage;
import TSibatyykEvhenii.Pages.Rozetka.PurchaseOrder;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Rozetka extends BasePage {

    public Rozetka(WebDriver driver) {
        super(driver);
    }

    public void rozetkaAssert(){
        PurchaseOrder purchaseOrder = new PurchaseOrder(driver);

        String expect = "Замовлення підтверджую";
        String actual = purchaseOrder.confirmBtn().getText();
        Assert.assertEquals(expect, actual);
        System.out.println("Confirm purchase, please");
    }
}

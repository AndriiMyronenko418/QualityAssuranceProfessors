package Safron.MLB.Pages;

import BasePageAndTestInit.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MLBProductPageHelper extends MLBProductPageElements{
    public MLBProductPageHelper(WebDriver driver) {
        super(driver);
    }

    public void choosePlayer(){
        selectPlayer().click();
        player().click();
    }

    private static final String MASSAGE = "//span[@class='message-text']";
    public void addToCart(){
        addToCartBtn().click();
        TestInit t = new TestInit();
        t.sleep(30); //wait when massage invisibility. Don't know what kind of waiter I need in this situation.
        addToCartBtn().click();
    }

    public void chooseQuantity(int index){
        quantityContainer().click();
        quantityList().get(index).click();
    }

    private String nameOfProduct;

    public void setNameOfProduct(){
        nameOfProduct = productName().getText();
    }

    public String getNameOfProduct(){
        return this.nameOfProduct;
    }

    private String priceOfProduct;

    public void setPriceOfProduct(){
        priceOfProduct = productPrice().getText().substring(12,19);
    }

    public String getPriceOfProduct(){
        return this.priceOfProduct;
    }
}

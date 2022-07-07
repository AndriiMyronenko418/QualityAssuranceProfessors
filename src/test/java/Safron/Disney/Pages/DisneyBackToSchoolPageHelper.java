package Safron.Disney.Pages;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;

public class DisneyBackToSchoolPageHelper extends DisneyBackToSchoolPageElements{
    public DisneyBackToSchoolPageHelper(WebDriver driver) {
        super(driver);
    }

    String textNameProduct;
    public void setTextNameProduct(){
        textNameProduct = firstProductName().getText();
    }
    public String getTextNameProduct(){
        return this.textNameProduct;
    }

    String textPriceProduct;
    public void setTextPriceProduct(){
        textPriceProduct = firstProductPrice().getText();
    }
    public String getTextPriceProduct(){
        return this.textPriceProduct;
    }

    String textNameProductCart;
    public void setTextNameProductCart(){
        textNameProductCart = productNameCart().getText();
    }
    public String getTextNameProductCart(){
        return this.textNameProductCart;
    }

    String textPriceProductCart;
    public void setTextPriceProductCart(){
        textPriceProductCart = productPriceCart().getText();
    }
    public String getTextPriceProductCart(){
        return this.textPriceProductCart;
    }
    public void moveToProduct(){
        doMoveCursor(firstProductName());
    }

    public void popUpWishBtnClick() {
        try {
            addWishBtn().click();
        } catch (ElementClickInterceptedException e) {
            e.printStackTrace();
        }
    }
}

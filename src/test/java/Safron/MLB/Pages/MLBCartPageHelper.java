package Safron.MLB.Pages;

import org.openqa.selenium.WebDriver;

public class MLBCartPageHelper extends MLBCartPageElements {
    public MLBCartPageHelper(WebDriver driver) {
        super(driver);
    }

    private String nameOfProduct;

    public void setNameOfProduct(){
        nameOfProduct = productName().getText();
    }

    public String getNameOfProduct(){
        return this.nameOfProduct;
    }

    private String eachPriceOfProduct;

    public void setEachPriceOfProduct(){
        eachPriceOfProduct = eachPrice().getText().substring(5,9) + "." + eachPrice().getText().substring(10,12);
    }

    public String getEachPriceOfProduct(){
        return this.eachPriceOfProduct;
    }
}

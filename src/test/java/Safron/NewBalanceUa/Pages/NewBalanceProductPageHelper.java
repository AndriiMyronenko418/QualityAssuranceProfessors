package Safron.NewBalanceUa.Pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class NewBalanceProductPageHelper extends NewBalanceProductPageElements {
    public NewBalanceProductPageHelper(WebDriver driver) {
        super(driver);
    }

    String article;

    public void setArticle(){
        article = article().getText().substring(9);
    }

    public String getArticle(){
        return this.article;
    }

    String price;

    public void setPrice(){
        price = price().getText();
    }

    public String getPrice(){
        return this.price;
    }

    String size;

    public void setSize(){
        size = sizeBoard().get(3).getText();
    }

    public String getSize(){
        return this.size;
    }
}

package Safron.NewBalanceUa.Pages;

import org.openqa.selenium.WebDriver;

public class NewBalanceCartViewHelper extends NewBalanceCartViewElements{
    public NewBalanceCartViewHelper(WebDriver driver) {
        super(driver);
    }

    String article;

    public void setArticle(){
        article = article().getText().substring(8);
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
        size = size().getText().substring(0, 2);
    }

    public String getSize(){
        return this.size;
    }
}

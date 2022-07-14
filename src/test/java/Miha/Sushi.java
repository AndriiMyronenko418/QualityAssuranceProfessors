package Miha;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sushi extends BasePage {

    public Sushi(WebDriver driver) {
        super(driver);
    }

   public WebElement setChoose()
   {
       return $("//a[@href='/menu/nabory']");
   }

   public WebElement filterSetsClick()
   {
       return $("//strong[@class='fs-title flex align-center pointer']");
   }

   public WebElement moreHigherPrice()
   {
       return $("//p[contains(text(),'Спочатку дорожче')]");
   }

   public WebElement biggerSetsFirst()
   {
       return $("//label[@class='MuiFormControlLabel-root']//p[contains(text(),'Давай спочатку тi, яких бiльше')]");
   }

   public WebElement acceptFilter()
   {
       return $("//button[@aria-label='Submit']");
   }

   public WebElement addOnCard()
   {
       return $("//div[@data-viewport-product='427A17E0-FDD2-11EC-832E-6555095BC173']//button[@aria-label='Add to cart']");
   }

   public WebElement openCart()
   {
       return $("//a[@href='/cart']");
   }

   public WebElement priceOnSet()
   {
       return $("//div[contains(text(),'1399')]");
   }
}
package NewBalance.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class NewBalanceKidsPageHelper extends NewBalanceKidsPageElements{
    public NewBalanceKidsPageHelper(WebDriver driver) {
        super(driver);
    }

    public String getPinkFilterColor(){
        return pinkFilter().getCssValue("background-color");
    }

    public String getLabelCircleColor(){
        return labelCircleColor().getCssValue("background-color");
    }

    public void moveToProduct(int number){
        moveCursor(products().get(number));
    }
}

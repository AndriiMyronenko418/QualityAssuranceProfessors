package SafroN.Pages;

import org.openqa.selenium.WebDriver;

public class HotlineLocationViewHelper extends HotlineLocationViewElements{
    public HotlineLocationViewHelper(WebDriver driver) {
        super(driver);
    }

    public void search(String location){
        searchLocationField().click();
        searchLocationField().sendKeys(location);
    }
}

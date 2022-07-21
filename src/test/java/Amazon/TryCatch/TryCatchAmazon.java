package Amazon.TryCatch;

import Amazon.Pages.HomePage;
import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;

public class TryCatchAmazon extends BasePage {

    public TryCatchAmazon(WebDriver driver) {
        super(driver);
    }

    public void tryCatchAllMenuBtn(){

        HomePage homePage = new HomePage(driver);

        try{
            homePage.getAllMenuButton().click();
        }catch(Exception e){
            driver.get("https://www.amazon.com/");
            homePage.getAllMenuButton().click();
            System.out.println("Not from the first time");
        }
    }
}

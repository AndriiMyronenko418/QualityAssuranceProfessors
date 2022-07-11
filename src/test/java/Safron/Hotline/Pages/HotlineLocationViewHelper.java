<<<<<<< HEAD
<<<<<<< HEAD:src/test/java/Safron/Hotline/Pages/HotlineLocationViewHelper.java
package Safron.Hotline.Pages;
=======
package Safron.Pages;

>>>>>>> master:src/test/java/Safron/Pages/HotlineLocationViewHelper.java
=======
package Safron.Hotline.Pages;

>>>>>>> master
import org.openqa.selenium.WebDriver;

public class HotlineLocationViewHelper extends HotlineLocationViewElements {

    public HotlineLocationViewHelper(WebDriver driver) {
        super(driver);
    }

    public void search(String location) {
        searchLocationField().click();
        searchLocationField().sendKeys(location);
    }
}
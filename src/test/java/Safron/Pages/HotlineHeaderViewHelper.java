package Safron.Pages;
import org.openqa.selenium.WebDriver;

public class HotlineHeaderViewHelper extends HotlineHeaderViewElements{
    public HotlineHeaderViewHelper(WebDriver driver) {
        super(driver);
    }
    private String location;

    public String getLocation(){
        return this.location;
    }

    public void getLocationText(){
        location = locationBtnKyiv().getText();
    }
}

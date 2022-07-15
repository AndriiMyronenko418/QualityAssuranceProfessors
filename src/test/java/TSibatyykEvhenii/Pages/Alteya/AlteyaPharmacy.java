package TSibatyykEvhenii.Pages.Alteya;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AlteyaPharmacy extends BasePage {

    public AlteyaPharmacy(WebDriver driver) {
        super(driver);
    }

    private static final String PRICE_PAGE = "//a[contains(@href,'/uk/ciny')]";
    private static final String DENTIST_OR_MADICINE = "//div[contains(@class,'t-btn_sm')]";
    private static final String DENTIST = "(//div[contains(@class,'t-align_center')])[2]";

    public List<WebElement> priceBtn() {
        return $$(PRICE_PAGE);
    }

    public List<WebElement> dentist() {
        return $$(DENTIST_OR_MADICINE);
    }

    public WebElement moveToDentist(){
       return  $(DENTIST);
    }
}
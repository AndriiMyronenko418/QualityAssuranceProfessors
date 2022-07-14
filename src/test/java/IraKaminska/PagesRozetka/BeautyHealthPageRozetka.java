package IraKaminska.PagesRozetka;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BeautyHealthPageRozetka extends BasePage {

    public BeautyHealthPageRozetka(WebDriver driver) {
        super(driver);
    }

    private static final String WOMEN_PERFUMES_BUTTON = "//a[@title='Женская парфюмерия']";
    private static final String CHANEL_PERFUMES_BUTTON = "//a[@data-id='Chanel']";
    private static final String WOMEN_CHANEL_PERFUMES = "//h1[contains(text(), 'Женская парфюмерия Chanel')]";

    public WebElement getWomenPerfumesButton() {
        return $(WOMEN_PERFUMES_BUTTON);
    }

    public WebElement getChanelPerfumesButton() {
        return $(CHANEL_PERFUMES_BUTTON);
    }

    public WebElement checkWomenChanelPerfumes() {
        return $(WOMEN_CHANEL_PERFUMES);
    }
}
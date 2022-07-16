package TSibatyykEvhenii.Pages.Citrus;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CitrusMainPage extends BasePage {

    public CitrusMainPage(WebDriver driver) {
        super(driver);
    }

    private static final String NOUTBOOKS_SECTION = "(//a[contains(@href,'noutbuki-i-kompyutery/')])[1]";
    private static final String NOUTBOOKSECTION = "(//a[contains(text(),'Ноутбуки та ультрабуки')])[1]";
    private static final String CHECKBOX = "(//label[contains(@class,'oot-0-2-1498')])[1]";
    private static final String RESULT_AFTER_FILTERED = "//div[contains(@class,'productCardCategory-0-2-1593')]";

    public WebElement goToNoutBooksSection() {
        return $(NOUTBOOKS_SECTION);
    }

    public WebElement elementFromNoutBookSection(){
        return $(NOUTBOOKSECTION);
    }

    public List<WebElement> getCheckbox(){
        return $$(CHECKBOX);
    }

    public List<WebElement> takeElementAfterFiltered(){
        return $$(RESULT_AFTER_FILTERED);
    }

    public void getAppleFiltre(){
        driver.get("https://www.ctrs.com.ua/ru/noutbuki-i-ultrabuki/brand-apple/");
    }
}

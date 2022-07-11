package TSibatyykEvhenii.Pages.Epicentr;

import BasePageAndTestInit.BasePage;
import io.netty.handler.codec.http.multipart.AbstractDiskHttpData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResult extends BasePage {

    public SearchResult(WebDriver driver) {
        super(driver);
    }
    private static final String CABLE_LIST_AFTER_SEARCH = "//div[contains(@class,'swiper-slide')]/div";
    private static final String ADD_TO_CART_BTN = "//button[contains(@class,'card__button btn')]";
    private static final String SEARCH_RESULTS_CARDS = "(//div[contains(@class,'card ')])[1]";

    public List<WebElement> chooseComputerCable(){
        return $$(CABLE_LIST_AFTER_SEARCH);
    }

    public List<WebElement> addToCart(){
        return $$(ADD_TO_CART_BTN);
    }

    public void moveToFirstElementCable(){
        moveCursor(driver.findElement(By.xpath(("(//div[contains(@class,'card ')])[1]"))));
    }


}

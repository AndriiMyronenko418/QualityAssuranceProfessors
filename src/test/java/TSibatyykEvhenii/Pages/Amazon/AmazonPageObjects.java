package TSibatyykEvhenii.Pages.Amazon;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AmazonPageObjects extends BasePage {
    
    public AmazonPageObjects(WebDriver driver) {
        super(driver);
    }

    private static final String LEFT_LIST = "//div[@class='nav-left']";
    private static final String ELECTRONIC_SECTION = "//ul[@data-menu-id='1']/li";
    private static final String VIDEO_GAME_SECTION = "//*[text()='Video Game Consoles & Accessories']";
    private static final String XBOX_ONE = "//span[text()='Xbox One']";
    private static final String CONSOLE = "//span[text()='Consoles']";
    private static final String GAMEPADE = "//div[@data-asin='B099H65X5D']";
    private static final String WHITE_GAMEPAD = "//li[@id='color_name_1']";
    private static final String BUY_OPTION = "//div[@id='exports_desktop_unqualifiedBuybox_all_buying_options_cta_feature_div']";
    private static final String TITLE = "//span[contains(@id,'productTitle')]";

    public List<WebElement> clickToLeftMenu() {return $$(LEFT_LIST);}

    public List<WebElement> sectionElectronic(){return $$(ELECTRONIC_SECTION);}

    public WebElement videoGameSection(){return $(VIDEO_GAME_SECTION);}

    public WebElement xboxSection(){return $(XBOX_ONE);}

    public WebElement consoleChoose(){return $(CONSOLE);}

    public List<WebElement> gamePadSelect(){return $$(GAMEPADE);}

    public WebElement toWhiteGamepadBtn(){return $(WHITE_GAMEPAD);}


    public List<WebElement> buyOptionBtn(){return $$(BUY_OPTION);}

    public WebElement titleOfElement(){
        return $(TITLE);
    }
}

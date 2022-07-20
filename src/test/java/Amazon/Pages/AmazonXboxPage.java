package Amazon.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AmazonXboxPage extends BasePage {

    public AmazonXboxPage(WebDriver driver) {
        super(driver);
    }

    private static final String INPUT_ARIA_LABEL_OPTION = "//input[contains(@aria-labelledby,'%s')]";
    private static final String VIDEO_TITLE = "//span[contains(text(),'Series X_Power Your Dreams')]";
    private static final String TEXT_UNDER_PICTURE = "//span[contains(@id,'canvasCaption')]";
    private static final String BIG_IMAGE = "(//img[contains(@class,'a-stretch-horizontal')])[%s]";

    public WebElement inputLabelOption(String option){
        return $(String.format(INPUT_ARIA_LABEL_OPTION, option));
    }

    public WebElement videoTitle(){
        return $(VIDEO_TITLE);
    }

    public WebElement textUnderImage(){
        return $(TEXT_UNDER_PICTURE);
    }

    public WebElement bigImage(String option){
        return moveTo(String.format(BIG_IMAGE, option));
    }

    public void moveToCordinate(int x, int y){
        Actions actions = new Actions(driver);
        actions.moveByOffset(x, y).perform();
    }
}
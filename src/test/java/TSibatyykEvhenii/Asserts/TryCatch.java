package TSibatyykEvhenii.Asserts;

import BasePageAndTestInit.BasePage;
import TSibatyykEvhenii.Pages.Epicentr.EpicentrkMainPage;
import TSibatyykEvhenii.Pages.Rozetka.RozetkaMainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TryCatch extends BasePage{

    public TryCatch(WebDriver driver) {
        super(driver);
    }

    public void tryCatchMethod() {
        Epicentr epicentr = new Epicentr(driver);
        EpicentrkMainPage emp = new EpicentrkMainPage(driver);
        try {
            epicentr.assertMethodForEpicentr();
        } catch (Exception e) {
            emp.changeLanguageBtn().click();
            System.out.println("Language was piggy-dog");
        }
    }

    public void tryRozetkaLanguage() {
        RozetkaMainPage rozetkaMainPage = new RozetkaMainPage(driver);

        try {
            rozetkaMainPage.ukrLanguage().click();
        } catch (Exception e) {
            System.out.println("Language already Ukraine");
        }
    }

    public void hotlineLanguage() {

        try{
            ukrLanguage().click();
        }catch(Exception e){
            System.out.println("Language already Ukraine");
        }
    }

    public void eldoradoLanguageChek() {
        try {
            ukrLanguageEldorado().click();
        }catch(Exception e){
            System.out.println("Language allready Ukrainian");
        }
    }

    private static final String UKR_LANGUAGE_BTN = "(//span[contains(@data-eventlabel,'uk')])[1]";
    private static final String UKRAINIAN_LANGUAGE_ELDORADO = "//a[contains(@href,'/uk/')]";

    public WebElement ukrLanguage() {
        return $(UKR_LANGUAGE_BTN);
    }

    public WebElement ukrLanguageEldorado(){
        return $(UKRAINIAN_LANGUAGE_ELDORADO);
    }
}
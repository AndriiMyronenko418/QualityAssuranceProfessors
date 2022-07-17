package TSibatyykEvhenii.Asserts;

import BasePageAndTestInit.BasePage;
import TSibatyykEvhenii.Pages.CustomPage.CustomPrintMainPage;
import TSibatyykEvhenii.Pages.Epicentr.EpicentrkMainPage;
import TSibatyykEvhenii.Pages.Rozetka.RozetkaMainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TryCatch extends BasePage {

    public TryCatch(WebDriver driver) {
        super(driver);
    }

    private void languageUkrainian(){
        System.out.println("Language allready Ukrainian");
    }

    public void tryCatchMethod() {
        Epicentr epicentr = new Epicentr(driver);
        EpicentrkMainPage emp = new EpicentrkMainPage(driver);
        try {
            epicentr.assertMethodForEpicentr();
        } catch (Exception e) {
            emp.changeLanguageBtn().click();
        languageUkrainian();
        }
    }

    public void tryRozetkaLanguage() {
        RozetkaMainPage rozetkaMainPage = new RozetkaMainPage(driver);

        try {
            rozetkaMainPage.ukrLanguage().click();
        } catch (Exception e) {
            languageUkrainian();
        }
    }public void RozetkaLanguageCheck() {
        RozetkaMainPage rozetkaMainPage = new RozetkaMainPage(driver);

        try {
            rozetkaMainPage.ukrLanguage().click();
        } catch (Exception e) {
            System.out.println("Site use the Ukrainian language, as a general");
        }
    }

    public void hotlineLanguage() {

        try {
            ukrLanguage().click();
        } catch (Exception e) {
            languageUkrainian();
        }
    }

    public void eldoradoLanguageChek() {
        try {
            ukrLanguageEldorado().click();
        } catch (Exception e) {
            languageUkrainian();
        }
    }

    public void internetionalTest() {
        try {
            ukrLanuageInternetionalTest().click();
        } catch (Exception e) {
            languageUkrainian();
        }
    }

    public void countryChoose(){
        try{
            chooseUkraine().click();
        }catch(Exception e){
            System.out.println("Country allready Ukraine");
        }
    }

    public void customPrintTryCatch(){

        CcustomPrintAssert ccustomPrintAssert = new CcustomPrintAssert(driver);
        CustomPrintMainPage customPrintMainPage = new CustomPrintMainPage(driver);

        try{
            ccustomPrintAssert.assertCustoPrint();
        }catch(Exception e){
            customPrintMainPage.changeLanguage();
        }
    }

    public void tryToChangeLanguage(){
        try{
            clickToUkrainian().click();
        }catch(Exception e){
            languageUkrainian();
        }
    }

    private static final String UKRAINIAN_LANGUAGE2 = "//a[text()='УКР']";
    private static final String UKR_LANGUAGE_BTN = "(//span[contains(@data-eventlabel,'uk')])[1]";
    private static final String UKRAINIAN_LANGUAGE = "//a[contains(@href,'/uk/')]";
    private static final String CHOOSE_UKRAINE = "//option[contains(@value,'UA')]";

    public WebElement ukrLanguage() {
        return $(UKR_LANGUAGE_BTN);
    }

    public WebElement ukrLanguageEldorado() {
        return $(UKRAINIAN_LANGUAGE);
    }

    public WebElement ukrLanuageInternetionalTest() {
        return $(UKRAINIAN_LANGUAGE);
    }

    public WebElement chooseUkraine(){
        return $(CHOOSE_UKRAINE);
    }

    public WebElement clickToUkrainian(){
        return $(UKRAINIAN_LANGUAGE2);
    }
}

package Amazon.Tests;

import Amazon.Pages.AmazonLanguagesPage;
import Amazon.Pages.HomePage;
import BasePageAndTestInit.TestInit;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AmazonLangugeCheck extends TestInit {

    @DataProvider(name= "languageCheck")
    public Object [][] languageList(){
        return new Object [][]{
                {"español", "ES"},
                {"الترجمة","AR"},
                {"Deutsch","DE"},
                {"תרגום", "HE"},
                {"한국어", "KO"},
                {"português", "PT"},
                {"中文 (简体)", "ZH"},
                {"中文 (繁體)","ZH"}};
    }

    @Test(dataProvider = "languageCheck")
    public void amazonLangugeCheck(String language, String shotrL){

        AmazonLanguagesPage amazonLanguagesPage = new AmazonLanguagesPage(driver);
        HomePage homePage = new HomePage(driver);

        openUrl("https://www.amazon.com/");
        homePage.aIdOption("icp-nav-flyout").click();
        amazonLanguagesPage.language(language).click();
        Assert.assertFalse(amazonLanguagesPage.textOnPageForAssert().getText().contains("Language Settings"));
        System.out.println("Test works");
    }
}
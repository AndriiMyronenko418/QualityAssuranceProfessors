package Miha;

import BasePageAndTestInit.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestingProcess extends TestInit {

    @Test
    public void citrusTestAboutOpenCategoryPhoneAndUseFiltersForSearchNeededPhoneAndCheckCorrectPrice() {

        Citrus citrus = new Citrus(driver);

        openUrl("https://www.ctrs.com.ua");
        citrus.phoneCategoryOpen().click();
        citrus.filterChooseApplePhones().click();
        String chosenPhonePrice = citrus.phonePrice().getText();
        citrus.choosenPhoneClick().click();
        Assert.assertEquals(chosenPhonePrice, citrus.nextPhonePrice().getText());
        Assert.assertTrue(citrus.productNameTitel().getText().contains("iPhone"));
    }

    @Test
    public void genshinTestingForOpenAndSwipeListCharacterAndCheckCorrectNameCharacter() {

        Genshin genshin = new Genshin(driver);

        openUrl("https://genshin.hoyoverse.com/ru/home");
        sleep(8); // He need for download screen on timer for go to next page, if not use sleep we had a problem with moving test
        genshin.startToOpenCite().click();
        genshin.openInazumaCharacterList().click();
        sleep(2); // Need for loading information about characters
        genshin.swipeCharacter();
        Assert.assertTrue(genshin.nameCharacter().getText().contains("Akira"));
    }

    @Test
    public void genshinOpenMangaAndCheckToCorrectLink() {

        Genshin genshin = new Genshin(driver);

        openUrl("https://genshin.hoyoverse.com/ru/home");
        sleep(8); // Same
        genshin.startToOpenCite().click();
        genshin.informationOpen().click();
        genshin.mangaOpen().click();
        genshin.choosenMangaOpen().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("https://genshin.hoyoverse.com/ru/manga"));
    }

    @Test
    public void genshinOpenNewsPageAndCheckCorrectChosenNews() {

        Genshin genshin = new Genshin(driver);

        openUrl("https://genshin.hoyoverse.com/ru/home");
        sleep(8); // Same
        genshin.startToOpenCite().click();
        genshin.newsOpen().click();
        genshin.newsChoosenOpen().click();
        Assert.assertTrue(genshin.titleChosenNews().getText().contains("Ночной силуэт"));
    }

    @Test
    public void genshinOpenPageWithInformationAboutWorldGame() {

        Genshin genshin = new Genshin(driver);

        openUrl("https://genshin.hoyoverse.com/ru/home");
        sleep(8); // Same
        genshin.startToOpenCite().click();
        genshin.informationOpen().click();
        genshin.openTaivatWorld().click();
        genshin.coockieOkClick().click();
        genshin.monshtatClick().click();
        Assert.assertTrue(genshin.nameCityWarify().getText().contains("Мондштадт"));
        genshin.openInfomationAboutCity().click();
        genshin.closeInformationAboutCity().click();
        genshin.liueClick().click();
        genshin.openInfomationAboutCity().click();
        Assert.assertTrue(genshin.nameLiUeCityWarify().getText().contains("Ли"));
        genshin.closeInformationAboutCity().click();
    }

    @Test
    public void genshinOpenPageHistoryAboutMonshtat() {

        Genshin genshin = new Genshin(driver);

        openUrl("https://genshin.hoyoverse.com/ru/home");
        sleep(8); // Same
        genshin.startToOpenCite().click();
        genshin.informationOpen().click();
        genshin.travelerOpenPage().click();
        genshin.historyOpenMonshtat().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("https://genshin.hoyoverse.com/ru/town"));
    }

    @Test
    public void genshinOpenPageHistoryAboutLiUe() {

        Genshin genshin = new Genshin(driver);

        openUrl("https://genshin.hoyoverse.com/ru/home");
        sleep(8); // Same
        genshin.startToOpenCite().click();
        genshin.informationOpen().click();
        genshin.travelerOpenPage().click();
        genshin.historyOpenLiUe().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("https://genshin.hoyoverse.com/ru/town"));
    }

    @Test
    public void genshinOpenPageHistoryAboutInazuma() {

        Genshin genshin = new Genshin(driver);

        openUrl("https://genshin.hoyoverse.com/ru/home");
        sleep(8); // Same
        genshin.startToOpenCite().click();
        genshin.informationOpen().click();
        genshin.travelerOpenPage().click();
        genshin.historyOpenInazuma().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("https://genshin.hoyoverse.com/ru/town"));
    }
}
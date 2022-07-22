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

        Assert.assertTrue(genshin.titleChosenNews().getText().contains("Лето"));
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

        Assert.assertTrue(genshin.checkNameLake().getText().contains("Сидровое"));
        Assert.assertTrue(genshin.textWithInformationAboutFalcon().getText().contains("Сокола"));
        genshin.closeInformationAboutCity().click();
        genshin.liueClick().click();
        genshin.openInfomationAboutCity().click();

        Assert.assertTrue(genshin.nameLiUeCityWarify().getText().contains("Ли"));
        Assert.assertTrue(genshin.checkTitlePortLiUe().getText().contains("Порт"));
        Assert.assertTrue(genshin.mountainLiUe().getText().contains("Горы Тяньхэн"));
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

        Assert.assertTrue(getCurrentUrl().contains("https://genshin.hoyoverse.com/ru/town"));
    }

    @Test
    public void warframeCheckWorkingPageNewsAboutUpdateAndCheckCorrectChosenNameNews() {

        Warframe warframe = new Warframe(driver);

        openUrl("https://www.warframe.com/ru");
        sleep(1);//Need time for appearance button Accept Cookie
        warframe.acceptCookie().click();
        warframe.moveToButtonGame();
        warframe.clickOnUpdateNews().click();
        warframe.nextNewsPage().click();
        warframe.clickChoosenNews().click();

        Assert.assertTrue(warframe.newsNameCheck().getText().contains("31"));
        warframe.scrollPage();
    }

    @Test
    public void waframePageHistoryAndPageWaframesCharactersAndCheckTwoNameOnFirstPageAndSecondMainPageCharacter() {

        Warframe warframe = new Warframe(driver);

        openUrl("https://www.warframe.com/ru");
        sleep(1);// Same
        warframe.acceptCookie().click();
        warframe.moveToButtonGame();
        warframe.historyButtonClick().click();
        scroll(1200);
        sleep(1);// Take time for demonstration good objects on page
        scroll(1100);
        openUrl("https://www.warframe.com/ru/game/warframes");// They must be button but he work only manual,"Посмотреть варфреймы"

        String chosenWaframeName = warframe.waframeNameCheck().getText();
        warframe.garudaFrameClick().click();
        Assert.assertEquals(chosenWaframeName, warframe.nextWaframeNameCheck().getText());
    }

    @Test
    public void waframePrimeStorageAndCheckPrice() {

        Warframe warframe = new Warframe(driver);

        openUrl("https://www.warframe.com/ru");
        warframe.primeStorageClick().click();

        Assert.assertTrue(warframe.checkPriceAboutPrime().getText().contains("59"));
        warframe.primeBuy().click();
    }

    @Test
    public void waframeCheckPriceListDonate() {

        Warframe warframe = new Warframe(driver);

        openUrl("https://www.warframe.com/ru");
        warframe.openLinkMagazine();
        warframe.buyPlatinaPage().click();
        warframe.moveToDonate();
        String chosenPhonePrice = warframe.pricePlatinum().getText();

        Assert.assertEquals(chosenPhonePrice, warframe.nextPricePlatinum().getText());
    }

    @Test
    public void minecraftTestProcessChooseProductForBuyAndCheckChosenPlatform() {
        
        Minecraft minecraft = new Minecraft(driver);

        openUrl("https://www.minecraft.net/ru-ru");
        minecraft.acceptCookie().click();
        scroll(700);
        minecraft.openPageForBuyGame().click();
        minecraft.clickOnBuy().click();
        minecraft.buyPcVersion().click();

        Assert.assertTrue(minecraft.checkPlatformProduct().getText().contains("для ПК"));
    }

    @Test
    public void minecraftTestBuyAndPriceDungeonGame() {
        
        Minecraft minecraft = new Minecraft(driver);

        openUrl("https://www.minecraft.net/ru-ru");
        minecraft.acceptCookie().click();
        minecraft.moveToButtonGames();
        minecraft.dungeonGamesOpen().click();
        scroll(8200);
        minecraft.startBuying().click();
        minecraft.chooseWin().click();
        minecraft.chooseDlcEdition().click();
        minecraft.clickOnChosenEdition().click();
        minecraft.buyNowEdition().click();
        minecraft.clickOnCheckPrice().click();

        Assert.assertTrue(minecraft.nextGamePrice().getText().contains("505"));
    }

    @Test
    public void minecraftWatchTrailerLegendsAndCheckNamePage() {
        
        Minecraft minecraft = new Minecraft(driver);

        openUrl("https://www.minecraft.net/ru-ru");
        minecraft.acceptCookie().click();
        minecraft.moveToButtonGames();
        minecraft.openLegendsPage().click();

        Assert.assertTrue(minecraft.checkNameTrailer().getText().contains("Legends"));
        minecraft.watchTrailer().click();
    }

    @Test
    public void minecraftEducationRegisterProcessAndCheckDownloaderOnWindows() {
        
        Minecraft minecraft = new Minecraft(driver);

        openUrl("https://www.minecraft.net/ru-ru");
        minecraft.acceptCookie().click();
        minecraft.moveToButtonGames();
        minecraft.pageOpenEducation().click();
        minecraft.startEducate().click();
        minecraft.educateRole().click();
        minecraft.tryMinecraftEducate().click();
        minecraft.chooseTypeDownload().click();

        Assert.assertTrue(minecraft.checkOnHadTheyOnWindows().getText().contains("WINDOWS"));
    }

    @Test
    public void sushiBuySetWithChosenFilterAndCheckPrice() {

        Sushi sushi = new Sushi(driver);

        openUrl("https://kyiv.sushi-master.ua/?utm_source=googlemaps&gclid=CjwKCAjw_b6WBhAQEiwAp4HyIE6prf7PNdR-WP0PQe78S9FEG51jf3WDeQKA02V8hg-x1OfJwnSFHBoCRccQAvD_BwE");
        sushi.setChoose().click();
        sushi.filterSetsClick().click();
        sushi.moreHigherPrice().click();
        sushi.biggerSetsFirst().click();
        sushi.acceptFilter().click();
        sushi.addOnCard().click();
        String priceSetChose = sushi.priceOnSet().getText();
        sushi.openCart().click();

        Assert.assertEquals(priceSetChose, sushi.priceOnSet().getText());
    }

    @Test
    public void leagueChoseChampionWithRankAndCheckThisRank() {
        
        League league = new League(driver);

        openUrl("https://u.gg");
        league.championPage().click();
        league.chooseAkaliChampion().click();
        sleep(2);//Need bcs moveTo its void type, and need time for click on button
        league.moveToButtonRank();
        league.selectRank().click();
        league.choseSelectRank().click();

        Assert.assertTrue(league.checkRankChose().getText().contains("Diamond"));
    }

    @Test
    public void sinoptikChoseCityWeatherAndCheckCityChose() {
        
        Sinoptik sinoptik = new Sinoptik(driver);

        openUrl("https://ua.sinoptik.ua/погода-київ");
        sinoptik.changeLanguege().click();
        sinoptik.searchCity().click();
        sinoptik.searchCity().sendKeys("Одесcа");
        sinoptik.enterSearch().click();

        Assert.assertTrue(sinoptik.checkChosenWeatherCity().getText().contains("Одессе"));
    }

    @Test
    public void blizzardTestChoseSubcribeAndCheckChosenNameGameForSubcribe() {
        
        Blizzard blizzard = new Blizzard(driver);

        openUrl("https://www.blizzard.com/ru-ru/");
        blizzard.gameClickPage().click();
        blizzard.wowOpen().click();
        blizzard.buyPodpiska().click();
        blizzard.choseBuySubscribeOnOneMonth().click();

        Assert.assertTrue(blizzard.checkNameGameOnSubcribe().getText().contains("World"));
    }

    @Test
    public void blizzardPageOverwatchAndHeroWithCheckNameChosenHero() {
        
        Blizzard blizzard = new Blizzard(driver);

        openUrl("https://www.blizzard.com/ru-ru/");
        blizzard.gameClickPage().click();
        blizzard.openPageOverwatch().click();
        blizzard.pageWithListHeroes().click();
        scroll(1000);
        sleep(2);//Need more time for chose object
        Assert.assertTrue(blizzard.heroName().getText().contains("Сомбра"));
        blizzard.choseHeroSombra().click();
        blizzard.firstAbility().click();
        scroll(900);
        blizzard.storyCharacter().click();
        scroll(1900);
    }

    @Test
    public void blizzardHotsPageWithCheckChosenNameMap() {
        
        Blizzard blizzard = new Blizzard(driver);

        openUrl("https://www.blizzard.com/ru-ru/");
        blizzard.gameClickPage().click();
        blizzard.hotsGamePage().click();
        blizzard.gameHotsPage().click();
        blizzard.mapsGameOpen().click();
        blizzard.mapsGardenChose().click();

        Assert.assertTrue(blizzard.nameCheckMap().getText().contains("Сад"));
    }

    @Test
    public void blizzardDiabloCheckListRankAndVerifyNamePlayer() {
        
        Blizzard blizzard = new Blizzard(driver);

        openUrl("https://www.blizzard.com/ru-ru/");
        blizzard.gameClickPage().click();
        blizzard.openDiablo().click();
        blizzard.rankList().click();
        blizzard.selectRankClass().click();
        blizzard.choseDhClass().click();
        blizzard.playerTopChose().click();
        blizzard.choseAnotherHeroPlayer().click();

        Assert.assertTrue(blizzard.checkNamePlayer().getText().contains("GABON"));
    }
}

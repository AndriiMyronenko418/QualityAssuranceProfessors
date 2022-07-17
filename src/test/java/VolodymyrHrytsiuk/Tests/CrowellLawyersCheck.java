package VolodymyrHrytsiuk.Tests;

import BasePageAndTestInit.TestInit;
import VolodymyrHrytsiuk.Tests.Pages.HomePageCrowell;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CrowellLawyersCheck extends TestInit {

    @Test
    public void CheckLawyers() {
        HomePageCrowell homePageCrw = new HomePageCrowell(driver);

        openUrl("https://www.crowell.com/");
        homePageCrw.selectProfessionalsTitle().click();
        homePageCrw.acceptAllCookiesButton().click();
        homePageCrw.findProfessionalsLaterA().click();
        homePageCrw.lawyerKatieAber().get(0).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("Katie-Aber"));

        goBack();
        homePageCrw.lawyerRoyAbernathy().get(0).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("Roy-Abernathy"));

        goBack();
        homePageCrw.lawyerDeirdreLongAbsolonne().get(0).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("Deirdre-Long-Absolonne"));

        goBack();
        homePageCrw.lawyerRandaAdra().get(0).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("Randa-Adra"));

        goBack();
        homePageCrw.lawyerTiffanyAguiar().get(0).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("Tiffany-Aguiar"));

        goBack();
        homePageCrw.lawyerDianeAguirreDominguez().get(0).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("Diane-Aguirre-Dominguez"));

        goBack();
        homePageCrw.lawyerConnorAhearn().get(0).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("Connor-Ahearn"));

        goBack();
        homePageCrw.lawyerVassilisAkritidis().get(0).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("Vassilis-Akritidis"));

        goBack();
        homePageCrw.lawyerSeifAlDaajeh().get(0).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("Seif-Al-Daajeh"));

        goBack();
        homePageCrw.lawyerZainabAlSadooni().get(0).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("Zainab-Al-Sadooni"));

        goBack();
        homePageCrw.lawyerEmilyAlban().get(0).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("Emily-Alban"));

        goBack();
        homePageCrw.lawyerTerryLAlbertson().get(0).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("Terry-Albertson"));

        goBack();
        homePageCrw.lawyerJoselleAlbracht().get(0).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("Joselle-Albracht"));

        goBack();
        homePageCrw.lawyerPatriciaMAlexander().get(0).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("Patricia-Alexander"));

        goBack();
        homePageCrw.lawyerMoniqueDAlmy().get(0).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("Monique-Almy"));

        goBack();
        homePageCrw.lawyerJillianAmbrose().get(0).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("Jillian-Ambrose"));

        goBack();
        homePageCrw.lawyerWilliamLAnderson().get(0).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("William-Anderson"));

        goBack();
        homePageCrw.lawyerOlivierNAntoine().get(0).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("Olivier-Antoine"));

        goBack();
        homePageCrw.lawyerJohnAnwesen().get(0).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("John-Anwesen"));

        goBack();
        homePageCrw.lawyerLauraOffenbacherAradi().get(0).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("Laura-Offenbacher-Aradi"));

        goBack();
        homePageCrw.lawyerDeborahEArbabi().get(0).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("Deborah-Arbabi"));

        goBack();
        homePageCrw.lawyerKarlaArias().get(0).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("Karla-Arias"));

        goBack();
        homePageCrw.lawyerLaurenAronson().get(0).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("Lauren-Aronson"));

        goBack();
        homePageCrw.lawyerJuanArteaga().get(0).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("Juan-Arteaga"));

        goBack();
        homePageCrw.lawyerKainoaAsuega().get(0).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("Kainoa-Asuega"));

        goBack();
        homePageCrw.lawyerStefanieAtchinson().get(0).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("Stefanie-Atchinson"));

        goBack();
        homePageCrw.lawyerMichaelAtkinson().get(0).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("Michael-Atkinson"));

        goBack();
        homePageCrw.lawyerNimrodHaimAviad().get(0).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("Nimrod-Aviad"));

        goBack();
        homePageCrw.lawyerAndrewAvsec().get(0).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("Andrew-Avsec"));
    }
}

package VolodymyrHrytsiuk.Tests.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePageCrowell extends BasePage {
    public HomePageCrowell(WebDriver driver) {
        super(driver);
    }

    private static final String PROFESSIONALS_TITLE_BTN = "//a[@id='mnb_professionals']";
    private static final String JOB_TITLE_PARTNER_BTN = "//option[text()='Partner']";
    private static final String OFFICE_BTN = "//select[@id='office']";
    private static final String OFFICE_BRUSSELS_CHOOS = "//select[@id='office']/option[text()='Brussels']";
    private static final String PRACTISE_ADVER_AND_MEDIA_CHOOS = "//select[@id='practice']/option[2]";
    private static final String INDUSTRY_AERO_AND_DEF_CHOOS = "//select[@id='industry']/option[text()='Aerospace & Defense']";
    private static final String LAW_SCHOOL_ALBANY_LS_CHOOS = "//select[@id='school']/option[text()='Albany Law School']";
    private static final String LAND_LANGUAGE_SWEDISH_CHOOS = "//select[@id='lang']/option[text()='Swedish']";
    private static final String BAR_ADMISSIONS_CALIFORNIA_CHOOS = "//select[@id='adm']/option[text()='California']";
    private static final String GOVERNMENT_EXPERIENCE_BANKRUPCY_COURT_CHOOS = "//select[@id='govtexp']/option[text()='Bankruptcy Court']";
    private static final String PROFESSIONAL_SEARCH_BTN = "//button[@id= 'professionalsSearchButton']";
    private static final String SEARCH_RESULT_IS_0 = "//div[text()='0 result']";
    private static final String ACCEPT_ALL_COOKIES_BTN = "//button[@id= 'onetrust-accept-btn-handler']";

    private static final String UKR_CRISIS_CENTER = "//h3[text()= 'Ukraine Crisis Resource Center']";
    private static final String UKR_CRISIS_INSIGHTS = "//div[contains(@class,'Link')and contains(text(),'Insights')]";
    private static final String UKR_CRISIS_WEBINARS = "//div[text()='Webinars']";
    private static final String UKR_CRISIS_PRESS_COVERAGE = "//div[contains(@class,'Title')and contains(text(),'Press')]";
    private static final String UKR_EXTERNAL_RESOURSES = "//div[text()='External Resources']";
    private static final String OFAC_RECENT_ACTIONS_BTN = "//a[text()='OFAC Recent Actions']";

    private static final String EXPERIENCE_BTN = "//a[contains(@href,'/Practices')and contains(@id,'mnb_practices')]";
    private static final String ADVERTISING_AND_MEDIA = "//a[@href='/Practices/Advertising-Media']";
    private static final String CONTACTS_DEPLOY_BTN = "//div[@id='contactsButton']";
    private static final String FALSE_ADVER_DIS_AND_LIT_BNT = "//a[text()='False Advertising Disputes & Litigation']";
    private static final String TRANSACTION_AND_AGREEMENT_BTN = "//a[text()='Transactions & Agreements']";
    private static final String DIGITAL_ADVERTISING_BTN = "//a[text()='Digital Advertising']";
    private static final String RISK_PREVENTION_AND_CC_BNT = "//a[text()='Risk Prevention & Compliance Counseling']";
    private static final String TECHNOLOGY_AND_B_PROTECTION_BTN = "//a[text()='Technology & Brand Protection']";
    private static final String TRADEMARC_COUNS_AND_L_BTN = "//a[text()='Trademark Counseling & Litigation']";
    private static final String COPYRIGHT_COUNSELING_AND_L_BTN = "//a[text()='Copyright Counseling & Litigation']";
    private static final String STATE_ATTORNEYS_GENERAL_BTN = "//a[text()='State Attorneys General']";
    private static final String STATE_ATTORNEYS_MAP = "//img[contains(@src,'US-mapCMStateAG')]";

    private static final String HOMEPAGE_LOCATIONS_BTN = "//a[@id='mnb_locations']";
    private static final String LOCATION_BRUSSELS_BTN = "//a[contains(@href,'Brussels')and contains(@class,'caps')]";
    private static final String LOCATION_CHICAGO_BTN = "//a[contains(@href,'Chicago')and contains(@class,'caps')]";
    private static final String LOCATION_DENVER_BTN = "//a[contains(@href,'Denver')and contains(@class,'caps')]";
    private static final String LOCATION_DOHA_BTN = "//a[contains(@href,'Doha')and contains(@class,'caps')]";
    private static final String LOCATION_INDIANAPOLIS_BTN = "//a[contains(@href,'Indianapolis')and contains(@class,'caps')]";
    private static final String LOCATION_LONDON_BTN = "//a[contains(@href,'London')and contains(@class,'caps')]";
    private static final String LOCATION_LOS_ANGELES_BTN = "//a[contains(@href,'Los-Angeles')and contains(@class,'caps')]";
    private static final String LOCATION_NEW_YORK_BTN = "//a[contains(@href,'New-York')and contains(@class,'caps')]";
    private static final String LOCATION_ORANGE_COUNTY_BTN = "//a[contains(@href,'Orange-County')and contains(@class,'caps')]";
    private static final String LOCATION_SAN_FRANCISCO_BTN = "//a[contains(@href,'San-Francisco')and contains(@class,'caps')]";
    private static final String LOCATION_SHANGHAI_BTN = "//a[contains(@href,'Shanghai')and contains(@class,'caps')]";
    private static final String LOCATION_WASHINGTON_DC_BTN = "//a[contains(@href,'Washington-DC')and contains(@class,'caps')]";
    private static final String LOCATION_SINGAPORE_BTN = "//a[contains(@href,'Singapore')and contains(@class,'caps')]";
    //lawyers
    private static final String SEARCH_A_BTN = "//div[@id='professionals_lookup']/ul/li[1]/a";
    private static final String KATIE_ABER_PROFILE = "//a[contains(@href,'Katie-Aber')]";
    private static final String ROY_ABERNATHY_PROFILE = "//a[contains(@href,'Roy-Abernathy')]";
    private static final String DEIRDRE_LONG_ABSOLONNE_PROFILE = "//a[contains(@href,'Deirdre-Long-Absolonne')]";
    private static final String RANDA_ADRA_PROFILE = "//a[contains(@href,'Randa-Adra')]";
    private static final String TIFFANY_AGUIAR_PROFILE = "//a[contains(@href,'Tiffany-Aguiar')]";
    private static final String DIANE_AGUIRRE_DOMINGUEZ_PROFILE = "//a[contains(@href,'Diane-Aguirre-Dominguez')]";
    private static final String CONNOR_AHEARN_PROFILE = "//a[contains(@href,'Connor-Ahearn')]";
    private static final String VASSILIS_AKRITIDIS_PROFILE = "//a[contains(@href,'Vassilis-Akritidis')]";
    private static final String SEIF_AL_DAAJEH_PROFILE = "//a[contains(@href,'Seif-Al-Daajeh')]";
    private static final String ZAINAB_AL_SADOONI_PROFILE = "//a[contains(@href,'Zainab-Al-Sadooni')]";
    private static final String EMILY_ALBAN_PROFILE = "//a[contains(@href,'Emily-Alban')]";
    private static final String TERRY_ALBERTSON_PROFILE = "//a[contains(@href,'Terry-Albertson')]";
    private static final String JOSELLE_ALBRACHT_PROFILE = "//a[contains(@href,'Joselle-Albracht')]";
    private static final String PATRICIA_ALEXANDER_PROFILE = "//a[contains(@href,'Patricia-Alexander')]";
    private static final String MONIQUE_ALMY_PROFILE = "//a[contains(@href,'Monique-Almy')]";
    private static final String JILLIAN_AMBROSE_PROFILE = "//a[contains(@href,'Jillian-Ambrose')]";
    private static final String WILLIAM_ANDERSON_PROFILE = "//a[contains(@href,'William-Anderson')]";
    private static final String OLIVER_ANTOINE_PROFILE = "//a[contains(@href,'Olivier-Antoine')]";
    private static final String JOHN_ANWESEN_PROFILE = "//a[contains(@href,'John-Anwesen')]";
    private static final String LAURA_OFFENBACHER_ARADI_PROFILE = "//a[contains(@href,'Laura-Offenbacher-Aradi')]";
    private static final String DEBORAH_ARBABI_PROFILE = "//a[contains(@href,'Deborah-Arbabi')]";
    private static final String KARLA_ARIAS_PROFILE = "//a[contains(@href,'Karla-Arias')]";
    private static final String LAUREN_ARONSON_PROFILE = "//a[contains(@href,'Lauren-Aronson')]";
    private static final String JUAN_ARTEAGA_PROFILE = "//a[contains(@href,'Juan-Arteaga')]";
    private static final String KAINOA_ASUEGA_PROFILE = "//a[contains(@href,'Kainoa-Asuega')]";
    private static final String STEFANIE_ATCHINSON_PROFILE = "//a[contains(@href,'Stefanie-Atchinson')]";
    private static final String MICHAEL_ATKINSON_PROFILE = "//a[contains(@href,'Michael-Atkinson')]";
    private static final String NIMROD_HAIM_PROFILE = "//a[contains(@href,'Nimrod-Aviad')]";
    private static final String ANDREW_AVSEC_PROFILE = "//a[contains(@href,'Andrew-Avsec')]";

    private static final String GOVERNMENT_EXPERIENCE_BTN = "//ul[@id='search_form']/li/div[6]/a";
    private static final String GOVERNMENT_EXP_USA_LIST = "//span[@class='govtexp-expand']";
    private static final String BRUSSELS_MAIN_PRACTICE_AREAS = "//a[contains(@href,'Brussels-Practice')]";


    public WebElement selectProfessionalsTitle() {
        return $(PROFESSIONALS_TITLE_BTN);
    }

    public WebElement selectJobTitlePartner() {
        return $(JOB_TITLE_PARTNER_BTN);
    }

    public WebElement selectOffice() {
        return $(OFFICE_BTN);
    }

    public WebElement selectOfficeBrussels() {
        return $(OFFICE_BRUSSELS_CHOOS);
    }

    public WebElement selectPracticeAdverAndMedia() {
        return $(PRACTISE_ADVER_AND_MEDIA_CHOOS);
    }

    public WebElement selectIndustryAeroAndDef() {
        return $(INDUSTRY_AERO_AND_DEF_CHOOS);
    }

    public WebElement selectLawSchoolAlbanyLS() {
        return $(LAW_SCHOOL_ALBANY_LS_CHOOS);
    }

    public WebElement selectLandLanguageSwedish() {
        return $(LAND_LANGUAGE_SWEDISH_CHOOS);
    }

    public WebElement selectBarAdmissionsCalifornia() {
        return $(BAR_ADMISSIONS_CALIFORNIA_CHOOS);
    }

    public WebElement selectGovernmentExperienceBankrupcyCourt() {
        return $(GOVERNMENT_EXPERIENCE_BANKRUPCY_COURT_CHOOS);
    }

    public WebElement professionalSearchButton() {
        return $(PROFESSIONAL_SEARCH_BTN);
    }

    public WebElement searshResultIs0() {
        return $(SEARCH_RESULT_IS_0);
    }

    public WebElement acceptAllCookiesButton() {
        return $(ACCEPT_ALL_COOKIES_BTN);
    }

    public WebElement ukrCrisisCenter() {
        return $$(UKR_CRISIS_CENTER).get(0);
    }

    public WebElement ukrCrisisInsights() {
        return $(UKR_CRISIS_INSIGHTS);
    }

    public WebElement ukrCrisisWebinars() {
        return $(UKR_CRISIS_WEBINARS);
    }

    public WebElement ukrCrisisPressCoverage() {
        return $(UKR_CRISIS_PRESS_COVERAGE);
    }

    public WebElement ukrExternalResourses() {
        return $(UKR_EXTERNAL_RESOURSES);
    }

    public WebElement experienceButton() {
        return $(EXPERIENCE_BTN);
    }

    public WebElement ofacRecentActions() {
        return $(OFAC_RECENT_ACTIONS_BTN);
    }

    public WebElement advertisingAndMediaSelect() {
        return $$(ADVERTISING_AND_MEDIA).get(0);
    }

    public WebElement contactsDeploy() {
        return $(CONTACTS_DEPLOY_BTN);
    }

    public WebElement falseAdvertDisAndLitig() {
        return $(FALSE_ADVER_DIS_AND_LIT_BNT);
    }

    public WebElement transactionsAndAgreement() {
        return $(TRANSACTION_AND_AGREEMENT_BTN);
    }

    public WebElement digitalAdvertising() {
        return $(DIGITAL_ADVERTISING_BTN);
    }

    public WebElement riskPreventAndCCounseling() {
        return $(RISK_PREVENTION_AND_CC_BNT);
    }

    public WebElement technologyAndBProtection() {
        return $(TECHNOLOGY_AND_B_PROTECTION_BTN);
    }

    public WebElement copyrightCounselingAndLitigation() {
        return $(TRADEMARC_COUNS_AND_L_BTN);
    }

    public WebElement trademarcCounsAndLitigation() {
        return $(COPYRIGHT_COUNSELING_AND_L_BTN);
    }

    public WebElement stateAttorneysGeneral() {
        return $(STATE_ATTORNEYS_GENERAL_BTN);
    }

    public WebElement stateAttroneyMap() {
        return $(STATE_ATTORNEYS_MAP);
    }

    //locations
    public WebElement getHomepageLocations() {
        return $(HOMEPAGE_LOCATIONS_BTN);
    }

    public WebElement getLocationBrussels() {
        return $(LOCATION_BRUSSELS_BTN);
    }

    public WebElement getLocationChicago() {
        return $(LOCATION_CHICAGO_BTN);
    }

    public WebElement getLocationDenver() {
        return $(LOCATION_DENVER_BTN);
    }

    public WebElement getLocationDoha() {
        return $(LOCATION_DOHA_BTN);
    }

    public WebElement getLocationIndianapolis() {
        return $(LOCATION_INDIANAPOLIS_BTN);
    }

    public WebElement getLocationLondon() {
        return $(LOCATION_LONDON_BTN);
    }

    public WebElement getLocationLosAngeles() {
        return $(LOCATION_LOS_ANGELES_BTN);
    }

    public WebElement getLocationNewYork() {
        return $(LOCATION_NEW_YORK_BTN);
    }

    public WebElement getLocationOrangeCounty() {
        return $(LOCATION_ORANGE_COUNTY_BTN);
    }

    public WebElement getLocationSanFrancisco() {
        return $(LOCATION_SAN_FRANCISCO_BTN);
    }

    public WebElement getLocationShanghai() {
        return $(LOCATION_SHANGHAI_BTN);
    }

    public List<WebElement> getLocationWashingtonDC() {
        return $$(LOCATION_WASHINGTON_DC_BTN);
    }

    public WebElement getLocationSingapore() {
        return $(LOCATION_SINGAPORE_BTN);
    }

    public WebElement findProfessionalsLaterA() {
        return $(SEARCH_A_BTN);
    }

    public List<WebElement> lawyerKatieAber() {
        return $$(KATIE_ABER_PROFILE);
    }

    public List<WebElement> lawyerRoyAbernathy() {
        return $$(ROY_ABERNATHY_PROFILE);
    }

    public List<WebElement> lawyerDeirdreLongAbsolonne() {
        return $$(DEIRDRE_LONG_ABSOLONNE_PROFILE);
    }

    public List<WebElement> lawyerRandaAdra() {
        return $$(RANDA_ADRA_PROFILE);
    }

    public List<WebElement> lawyerTiffanyAguiar() {
        return $$(TIFFANY_AGUIAR_PROFILE);
    }

    public List<WebElement> lawyerDianeAguirreDominguez() {
        return $$(DIANE_AGUIRRE_DOMINGUEZ_PROFILE);
    }

    public List<WebElement> lawyerConnorAhearn() {
        return $$(CONNOR_AHEARN_PROFILE);
    }

    public List<WebElement> lawyerVassilisAkritidis() {
        return $$(VASSILIS_AKRITIDIS_PROFILE);
    }

    public List<WebElement> lawyerSeifAlDaajeh() {
        return $$(SEIF_AL_DAAJEH_PROFILE);
    }

    public List<WebElement> lawyerZainabAlSadooni() {
        return $$(ZAINAB_AL_SADOONI_PROFILE);
    }

    public List<WebElement> lawyerEmilyAlban() {
        return $$(EMILY_ALBAN_PROFILE);
    }

    public List<WebElement> lawyerTerryLAlbertson() {
        return $$(TERRY_ALBERTSON_PROFILE);
    }

    public List<WebElement> lawyerJoselleAlbracht() {
        return $$(JOSELLE_ALBRACHT_PROFILE);
    }

    public List<WebElement> lawyerPatriciaMAlexander() {
        return $$(PATRICIA_ALEXANDER_PROFILE);
    }

    public List<WebElement> lawyerMoniqueDAlmy() {
        return $$(MONIQUE_ALMY_PROFILE);
    }

    public List<WebElement> lawyerJillianAmbrose() {
        return $$(JILLIAN_AMBROSE_PROFILE);
    }

    public List<WebElement> lawyerWilliamLAnderson() {
        return $$(WILLIAM_ANDERSON_PROFILE);
    }

    public List<WebElement> lawyerOlivierNAntoine() {
        return $$(OLIVER_ANTOINE_PROFILE);
    }

    public List<WebElement> lawyerJohnAnwesen() {
        return $$(JOHN_ANWESEN_PROFILE);
    }

    public List<WebElement> lawyerLauraOffenbacherAradi() {
        return $$(LAURA_OFFENBACHER_ARADI_PROFILE);
    }

    public List<WebElement> lawyerDeborahEArbabi() {
        return $$(DEBORAH_ARBABI_PROFILE);
    }

    public List<WebElement> lawyerKarlaArias() {
        return $$(KARLA_ARIAS_PROFILE);
    }

    public List<WebElement> lawyerLaurenAronson() {
        return $$(LAUREN_ARONSON_PROFILE);
    }

    public List<WebElement> lawyerJuanArteaga() {
        return $$(JUAN_ARTEAGA_PROFILE);
    }

    public List<WebElement> lawyerKainoaAsuega() {
        return $$(KAINOA_ASUEGA_PROFILE);
    }

    public List<WebElement> lawyerStefanieAtchinson() {
        return $$(STEFANIE_ATCHINSON_PROFILE);
    }

    public List<WebElement> lawyerMichaelAtkinson() {
        return $$(MICHAEL_ATKINSON_PROFILE);
    }

    public List<WebElement> lawyerNimrodHaimAviad() {
        return $$(NIMROD_HAIM_PROFILE);
    }

    public List<WebElement> lawyerAndrewAvsec() {
        return $$(ANDREW_AVSEC_PROFILE);
    }

    public WebElement getGovernmentExperience() {
        return $(GOVERNMENT_EXPERIENCE_BTN);
    }

    public void moveToButtonProfessionals() {
        moveCursor($(PROFESSIONALS_TITLE_BTN));
    }

    public List<WebElement> getGovExpUsaList() {
        return $$(GOVERNMENT_EXP_USA_LIST);
    }

    public List<WebElement> getBrusselMainPractiseAreas() {
        return $$(BRUSSELS_MAIN_PRACTICE_AREAS);
    }
}
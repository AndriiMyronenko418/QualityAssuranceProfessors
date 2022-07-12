package VolodymyrHrytsiuk.Tests.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
}
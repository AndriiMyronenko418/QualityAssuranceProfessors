package TSibatyykEvhenii.Pages.InternationalTest;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AfterTestPage extends BasePage {

    public AfterTestPage(WebDriver driver) {
        super(driver);
    }

    private static final String TEXT_FIELD = "//input[contains(@type,'text')]";
    private static final String EMAIL_FIELD = "//input[contains(@type,'email')]";
    private static final String VALIDATE_BTN = "//button[contains(@type,'submit')]";
    private static final String CHOOSE_COUNTRY = "//select[contains(@id,'ResultCountry')]";
    private static final String GENDER_BTN = "//select[contains(@id,'ResultGender')]";
    private static final String GENDER_MAN = "//option[contains(text(),'Чоловік')]";
    private static final String BIRTHDAY_BTN = "//select[contains(@id,'ResultBirth')]";
    private static final String STUDY_BTN = "//select[contains(@id,'ResultStudy')]";
    private static final String DIPLOMA_BTN = "//select[contains(@id,'ResultDiploma')]";
    private static final String STUDY_LEVEL = "//option[contains(@value,'none')]";
    private static final String CHOOSE_BIRTHDAY = "//option[contains(@value,'1987')]";
    private static final String CHOOSE_STUDY = "//option[contains(@value,'highschool')]";

    public WebElement firstNameField(){
        return $(TEXT_FIELD);
    }

    public WebElement goToValidateBtn(){
        return $(VALIDATE_BTN);
    }

    public WebElement emailField(){
        return $(EMAIL_FIELD);
    }

    public WebElement countryBtn(){
        return $(CHOOSE_COUNTRY);
    }
    public WebElement genderBtn(){
        return $(GENDER_BTN);
    }

    public WebElement genderMan(){
        return $(GENDER_MAN);
    }

    public WebElement birthdayBtn(){
        return $(BIRTHDAY_BTN);
    }

    public WebElement chooseBirthday(){
        return $(CHOOSE_BIRTHDAY);
    }

    public WebElement choseSchoolBtn(){
        return $(STUDY_BTN);
    }

    public WebElement selectSchool(){
        return $(CHOOSE_STUDY);
    }

    public WebElement chooseDiplomaBtn(){
        return $(DIPLOMA_BTN);
    }

    public WebElement selectDiploma(){
        return $(STUDY_LEVEL);
    }
}
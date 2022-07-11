package Safron.Disney.Pages;

import org.openqa.selenium.WebDriver;

public class DisneySearchResultPageHelper extends DisneySearchResultPageElements {
    public DisneySearchResultPageHelper(WebDriver driver) {
        super(driver);
    }

    String textCategory;

    public String getTextCategory() {
        return this.textCategory;
    }

    public void setTextCategory() {
        textCategory = spiderManCategory().getText();
    }

    private String textTitle;

    public String getTextTitle() {
        return this.textTitle;
    }

    public void setTextTitle() {
        textTitle = titleText().getText();
    }

    private String oneOfProductText;

    public void setOneOfProductText() {
        oneOfProductText = oneOfProduct().getText().substring(26, 30);
    }

    public String getOneOfProductText() {
        return this.oneOfProductText;
    }

    String genderFilterBoysText;

    public void setGenderFilterBoysText() {
        genderFilterBoysText = genderFilterBoys().getText();
    }

    public String getGenderFilterBoysText() {
        return this.genderFilterBoysText;
    }
}

package VolodymyrHrytsiuk.Tests;

import BasePageAndTestInit.TestInit;
import VolodymyrHrytsiuk.Tests.Pages.HomePageCrowell;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HeaderLocationsCheck extends TestInit {

    @Test
    public void locationBrusselsCheck() {
    
        HomePageCrowell homePageCrw = new HomePageCrowell(driver);

        openUrl("https://www.crowell.com/");
        homePageCrw.getHomepageLocations().click();
        homePageCrw.getLocationBrussels().click();

        Assert.assertEquals(12, homePageCrw.getBrusselMainPractiseAreas().size());
    }

    @Test
    public void locationChicagoCheck() {
    
        HomePageCrowell homePageCrw = new HomePageCrowell(driver);

        openUrl("https://www.crowell.com/");
        homePageCrw.getHomepageLocations().click();
        homePageCrw.getLocationChicago().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("Chicago"));
    }

    @Test
    public void locatioDenverCheck() {
    
        HomePageCrowell homePageCrw = new HomePageCrowell(driver);

        openUrl("https://www.crowell.com/");
        homePageCrw.getHomepageLocations().click();
        homePageCrw.getLocationDenver().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("Denver"));
    }

    @Test
    public void locatioDohaCheck() {
    
        HomePageCrowell homePageCrw = new HomePageCrowell(driver);

        openUrl("https://www.crowell.com/");
        homePageCrw.getHomepageLocations().click();
        homePageCrw.getLocationDoha().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("Doha"));
    }

    @Test
    public void locationIndianapolisCheck() {
    
        HomePageCrowell homePageCrw = new HomePageCrowell(driver);

        openUrl("https://www.crowell.com/");
        homePageCrw.getHomepageLocations().click();
        homePageCrw.getLocationIndianapolis().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("Indianapolis"));
    }

    @Test
    public void locationLondonCheck() {
    
        HomePageCrowell homePageCrw = new HomePageCrowell(driver);

        openUrl("https://www.crowell.com/");
        homePageCrw.getHomepageLocations().click();
        homePageCrw.getLocationLondon().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("London"));
    }

    @Test
    public void locationLosAngelesCheck() {
    
        HomePageCrowell homePageCrw = new HomePageCrowell(driver);

        openUrl("https://www.crowell.com/");
        homePageCrw.getHomepageLocations().click();
        homePageCrw.getLocationLosAngeles().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("Los-Angeles"));
    }

    @Test
    public void locationNewYorkCheck() {
    
        HomePageCrowell homePageCrw = new HomePageCrowell(driver);

        openUrl("https://www.crowell.com/");
        homePageCrw.getHomepageLocations().click();
        homePageCrw.getLocationNewYork().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("New-York"));
    }

    @Test
    public void locationOrangeCountyCheck() {
    
        HomePageCrowell homePageCrw = new HomePageCrowell(driver);

        openUrl("https://www.crowell.com/");
        homePageCrw.getHomepageLocations().click();
        homePageCrw.getLocationOrangeCounty().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("Orange-County"));
    }

    @Test
    public void locationSanFranciskoCheck() {
    
        HomePageCrowell homePageCrw = new HomePageCrowell(driver);

        openUrl("https://www.crowell.com/");
        homePageCrw.getHomepageLocations().click();
        homePageCrw.getLocationSanFrancisco().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("San-Francisco"));
    }

    @Test
    public void locationShanghaiCheck() {
    
        HomePageCrowell homePageCrw = new HomePageCrowell(driver);

        openUrl("https://www.crowell.com/");
        homePageCrw.getHomepageLocations().click();
        homePageCrw.getLocationShanghai().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("Shanghai"));
    }

    @Test
    public void locationWashingtonDCCheck() {
    
        HomePageCrowell homePageCrw = new HomePageCrowell(driver);

        openUrl("https://www.crowell.com/");
        homePageCrw.getHomepageLocations().click();
        homePageCrw.getLocationWashingtonDC().get(0).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("Washington-DC"));
    }
}

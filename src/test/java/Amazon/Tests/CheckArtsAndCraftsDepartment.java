package Amazon.Tests;

import Amazon.Pages.HomePage;
import Amazon.Pages.PaintingDrawingArtSuppliesPage;
import BasePageAndTestInit.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckArtsAndCraftsDepartment extends TestInit {

    @Test
    public void checkArtsAndCraftsDepartment() {

        HomePage homePage = new HomePage(driver);
        PaintingDrawingArtSuppliesPage paintingDrawingArtSuppliesPage = new PaintingDrawingArtSuppliesPage(driver);

        openUrl("https://www.amazon.com");
        homePage.getDeliveryDontChangeButton();
        homePage.getAllMenuButton().click();
        homePage.getArtsAndCraftsDepartmentButton().click();
        homePage.getPaintingDrawingAndArtSuppliesBtn().click();

        Assert.assertTrue(paintingDrawingArtSuppliesPage.checkURLPaintingDrawingPage());
        Assert.assertTrue(paintingDrawingArtSuppliesPage.getDropdownDescription().getText().contains("Painting, Drawing & Art Supplies"));

        paintingDrawingArtSuppliesPage.getArtPaperDepartmentBtn().click();

        Assert.assertTrue(paintingDrawingArtSuppliesPage.checkUrlArtPaper());
        Assert.assertTrue(paintingDrawingArtSuppliesPage.getDropdownDescription().getText().contains("Art Paper"));

        goBack();
        paintingDrawingArtSuppliesPage.getBoardsCanvasDepartmentBtn().click();

        Assert.assertTrue(paintingDrawingArtSuppliesPage.checkUrlBoardsCanvas());
        Assert.assertTrue(paintingDrawingArtSuppliesPage.getDropdownDescription().getText().contains("Artists Boards & Canvas"));

        goBack();
        paintingDrawingArtSuppliesPage.getDrawingDepartmentBtn().click();

        Assert.assertTrue(paintingDrawingArtSuppliesPage.checkUrlDrawing());
        Assert.assertTrue(paintingDrawingArtSuppliesPage.getDropdownDescription().getText().contains("Art Drawing Supplies"));

        goBack();
        paintingDrawingArtSuppliesPage.getEaselsDepartmentBtn().click();

        Assert.assertTrue(paintingDrawingArtSuppliesPage.checkUrlEasels());
        Assert.assertTrue(paintingDrawingArtSuppliesPage.getDropdownDescription().getText().contains("Arts & Crafts Easels"));

        goBack();
        paintingDrawingArtSuppliesPage.getPaintingDepartmentsBtn().click();

        Assert.assertTrue(paintingDrawingArtSuppliesPage.checkUrlPainting());
        Assert.assertTrue(paintingDrawingArtSuppliesPage.getDropdownDescription().getText().contains("Artists Painting Supplies"));

        goBack();
        paintingDrawingArtSuppliesPage.getBrushPenCleaners().click();

        Assert.assertTrue(paintingDrawingArtSuppliesPage.checkUrlBrushAndPenCleaners());
        Assert.assertTrue(paintingDrawingArtSuppliesPage.getDropdownDescription().getText().contains("Brush & Pen Cleaners"));
    }
}
package Amazon.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaintingDrawingArtSuppliesPage extends BasePage {

    public PaintingDrawingArtSuppliesPage(WebDriver driver) {
        super(driver);
    }

    private static final String ART_PAPER_DEPARTMENT = "//span[text()= 'Art Paper']";
    private static final String BOARDS_CANVAS_DEPARTMENT = "//span[text()= 'Boards & Canvas']";
    private static final String DRAWING_DEPARTMENT = "//span[text()= 'Drawing']";
    private static final String EASELS_DEPARTMENT = "//span[text()= 'Easels']";
    private static final String PAINTING_DEPARTMENT = "//span[text()= 'Painting']";
    private static final String BRUSH_PEN_CLEANERS = "//span[text()= 'Brush & Pen Cleaners']";
    private static final String DROPDOWN_DESCRIPTION = "//div[@class='nav-search-scope nav-sprite']";

    public WebElement getArtPaperDepartmentBtn() {
        return $(ART_PAPER_DEPARTMENT);
    }

    public WebElement getBoardsCanvasDepartmentBtn() {
        return $(BOARDS_CANVAS_DEPARTMENT);
    }

    public WebElement getDrawingDepartmentBtn() {
        return $(DRAWING_DEPARTMENT);
    }

    public WebElement getEaselsDepartmentBtn() {
        return $(EASELS_DEPARTMENT);
    }

    public WebElement getPaintingDepartmentsBtn() {
        return $(PAINTING_DEPARTMENT);
    }

    public WebElement getBrushPenCleaners() {
        return $(BRUSH_PEN_CLEANERS);
    }

    public boolean checkURLPaintingDrawingPage() {
        return driver.getCurrentUrl().contains("painting_drawing_supplies");
    }

    public WebElement getDropdownDescription() {
        return $(DROPDOWN_DESCRIPTION);
    }

    public boolean checkUrlArtPaper() {
        return driver.getCurrentUrl().contains("sr_nr_n_1");
    }

    public boolean checkUrlBoardsCanvas() {
        return driver.getCurrentUrl().contains("sr_nr_n_2");
    }

    public boolean checkUrlDrawing() {
        return driver.getCurrentUrl().contains("sr_nr_n_3");
    }

    public boolean checkUrlEasels() {
        return driver.getCurrentUrl().contains("sr_nr_n_4");
    }

    public boolean checkUrlPainting() {
        return driver.getCurrentUrl().contains("sr_nr_n_5");
    }

    public boolean checkUrlBrushAndPenCleaners() {
        return driver.getCurrentUrl().contains("sr_nr_n_6");
    }
}
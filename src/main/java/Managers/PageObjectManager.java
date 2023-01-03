package Managers;

import PageObjects.CostCheck;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    private final WebDriver webDriver;
    private CostCheck cc;
    public PageObjectManager(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    public CostCheck getCostCheck() {
        return (cc == null) ? cc = new CostCheck(webDriver) : cc;
    }
}

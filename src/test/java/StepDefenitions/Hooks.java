package StepDefenitions;

import Managers.FileReaderManager;
import Utilities.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class Hooks {

    TestContext testContext;
    WebDriver webDriver;

    public Hooks(TestContext context) {
        testContext = context;
    }

    @Before
    public void setUp() {
        webDriver = testContext.getDriverManager().getDriver();
        webDriver.get(FileReaderManager.getInstance().getConfigFileReader().getUrl());
        webDriver.manage().window().maximize();
        Actions act = new Actions(webDriver);
        act.sendKeys(Keys.PAGE_DOWN).build().perform();
    }

    @After
    public void tearDown(Scenario scenario) {

        if(scenario.isFailed()) {
            try {
                byte[] screenshot = ((TakesScreenshot)testContext.getDriverManager().getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", "screenshot");
            } catch (WebDriverException noSupportScreenshot) {
                System.err.println(noSupportScreenshot.getMessage());
            }
        }
        testContext.getDriverManager().closeDriver();
    }
}

//    public void tearDown() {
//        testContext.getDriverManager().closeDriver();
//    }
//}

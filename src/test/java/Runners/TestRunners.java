package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                features ="src/test/resources/Features",
                glue ="StepDefenitions",
                tags = "@Acceptance",
                dryRun = false,
                monochrome = true,
                plugin = {
                        "pretty",
                        "json:target/cucumber-reports/advanced-reports/cucumber.json",
                        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
                }
        )

public class TestRunners {
}




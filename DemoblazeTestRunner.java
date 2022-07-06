package tests;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".//Features/AddToCart.feature",
        glue = "stepDefinition",
        //dryRun = false,
        //monochrome = true,
        plugin = {"pretty","html:test-output"}
)
public class DemoblazeTestRunner {
}

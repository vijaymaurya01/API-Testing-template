package api.runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/Microsoft-CE.feature", glue = "api.stepDefinition", plugin = {"pretty","html:target/API_automation_report.html"}, tags = "not @skip")

public class APIRunner {
}

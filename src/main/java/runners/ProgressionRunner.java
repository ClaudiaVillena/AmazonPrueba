package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		format = { "pretty", "html:target/cucumber/html-report","json:target/cucumber/report.json" }, 
		features = {"dataFile/Regression" }, 
		glue = "web.step",
		tags = { "@LOGIN" }
)
public class ProgressionRunner {
}

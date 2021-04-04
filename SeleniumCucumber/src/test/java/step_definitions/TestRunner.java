package step_definitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
// added comments in test runner
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue="step_definitions",
monochrome=true,
plugin={"pretty","html:target/HtmlReports/HtmlReports.html"},
tags= "@SmokeTest"
		)
public class TestRunner {

}
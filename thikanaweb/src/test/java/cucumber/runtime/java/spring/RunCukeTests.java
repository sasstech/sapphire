package cucumber.runtime.java.spring;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(format = {"html:target/cucumber-html-report.html", "json:target/cucumber-json-report.json"})
public class RunCukeTests {
}

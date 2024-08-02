package Steps;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/Features",
    glue = "Steps",
    monochrome = true,
    plugin = {"pretty", "html:target/HtmlReports"}
)
public class TestRun {
    static {
        System.out.println("Running Cucumber tests...");
    }
}

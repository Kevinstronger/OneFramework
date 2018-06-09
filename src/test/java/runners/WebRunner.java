package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import framework.core.DriverManager;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import stepDefs.Hooks;

import java.sql.Driver;

@CucumberOptions(features = {"src/test/java/features"},
        glue = "stepDefs",
        tags = {"@web", "~@ignore"},
        format = {"pretty", "html:target/cucumber"})
@RunWith(Cucumber.class)
public class WebRunner extends Hooks {

}
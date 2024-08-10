package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src\\test\\resources\\features",
        glue="stepdefinitions",
        tags ="@smoke or @smoke1 or @search1 or @search2 or @search3 or @search4 or @search5 or @search6 or @search7",
        plugin = {
                "html:target/cucumber-reports.html",
                "json:target/json-reports.json",
                "junit:target/xml-report/cucumber.xml"
        },
        dryRun = false

)

public class Runner {

}

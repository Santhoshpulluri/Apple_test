package Test1.Test1;



import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "s",
        monochrome = true,
		tags = {"@W"},
		glue = {"stepDefinitions"},
        plugin =    {
        		"html:target/cucumber-html-report",
                "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
                "usage:target/cucumber-usage.json",
                "junit:target/cucumber-results.xml"}
        )

public class TestRunner  {

	

}

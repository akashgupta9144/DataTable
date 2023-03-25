package Test.Shopping.Website.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:Features", 
		glue = "Test.Shopping.Website.Stepdefs", 
		tags = "@footer", 
		plugin = { "pretty",
		"html:target/html/htmlreport.html",
		"json:target/json/file.json", },
		monochrome = true,
		publish = true,
		dryRun = false

		
		)




public class TestRunner {

}

package TestCaseRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions
(
		features="C:\\Users\\HP\\Selenium\\BDDAssignment\\Features\\register.feature",
		glue="stepDefination",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","html:test-output"}
		
)

public class Testreg {
	
	
}

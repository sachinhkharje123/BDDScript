package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features={".//FeatureFiles/TC0001_Compose a new email.feature",
				  ".//FeatureFiles/TC0002_Fill in recipient email address.feature",
				  ".//FeatureFiles/TC0003_Fill subject line.feature",
				  ".//FeatureFiles/TC0004_Fill Email Body.feature",
				  ".//FeatureFiles/TC0005_Send email.feature",
				  ".//FeatureFiles/TC0006_Missing recipient email address.feature",
				  ".//FeatureFiles/TC0007_Invalid recipient email address.feature",
				  ".//FeatureFiles/TC0008_Valid recipient email address with empty Subject Line.feature"
				  },
		glue="StepDefinition",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","html:target/html/"}
)

public class Runner                 
{       
	//This is Always Empty.
}
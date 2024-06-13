package RunnerPackage;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import BasePackage.BaseClassdomo;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\Feature\\Login.feature",glue = "StepDefPackage")

public class RunnerClassLuma extends BaseClassdomo {
	@BeforeClass 
	public static void First() {
		BrowserLanuch();
		
			
	}

	
	
	

}

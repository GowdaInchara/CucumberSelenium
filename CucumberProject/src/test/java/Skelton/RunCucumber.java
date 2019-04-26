package Skelton;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","html:src/cucumber-reports","json:src/cucumber-reports/reports.json"},
features= "src/test/resources/Skelton/DemoWorkShop.feature",monochrome=true,dryRun=false)
public class RunCucumber {

}

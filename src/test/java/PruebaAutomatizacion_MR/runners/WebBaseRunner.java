package PruebaAutomatizacion_MR.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import PruebaAutomatizacion_MR.steps.Hooks;

@RunWith(Cucumber.class)
@CucumberOptions(glue = {"steps"},
        features = "src/test/Features",
        plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
                ,"json:results/cucumber.json"
                ,"junit:results/cucumber.xml"},
        tags = "@CP_1",
        monochrome = true)

public class WebBaseRunner extends Hooks {

}
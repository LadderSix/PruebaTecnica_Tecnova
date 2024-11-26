package PruebaAutomatizacion_MR.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import PruebaAutomatizacion_MR.steps.Hooks;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"steps"},
        features = "src/test/resources/Features",
        plugin = {"io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"})

public class WebBaseRunner extends Hooks {

}
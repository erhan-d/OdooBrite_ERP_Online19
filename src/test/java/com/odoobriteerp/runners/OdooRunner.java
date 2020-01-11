package com.odoobriteerp.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/vytrack/step_definitions",
        dryRun = false,
        tags = "@store_manager",
        plugin = {"html:target/default-cucumber-reports",
                "json:target/cucumber.json"
        }
)
public class OdooRunner {


}

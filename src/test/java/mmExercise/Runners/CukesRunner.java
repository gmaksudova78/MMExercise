package mmExercise.Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {
                    "html:target/default-cucumber-reports",
                    "json:target/cucumber.json"
            },
            features = "src/test/resources/feature",
            glue = "mmExercise/stepDefinition",
            tags = "@wip",
            dryRun = true // will change to false after test generated in stepDef file

    )
    public class CukesRunner {


    }



package com.cydeo.centrilli.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                //"pretty",
                "json:target/cucumber.json",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",

                //"me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "json:target/cucumber.json",


        },

        features = "src/test/resources/features",
        glue = "com/cydeo/centrilli/step_definitions",

        dryRun = false,
        tags = "@smoke"


)
public class CukesRunner {
}

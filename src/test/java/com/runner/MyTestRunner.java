package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/features"},
		glue = {"com.stepDefinitions", "com.hooks"},
		plugin = {"pretty","html:target/cucumberReport/report.html"}
		)
public class MyTestRunner {

}

package com.OrangeHRM.Runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

//import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src/test/resources/features",
			glue = {"com/OrangeHRM/stepDefinitions"},
			plugin = {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
			monochrome = true,
			strict = true,
			dryRun = false
			)
		
	public class TestRunner {
	
	
}
 
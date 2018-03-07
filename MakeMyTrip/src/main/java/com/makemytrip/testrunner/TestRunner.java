package com.makemytrip.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\sai\\git\\.git\\MakeMyTrip\\src\\main\\java\\com\\makemytrip\\feature\\loginpage.feature",
                 glue="com.makemytrip.stepdefinition",
                 format={"pretty","json:test-output","junit:junit-output"},
                 dryRun=false,
                 monochrome=true,
                 strict=true
                 
                 
		
		)



public class TestRunner {

}

package com.mybddtestproject.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io. Cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "scr/test/resources/features"
		
		)
public class Mybdd {

}

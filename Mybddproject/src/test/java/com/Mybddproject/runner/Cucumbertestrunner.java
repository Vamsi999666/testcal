package com.Mybddproject.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "scr/test/resource/feature"
		)

public class Cucumbertestrunner {

}

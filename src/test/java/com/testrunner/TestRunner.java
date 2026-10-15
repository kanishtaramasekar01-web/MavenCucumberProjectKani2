package com.testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\kanis\\OneDrive\\Documents\\Custom Office Templates\\MavenCucumberProjectKani2\\src\\test\\resources\\Features\\login.feature",glue= {"com.step","com.hook"})
public class TestRunner {

}

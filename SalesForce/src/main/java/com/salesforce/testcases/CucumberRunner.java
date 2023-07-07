package com.salesforce.testcases;

import com.salesforce.testng.api.base.ProjectSpecificMethods;

import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features="src/main/java/features", glue="com.salesforce.pages", monochrome=true)
public class CucumberRunner extends ProjectSpecificMethods {

}

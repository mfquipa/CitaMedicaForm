package com.katalon.demo.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/completeTheForm.feature",
        glue = "com.katalon.demo.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class runnerForms {
}

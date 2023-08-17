package com.katalon.demo.stepDefinitions;

import com.katalon.demo.steps.ConfirmationStep;
import com.katalon.demo.steps.LoginUserStep;
import com.katalon.demo.steps.MakeAppointmentStep;
import com.katalon.demo.steps.OpenSteps;
import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class bookStepDefinitions {

    @Steps
    OpenSteps openSteps;

    @Steps
    LoginUserStep loginUserStep;

    @Steps
    MakeAppointmentStep makeAppointmentStep;

    @Steps
    ConfirmationStep confirmationStep;

    @Given("the user is on the katalon cure page and clicks on the make appointment button.")
    public void theUserIsOnTheKatalonCurePageAndClicksOnTheMakeAppointmentButton() throws IOException {
        openSteps.openBrowser();
        openSteps.clickMake();
    }

    @When("the user enters with valid credentials and enters")
    public void theUserEntersWithValidCredentialsAndEnters() throws IOException {
        loginUserStep.sendUser();
        loginUserStep.sendPassword();
        loginUserStep.clickLogin();
    }

    @When("the user chooses the options of the form and will book in the button at the end")
    public void theUserChoosesTheOptionsOfTheFormAndWillBookInTheButtonAtTheEnd() throws IOException {
        makeAppointmentStep.clickFacility();
        makeAppointmentStep.clickProgram();
        makeAppointmentStep.chooseDate();
        makeAppointmentStep.btnBook();
    }

    @Then("The user will see the appointment confirmation message with the summary of the form")
    public void theUserWillSeeTheAppointmentConfirmationMessageWithTheSummaryOfTheForm() {
        confirmationStep.confirmationBook();
    }

}

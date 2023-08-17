package com.katalon.demo.steps;

import com.katalon.demo.pageObject.ConfirmationPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class ConfirmationStep {

    ConfirmationPage confirmationPage = new ConfirmationPage();

@Step
    public void confirmationBook(){
    Assert.assertTrue(
            confirmationPage.getDriver().findElement(confirmationPage.getBtnConfirm()).isDisplayed()
    );
}
}

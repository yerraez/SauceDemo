package com.saucedemo.ec.definitions;
import com.saucedemo.ec.steps.SuccessfulLoginStep.SuccessfulLoginStep;
import com.saucedemo.ec.steps.validations.ValidationOrderStep;
import com.saucedemo.ec.utilities.urlWebsite.Website;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import net.serenitybdd.annotations.Steps;

public class CompleteOrder {
    @Steps(shared = true)
    SuccessfulLoginStep completeOrder;

    @Steps(shared = true)
    ValidationOrderStep validate;

    @Given("the user complete the sales form information")
    public void userCompleteFormFilds(){
        completeOrder.enterfirstName("Yessenia");
        completeOrder.enterlastName("Erraez");
        completeOrder.enterPostalCode("110789");
    }
    @When("the user press continue button and finish button")
    public void userFinishOrder(){
        completeOrder.clickbtnContinue();
        completeOrder.clickbtnFinish();
    }

    @Then("the user see the successful confirmation message")
    public void confirSuccedOrder(){
        Assert.assertTrue(validate.successMessageIsVisible());
    }


}

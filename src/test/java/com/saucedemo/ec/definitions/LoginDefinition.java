package com.saucedemo.ec.definitions;

import com.saucedemo.ec.steps.SuccessfulLoginStep.SuccessfulLoginStep;
import com.saucedemo.ec.steps.validations.ValidationStep;
import com.saucedemo.ec.utilities.urlWebsite.Website;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import net.serenitybdd.annotations.Steps;

public class LoginDefinition {
    @Steps(shared = true)
    Website url;

    @Steps(shared = true)
    SuccessfulLoginStep login;

    @Steps(shared = true)
    ValidationStep validate;


    @Given("the user go to the website")
    public void userNavigateTo(){
        url.navigateTo("https://www.saucedemo.com/");
    }
    @When("the user enter a valid username and password")
    public void userLoginWithCorrectCredentials(){
        login.enterUsername("standard_user");
        login.enterPassword("secret_sauce");
        login.clickBtnLogin();
    }
    @Then("the user enter to the website")
    public void showProductsPage(){
        Assert.assertTrue(validate.titleIsVisible());
    }

}

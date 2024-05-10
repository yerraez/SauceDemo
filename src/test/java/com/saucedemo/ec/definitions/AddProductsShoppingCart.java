package com.saucedemo.ec.definitions;
import com.saucedemo.ec.steps.SuccessfulLoginStep.SuccessfulLoginStep;
import com.saucedemo.ec.steps.validations.ValidationStep;
import com.saucedemo.ec.utilities.urlWebsite.Website;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import net.serenitybdd.annotations.Steps;

public class AddProductsShoppingCart {
    @Steps(shared = true)
    SuccessfulLoginStep shop;

    @Given("the user select two products")
    public void addProducts() {
        shop.clickBtnAddBackpack();
        shop.clickBtnAddBike();
    }
    @When("the user press the shop car button")
    public void clickShopCart() {
        shop.clickBtnShoppingCart();
    }
    @Then("the user press checkout button")
    public void clickCheckoutButton(){
        shop.clickBtnCheckout();
    }

}

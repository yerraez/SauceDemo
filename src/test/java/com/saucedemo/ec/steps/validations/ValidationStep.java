package com.saucedemo.ec.steps.validations;

import com.saucedemo.ec.pages.validations.ValidationSuccessfulPage;

import net.serenitybdd.annotations.Step;

public class ValidationStep  extends ValidationSuccessfulPage {

    @Step("Validate products page title")
    public Boolean titleIsVisible(){
        return title_product.isDisplayed();
    }




}

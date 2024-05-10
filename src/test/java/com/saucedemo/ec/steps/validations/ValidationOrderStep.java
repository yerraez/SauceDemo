package com.saucedemo.ec.steps.validations;
import com.saucedemo.ec.pages.validations.ValidationSuccessfulOrder;
import net.serenitybdd.annotations.Step;

public class ValidationOrderStep extends ValidationSuccessfulOrder{

    @Step("Validate successful order")

    public Boolean successMessageIsVisible(){
        return successfulMessage.isDisplayed();
    }
}

package com.saucedemo.ec.steps.SuccessfulLoginStep;

import com.saucedemo.ec.pages.finders.SuccessfulLoginFinders;
import net.serenitybdd.annotations.Step;

public class SuccessfulLoginStep extends SuccessfulLoginFinders {
    @Step("Enter username")
    public void enterUsername(String username){
        txtUsername.sendKeys(username);
    }
    @Step("Enter password")
    public void enterPassword(String password){
        txtPassword.sendKeys(password);
    }
    @Step("Enter to the login button")
    public void clickBtnLogin(){
        btnLogin.click();
    }

    @Step("Add a Sauce Labs Backpack to the cart")
    public void clickBtnAddBackpack(){
        btnAddSauceLabsBackpack.click();
    }

    @Step("Add a Sauce Labs Bike to the cart")
    public void clickBtnAddBike(){
        btnAddSauceLabsBike.click();
    }

    @Step("Verify the shopping cart")
    public void clickBtnShoppingCart(){ iconShoppingCart.click();
    }

    @Step("Press Checkout button")
    public void clickBtnCheckout(){ btnCheckout.click();
    }
    @Step("Enter firstName")
    public void enterfirstName(String firstName){
        txtfirstName.sendKeys(firstName);
    }

    @Step("Enter lastName")
    public void enterlastName(String lastName){
        txtlastName.sendKeys(lastName);
    }

    @Step("Enter zip")
    public void enterPostalCode(String postalCode){
        txtpostalCode.sendKeys(postalCode);
    }

    @Step("Press Continue button")
    public void clickbtnContinue(){ btnContinue.click();
    }
    @Step("Press Finish button")
    public void clickbtnFinish(){ btnFinish.click();
    }

}

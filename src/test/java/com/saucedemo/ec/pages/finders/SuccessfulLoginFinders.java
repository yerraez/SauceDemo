package com.saucedemo.ec.pages.finders;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
public class SuccessfulLoginFinders extends PageObject {

    @FindBy(id = "user-name")
    protected WebElementFacade txtUsername;

    @FindBy(id ="password")
    protected WebElementFacade txtPassword;

    @FindBy(id="login-button")
    protected WebElementFacade btnLogin;

    @FindBy(id="add-to-cart-sauce-labs-backpack")
    protected WebElementFacade btnAddSauceLabsBackpack;

    @FindBy(id="add-to-cart-sauce-labs-bike-light")
    protected WebElementFacade btnAddSauceLabsBike;

    @FindBy(className = "shopping_cart_badge")
    protected  WebElementFacade iconShoppingCart;

    @FindBy(id = "checkout")
    protected  WebElementFacade btnCheckout;

    @FindBy(id = "first-name")
    protected  WebElementFacade txtfirstName;

    @FindBy(id = "last-name")
    protected  WebElementFacade txtlastName;

    @FindBy (id = "postal-code")
    protected WebElementFacade txtpostalCode;

    @FindBy (id = "continue")
    protected  WebElementFacade btnContinue;

    @FindBy (id = "finish")
    protected  WebElementFacade btnFinish;





}

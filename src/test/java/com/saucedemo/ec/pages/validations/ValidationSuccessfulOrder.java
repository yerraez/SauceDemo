package com.saucedemo.ec.pages.validations;

import net.thucydides.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ValidationSuccessfulOrder extends PageObject {
    @FindBy(xpath = "//div[@id='checkout_complete_container']")
    protected WebElementFacade successfulMessage;
}

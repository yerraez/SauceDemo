package com.saucedemo.ec.pages.validations;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class ValidationSuccessfulPage extends PageObject {

    @FindBy(xpath = "//span[@class='title']")
    protected WebElementFacade title_product;
}

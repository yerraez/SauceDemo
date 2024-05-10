package com.saucedemo.ec;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/saucedemo/ec/definitions"
      //  tags = "@SuccessfulLogin"
)

public class Runner {
}

package stepdefinitions;

import io.cucumber.java.en.*;
import pages.RegisterPage;
import utilities.DriverFactory;

public class RegisterSteps {

    RegisterPage register = new RegisterPage(DriverFactory.getDriver());

    @Given("user clicks register")
    public void openRegister(){

        register.clickRegister();

    }

    @When("user enters registration details")
    public void enterDetails(){

        register.enterFirstName("John");
        register.enterLastName("Doe");
        register.enterEmail("john123@test.com");
        register.enterPassword("123456");
        register.enterConfirmPassword("123456");

    }

    @And("user submits registration")
    public void submitRegister(){

        register.clickRegisterButton();

    }

}
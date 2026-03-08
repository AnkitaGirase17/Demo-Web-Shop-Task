package stepdefinitions;

import io.cucumber.java.en.*;
import pages.LoginPage;
import utilities.DriverFactory;

public class LoginSteps {

    LoginPage login = new LoginPage(DriverFactory.getDriver());

    @Given("user clicks login link")
    public void clickLogin(){

        login.clickLoginLink();

    }

    @When("user enters valid email and password")
    public void enterCredentials(){

        login.enterEmail("test@test.com");
        login.enterPassword("123456");

    }

    @And("user clicks login button")
    public void loginButton(){

        login.clickLoginButton();

    }

}
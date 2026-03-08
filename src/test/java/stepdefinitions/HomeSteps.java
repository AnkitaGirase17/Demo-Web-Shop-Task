package stepdefinitions;

import io.cucumber.java.en.*;
import pages.HomePage;
import utilities.DriverFactory;

public class HomeSteps {

    HomePage home = new HomePage(DriverFactory.getDriver());

    @Given("user launches website")
    public void openSite(){

        home.openWebsite();

    }

    @Then("verify homepage categories")
    public void verifyCategories(){

        home.verifyBooksCategory();
        home.verifyElectronicsCategory();
        home.verifyApparelCategory();

    }
}
package stepdefinitions;

import io.cucumber.java.en.*;
import pages.SearchPage;
import utilities.DriverFactory;

public class SearchSteps {

    SearchPage search = new SearchPage(DriverFactory.getDriver());

    @When("user searches product")
    public void searchProduct(){

        search.enterProductName("Laptop");
        search.clickSearch();

    }
}
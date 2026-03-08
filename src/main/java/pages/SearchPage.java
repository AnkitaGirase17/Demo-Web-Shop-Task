package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {

    WebDriver driver;

    public SearchPage(WebDriver driver){
        this.driver = driver;
    }

    By searchBox = By.id("small-searchterms");
    By searchButton = By.cssSelector("input[value='Search']");

    public void enterProductName(String product){
        driver.findElement(searchBox).sendKeys(product);
    }

    public void clickSearch(){
        driver.findElement(searchButton).click();
    }

}
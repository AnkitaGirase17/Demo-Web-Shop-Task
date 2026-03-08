package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    By books = By.linkText("Books");
    By electronics = By.linkText("Electronics");
    By apparel = By.linkText("Apparel & Shoes");

    public void openWebsite(){
        driver.get("https://demowebshop.tricentis.com/");
    }

    public boolean verifyBooksCategory(){
        return driver.findElement(books).isDisplayed();
    }

    public boolean verifyElectronicsCategory(){
        return driver.findElement(electronics).isDisplayed();
    }

    public boolean verifyApparelCategory(){
        return driver.findElement(apparel).isDisplayed();
    }

}
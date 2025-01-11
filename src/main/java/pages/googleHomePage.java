package pages;

 /*
   - This class is Page Object Model.
    Page Object Model : It is a concept means centralizing all the web elements locators and their actions
    so that we can reuse the locators and action on the web element to make the
    framework easy to maintain.
    - Webdriver : for all actions to perform like clicking search button, we need WebDriver.
    - constructor : method same as class name and doesn't have return type

     */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class googleHomePage {

    // global webdriver
    WebDriver driver;

    public googleHomePage(WebDriver dr){  // constructor
        driver = dr; // dr is local webdriver
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "APjFqb")
    WebElement searchbar;

    @FindBy(name = "btnK")
    WebElement searchButton;

    @FindBy(className = "YmvwI")
    WebElement allTab;

    public void enterProductName(String productName){
        searchbar.sendKeys(productName);
    }

    public void clickingOnSearchButton(){
        searchButton.click();
    }

    public boolean isAllTabDisplayed(){
        return allTab.isDisplayed();
    }




}

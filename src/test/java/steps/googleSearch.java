package steps;

import common.googleBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.googleHomePage;

import java.util.concurrent.TimeUnit;

public class googleSearch extends googleBase {  // extends is for inheritance.
  // creating my first PR and merging it

    //public WebDriver driver;

    @Given("I am on the google homepage")
    public void i_am_on_the_google_homepage() {

        launchBrowser();

        // setting up browser.
//        WebDriverManager.chromedriver().setup(); // chromedriver() is a method
//
//        driver = new ChromeDriver(); // this ChromeDrier() is a class
//
//        driver.get("https://www.google.com/"); // get() method to navigate to the specified url.
//
//        driver.manage().window().maximize(); // to maximize window
//
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


    }


    @When("I enter the {string} in the search bar")
    public void i_enter_the_in_the_search_bar(String product_name) {

        googleHomePage gp = new googleHomePage(driver);
        gp.enterProductName(product_name);

    }


    @When("I click the search button")
    public void i_click_the_search_button() {

        googleHomePage gp = new googleHomePage(driver);
        gp.clickingOnSearchButton();

    }


    @Then("I can see the search result successfully.")
    public void i_can_see_the_search_result_successfully() {

        googleHomePage gp = new googleHomePage(driver);

        Assert.assertTrue(gp.isAllTabDisplayed());

        closeCurrent();
        closeAll();

    }



}

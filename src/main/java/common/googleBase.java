package common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class googleBase {

    // WebDriver exists in Selenium library
    // WebDriver is an interface to call each methods eg. open the url in the browser
    public WebDriver driver;

    public void launchBrowser(){

        WebDriverManager.chromedriver().setup(); // chromedriver() is a method

        driver = new ChromeDriver(); // this ChromeDrier() is a class

        driver.get("https://www.google.com/"); // get() method to navigate to the specified url.

        driver.manage().window().maximize(); // to maximize window

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void closeCurrent(){

        driver.close();
    }

    public void closeAll(){

        driver.quit();

    }
}

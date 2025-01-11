package AdvanceSelenium;

import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class mouseHover {

    public static void main(String[] args){

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/hovers");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement img3 = driver.findElement(By.xpath("(//img[@alt=\"User Avatar\"])[3]"));

        Actions act = new Actions(driver);

        act.moveToElement(img3).build().perform();

        WebElement text3 = driver.findElement(By.xpath("(//div[@class='figcaption'])[3]/h5"));

        WebElement link3 = driver.findElement(By.xpath("(//div[@class='figcaption'])[3]/a"));

        Assert.assertEquals(text3.getText(),"name: user3");
        Assert.assertTrue(link3.isEnabled());


    }
}

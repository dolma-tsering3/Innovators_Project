package AdvanceSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class dragAndDrop {

    public static void main(String[] args){

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/drag_and_drop");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

      WebElement colA = driver.findElement(By.xpath("//div[@id='column-a']"));

      WebElement colB = driver.findElement(By.xpath("//div[@id='column-b']"));

        Actions act = new Actions(driver);

        act.dragAndDrop(colA,colB).build().perform();

        act.dragAndDropBy(colA,200,100).build().perform();


    }
}

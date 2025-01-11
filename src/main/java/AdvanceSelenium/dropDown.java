package AdvanceSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class dropDown {


    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/dropdown");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement dropDown = driver.findElement(By.xpath("//select[@id='dropdown']"));

        Select s =new Select(dropDown);
        s.selectByIndex(2);
        Thread.sleep(500);
        s.selectByValue("1");
        Thread.sleep(500);
        s.selectByVisibleText("Option 2");
        Thread.sleep(500);
        //s.deselectByIndex(2);

        List<WebElement> allItems = s.getOptions();

        for (int i = 0; i < allItems.size(); i++){
            System.out.println( allItems.get(i).getText());
        }
        driver.quit(); // the browser  stays open so to close we do driver.quit();
    }
}

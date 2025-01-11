package AdvanceSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class checkBox {

    public static  void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://the-internet.herokuapp.com/checkboxes");
        driver.manage().window().maximize();

        WebElement chk1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));

        WebElement chk2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));

        if( !chk1.isSelected()){
            chk1.click();
        }

        if( chk2.isSelected()){
            chk2.click();
        }



    }
}

package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hooks {

   public static WebDriver driver;
    @Before

    public void openBrowser() {
        //1- Define bridge between java code and Browser بعرف المترجم الاول
        System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");

        //2- initialize the new object   لازم
        driver = new ChromeDriver();

        //3- driver configuration
        //3.1- maximize window
        driver.manage().window().maximize();
        //3.2- set implict wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //4-navigate to the website

        driver.navigate().to("https://demo.nopcommerce.com/");
    }


    @After
    public void userQuitDriver() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
    }
}

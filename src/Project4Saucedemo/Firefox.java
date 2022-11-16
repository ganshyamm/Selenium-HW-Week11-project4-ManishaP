package Project4Saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Firefox {
    public static void main(String[] args) {
        String baseurl = "https://www.saucedemo.com/ ";
        System.setProperty("webdriver.gheko.driver", "driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        //launce url
        driver.get(baseurl);

        //get tittle of loaded page
        System.out.println("page tittle is :  +tittle");

        //get current Url
        System.out.println("Current url is: " + driver.getCurrentUrl());

        //Find email field element
        WebElement emailFilled = driver.findElement(By.name("username"));
        emailFilled.sendKeys("manisha-p");

        //Find password field element
        WebElement passwordfilled = driver.findElement(By.name("password"));
        passwordfilled.sendKeys("password123");

        driver.quit();


    }
}


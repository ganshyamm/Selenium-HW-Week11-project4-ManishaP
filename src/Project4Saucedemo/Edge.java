package Project4Saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {
    public static void main(String[] args) {
        String baseurl = "https://www.saucedemo.com/";
        System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        //get url
        driver.get(baseurl);
        // get the tittle of the page
        String tittle = driver.getTitle();
        System.out.println("page tittle is :" +driver.getTitle());

        //get current url
        System.out.println("current url :" +driver.getCurrentUrl());

        //find the email field element
        WebElement emailfield = driver.findElement(By.id("user-name"));
        emailfield.sendKeys("manisha-p");

        //find the password field element
        WebElement passwordfield = driver.findElement(By.id("password"));
        passwordfield.sendKeys("password123");

        //closing
        driver.quit();


    }
}


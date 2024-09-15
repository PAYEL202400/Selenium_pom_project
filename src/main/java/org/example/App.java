package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        //WebDriver driver = new ChromeDriver();
      
        //driver.get("https://rahulshettyacademy.com/");
        //System.out.println(driver.getTitle());
        //System.out.println(driver.getCurrentUrl());
        //driver.close();
        //driver.quit();
        
        //firefox
        //gecko driver--> webdriver.gecko.driver
        //System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Downloads\\geckodriver-v0.35.0-win64");
        //WebDriver driver = new FirefoxDriver();
        
        //Microoft edge
        //microsoft edge driver---> webdriver.edge.driver
        WebDriver driver = new EdgeDriver();
        driver.get("https://rahulshettyacademy.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();
    }
}

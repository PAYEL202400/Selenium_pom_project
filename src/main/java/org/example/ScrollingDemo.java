package org.example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollingDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//scroll the entire window
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		//scroll inside a table vertically
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		//how to handle table girds and get the sum of the values
		List<WebElement> values= driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum=0;
		for(int i=0; i>values.size();i++)
		{
			sum= sum + Integer.parseInt(values.get(i).getText());
			
		}
		System.out.println(sum);
		//parsing string and comparing it with generated sum value
		driver.findElement(By.cssSelector(".totalAmount")).getText();
		int total= Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		
		Assert.assertEquals(sum, total);
	}

}

package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		
		//How we can use actions class to perform mouseover and keyboard interactions 
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		//creating an action class
		Actions a = new Actions(driver);
		
		WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		//steps to write hello in caps in search bar automatically and double click on it to select
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		//moves to specific element and right click on that specific element
		a.moveToElement(move).contextClick().build().perform();

	}

}

package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
		
		//frame techniques using selenium webdriver
		WebDriver driver = new ChromeDriver();
		// how to maximize screen
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		//to find number of frames are there in a webpage
		System.out.println(driver.findElements(By.tagName("iframe")).size()); 
		//switch to frames using index
		driver.switchTo().frame(0);
		
		//how we can switch to frames in a webpage by using web element
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		//driver.findElement(By.id("draggable")).click();
		
	//how to drag and drop using Actions class
		Actions a = new Actions(driver);
		WebElement source= driver.findElement(By.id("draggable"));
		WebElement target= driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		
		//how to switch back from frames to the normal webpage
		driver.switchTo().defaultContent();
	}

}

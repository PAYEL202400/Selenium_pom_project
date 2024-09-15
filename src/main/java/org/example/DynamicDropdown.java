package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//chennai xpath- //a[@value='MAA']
		// chennai xpath- //a[@value='MAA'])[2]
		//dynamic dropdown by using index
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//driver.findElement(By.xpath("//a[@value='BLR']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		//Parent to child relationship by xpath
		// //div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//a[@value='BLR']
		// //div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//a[@value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
		
		//handling calender UI with fixed date
		//ui-state-default ui-state-highlight ui-state-active
		driver.findElement(By.className("ui-state-default.ui-state-highlight.ui-state-active")).click();
	}

}

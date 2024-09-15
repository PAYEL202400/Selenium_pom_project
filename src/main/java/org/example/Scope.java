package org.example;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Scope {

	public static void main(String[] args) throws InterruptedException {
		//how to find how many links are there in total and their count
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//for any webpage having link there will one tag as 'a' which is anchor
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//how to limit your scope and find the count of links in footer section
		WebElement footerdriver= driver.findElement(By.id("gf-BIG")); // limiting webdriver scope
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//how to find the count of links from the first section of footer
		WebElement columndriver= footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		//click on all the links and check whether pages are opening
		for ( int i=1; i<columndriver.findElements(By.tagName("a")).size(); i++)
		{
			
			//the below systax will click control and hit enter to open the links in new tab
			String clicktolinktab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clicktolinktab);
			Thread.sleep(5000L);
		}//opens all the tabs
		
		//iterators to all sections and gets the title
			Set<String> abc=driver.getWindowHandles();
			Iterator<String> itr = abc.iterator();
			while(itr.hasNext()) {
				driver.switchTo().window(itr.next());
				System.out.println(driver.getTitle());
			}
		}

	}



package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Updateddropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//using assertions
		Assert.assertFalse(driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).isSelected());
		Assert.assertFalse(false);
		
		//handling checkbox using selenium
		//System.out.println(driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).isSelected());
		driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).click();
		System.out.println(driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).isSelected());
		Assert.assertTrue(driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).isSelected());
		
		//count the number of checkboxes
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.println("its enabled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		Thread.sleep(2000);
		
		int i=1;
		while(i<5)
		{
		 driver.findElement(By.id("hrefIncAdt")).click();
		 i++;
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		

	}

}

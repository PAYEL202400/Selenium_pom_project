package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// System.out.println(driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).isSelected());
		driver.findElement(By.name("checkBoxOption1")).click();
		System.out.println(driver.findElement(By.name("checkBoxOption1")).isSelected());
		Assert.assertTrue(driver.findElement(By.name("checkBoxOption1")).isSelected());

		// count the number of checkboxes

		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	}

}

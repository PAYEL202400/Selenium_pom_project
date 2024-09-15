package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Greenkart {

	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		//using implicit wait
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//explicit wait
		//for explicit wait we need to create an object of webdriver wait class
		//we need to pass two arguments inside the object one is driver and other is no of seconds
		//WebDriverWait w =new WebDriverWait(driver,5);
		
		
		//implicit pros and cons
		//readable code--pros
		//hiding performance issues--cons
        //expected array
		//sending array of products to cart for checkout
		String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot","Carrot","Tomato"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		addItems(driver,itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();

		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		//explicit wait
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		//explicit wait pros and cons
		//it is applied only for targeted elements, so no performance issues
		//more code it is not coinsized
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
	}


		
	public static void addItems(WebDriver driver, String[] itemsNeeded)	
	{
		int j=0;
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0; i<products.size(); i++)
		{
			//brocolli - 1kg
			
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			//format it to get the actual vegetable name
			//check whether the name you extracted is present or not
			//converting array to arraylist for easy search
			List itemsNeededlist = Arrays.asList(itemsNeeded);
			if(itemsNeededlist.contains(formattedName))
			{
				j++;
				//click on 'ADD TO CART'
			  driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if(j==itemsNeeded.length)
				{
					break;
				}
			}
		}
	}
}



	

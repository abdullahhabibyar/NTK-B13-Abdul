package demoHWS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exersice extends Hooks{
	
	public static void main (String args[]) throws InterruptedException {
		
		
	
		
		
		setUp("edge");
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		WebElement usernameField = driver.findElement(By.name("username"));	
		
		usernameField.sendKeys("admin");
		Thread.sleep(2000);
		
		WebElement passwordField = driver.findElement(By.name("password"));	
		
		passwordField.sendKeys("admin123");
		Thread.sleep(2000);
		
		WebElement loginButton = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		 
		loginButton.click();
		Thread.sleep(2000);
		
		WebElement HearderField = driver.findElement(By.className("oxd-topbar-header-breadcrumb")) 	;	
	    HearderField.click();
	    Thread.sleep(2000);

		
		tearDown();
	}

	
	
		
	}



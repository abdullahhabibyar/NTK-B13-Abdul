package demoHWS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.Hooks;

public class Exercise2Day2 extends Hooks{
	
	
	public static void main (String args []) throws InterruptedException {
		
		
		
		setUp("edge");
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
		Thread.sleep(2000);
	WebElement LogainButton = driver.findElement(By.linkText("REGISTER"));
	
	LogainButton.click();
	Thread.sleep(2000);
	
	
	//Number4
	
	String title = driver.getTitle();
	if(title.contains(" Mercury Tours"))
		
	{System.out.println(title);
	}else {
		
		System.out.println("title not find");
		
	}
	Thread.sleep(2000);
	
	// number 5
	WebElement firstname = driver.findElement(By.name("firstName"));
	firstname.sendKeys("Abdul");
	Thread.sleep(2000);
	
	// number 6
	WebElement lastname = driver.findElement(By.name("lastName"));
	
	lastname.sendKeys("habib");
	Thread.sleep(2000);
	
	// number 7
	WebElement phonenumber = driver.findElement(By.name("phone"));
	phonenumber.sendKeys("2024459685");
	Thread.sleep(2000);
	
	
	// number 8
	WebElement emailadress = driver.findElement(By.id("userName"));
	emailadress.sendKeys("abdullahhabibyar2@gmail.com");
	Thread.sleep(2000);
	
	// number9 
		WebElement address = driver.findElement(By.name("address1"));
		address.sendKeys("2123 tyson");
		Thread.sleep(2000);
		
		// number10
		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("Vianna");
		Thread.sleep(2000);
	
		
		// number11
		WebElement state = driver.findElement(By.name("state"));
		state.sendKeys("VA");
		Thread.sleep(2000);
	
		// number12
		WebElement zipcode = driver.findElement(By.name("postalCode"));
		zipcode.sendKeys("22184");
		Thread.sleep(2000);
	
		// number13
		WebElement country= driver.findElement(By.name("country")); 
		Select selectobj = new Select(country);
		 selectobj.selectByValue("UNITED STATES");
		Thread.sleep(2000);
		
		// number14
				WebElement username = driver.findElement(By.id("email"));
				username.sendKeys("abdul2");
				Thread.sleep(2000);
		
	// number15
	WebElement password = driver.findElement(By.name("password"));
	password.sendKeys("Abdul3");
    Thread.sleep(2000);
	
    
	// number16
	WebElement confirmpassword = driver.findElement(By.name("confirmPassword"));
	confirmpassword.sendKeys("Abdul3");
    Thread.sleep(2000);
	
 // number17
 	WebElement submit = driver.findElement(By.name("submit"));
submit.click();
     Thread.sleep(2000);
     
     
     // number18
  	WebElement confirmationmassege = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font"));
  	String textcheck = confirmationmassege.getText();
  	if(textcheck.contains("Thank you for registering."))
  	{System.out.println("TESTCASE PASSED");
  	}else {
  		System.out.println("TESTCASE FAILED");
  	}

     
     
	
	
	
	
		
		
	
		
		
		
		
		
		
		tearDown();
		
	}

}

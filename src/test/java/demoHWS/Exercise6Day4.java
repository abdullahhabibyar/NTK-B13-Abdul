package demoHWS;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exercise6Day4 extends Hooks {

	public static void main(String args[]) throws InterruptedException {
		
// 1. seu up enviernment
		setUp("edge");

		//2. Navigate to the URl
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		
		//3.Verify the page title is Alerts:
		String pageTitle = driver.getTitle();
		
		System.out.println(pageTitle);
		
		// sleep for 2 Second
		Thread.sleep(2000);
		
		// 4. click Alert with texBox
		WebElement alertTextBox = driver.findElement(By.xpath("//a[href='#Textbox']"));
		alertTextBox.click();
		Thread.sleep(2000);
		
		// 4.a  Click Click the button to demonstrate the prompt box button
		WebElement clickbutton = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		clickbutton.click();
		Thread.sleep(2000);
		
		// 4.b Enter your name in the Alert Text field.
		Alert alert =	driver.switchTo().alert();
		
		// remove the select text,send you name
		alert.sendKeys("");
		alert.sendKeys("Abdul");
		Thread.sleep(2000);
		
		//4 Click Ok button
		alert.accept();
		
		// 4d. Verify the message displayed under Click the button to demonstrate the prompt box/ button contains following phrase: How are you today
		WebElement verifyMessage = driver.findElement(By.xpath("//p[@id='demo1']"));
		String getMessage = verifyMessage.getText();
		if( getMessage.contains("How are you today")) {
			
			System.out.println("yes the message here");
		}else {
			System.out.println("no messsage exest");
			Thread.sleep(2000);
			
			// 5 Refresh the page.
			
			driver.navigate().refresh();
			
			// 6.Click Alert with OK & Cancel
			WebElement alertokCancil = driver.findElement(By.xpath("//a[href='#cancelTab']"));
			alertokCancil.click();
			Thread.sleep(2000);
			
			//6 a.Click Click the button to display a confirm box button
			WebElement displayconfirmationBox= driver.findElement(By.xpath("//button[@class='btn btn-primary']"));

			displayconfirmationBox.click();
			Thread.sleep(2000);
			
			// 6 c. Verify the text in alert contains Press a Button !
			Alert alerte2 = driver.switchTo().alert();
			
			alerte2.getText();
			// .verifay text message
			if(alerte2.getText().contains("Press a Button !")) {
				alerte2.dismiss();
			}else {
				alerte2.accept();
				
			}
			Thread.sleep(2000);
			
			// 6.dVerify the message displayed under Click the button to display a confirm box button contains following phrase: You Pressed
			
			WebElement verifyMessageDisplayed = driver.findElement(By.xpath("//p[@id='demo']"));
			
	          String getMessageDisplayed = verifyMessageDisplayed.getText();
	          
	          if(getMessageDisplayed.contains("you press")) {
	        	  System.out.println("yes it contains the message!");
	          }else {
	        	  System.out.println("no its not");
	        		Thread.sleep(2000);
	        		
	        	
	        		
	        		// close the browser
	      
	        	  
	        	  
	          }
			
			
			
			
			

			
			
			
			
			
		
		
		                                                                            
		
		
		
		
	
		
		
		
		tearDown();
	}

		
	

	
	}

}
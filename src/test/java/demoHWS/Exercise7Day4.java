package demoHWS;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exercise7Day4 extends Hooks {

	public static void main(String args[]) throws InterruptedException {
		// 1.set Up
		setUp("edge");

		// 2. Navigate to the URL
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");

		// 3.Click org.openqa.selenium
		driver.switchTo().frame("packageListFrame");
		WebElement clickElement = driver.findElement(By.linkText("org.openqa.selenium"));
		clickElement.click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);

		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert was present.");
		}
		Thread.sleep(2000);

		// 5. Retrieve the text message and check if the text message equals to
		// Interface Alert
		// a. If it does then print TESTCASE PASSED
		// b. Otherwise print TESTCASE FAILED
		WebElement verifyMessage = driver.findElement(By.xpath("//*[@id=\"all-packages-table\"]/div[2]/div[3]"));
		String getMessage = verifyMessage.getText();
		if (getMessage.contains("Interface Alert")) {
			System.out.println("TESTCASE PASSED");
		} else {
			System.out.println("TESTCASE FAILED");
			Thread.sleep(2000);

			// 6.Under Package section, locate org.openqa.selenium.chrome and click.
			WebElement alertok = driver.findElement(By.xpath("//*[@id=\"all-packages-table\"]/div[2]/div[19]"));
			alertok.click();
			Thread.sleep(2000);

			// 7.Click ChromeDriver
			WebElement Cobj = driver.findElement(By.xpath("//*[@id=\"class-summary.tabpanel\"]/div/div[13]"));
			Cobj.click();
			Thread.sleep(2000);

			// 8. Retrieve the text message and check if the text message equals to Class
			// ChromeDriver
			// a. If it does then print TESTCASE PASSED
			// b. Otherwise print TESTCASE FAILED
		
					WebElement verifyMessageDisplayed = driver.findElement(By.xpath("//*[@id=\"class-summary.tabpanel\"]/div/div[13]"));

			String getMessageDisplayed = verifyMessageDisplayed.getText();

			if (getMessageDisplayed.contains("Class ChromeDriver")) {
				System.out.println("TESTCASE PASSED");
			} else {
				System.out.println("TESTCASE FAILED");
				Thread.sleep(2000);

				tearDown();

			}

		}

	}
}

package demoHWS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.Hooks;
public class Exercise3day2  extends Hooks {
    public static void main(String[] args) throws InterruptedException {
    	 // Launch browser
        setUp("edge");
  

        driver.get("https://demo.nopcommerce.com/");  // Navigate to nopCommerce
        Thread.sleep(2000);

        // Click Register link
        WebElement registerLink = driver.findElement(By.linkText("Register"));
        registerLink.click();
        Thread.sleep(2000);

        // Verify page title
        String title = driver.getTitle();
        if (title.contains("nopCommerce demo store. Register")) {
            System.out.println("Page title verified: " + title);
        } else {
            System.out.println("Title verification FAILED");
        }
        Thread.sleep(2000);

        // *Filling Out "Your Personal Details" Section*  

        // Select Gender
        WebElement genderMale = driver.findElement(By.id("gender-male"));  
        genderMale.click();
        Thread.sleep(1000);

        // Enter First Name
        WebElement firstName = driver.findElement(By.id("FirstName"));
        firstName.sendKeys("Abdullah");
        Thread.sleep(1000);

        // Enter Last Name
        WebElement lastName = driver.findElement(By.id("LastName"));
        lastName.sendKeys("Habib");
        Thread.sleep(1000);

        // Select Date of Birth
        WebElement dayDropdown = driver.findElement(By.name("DateOfBirthDay"));
        Select selectDay = new Select(dayDropdown);
        selectDay.selectByValue("21");
        Thread.sleep(1000);

        WebElement monthDropdown = driver.findElement(By.name("DateOfBirthMonth"));
        Select selectMonth = new Select(monthDropdown);
        selectMonth.selectByValue("20");  // May
        Thread.sleep(1000);

        WebElement yearDropdown = driver.findElement(By.name("DateOfBirthYear"));
        Select selectYear = new Select(yearDropdown);
        selectYear.selectByValue("1995");
        Thread.sleep(1000);

        // Enter Email
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("johndoe123@example.com");
        Thread.sleep(1000);

        // Enter Company Name
        WebElement companyField = driver.findElement(By.id("Company"));
        companyField.sendKeys("Noorteck");
        Thread.sleep(1000);

        // Uncheck Newsletter checkbox
        WebElement newsletterCheckbox = driver.findElement(By.id("Newsletter"));
        if (newsletterCheckbox.isSelected()) {
            newsletterCheckbox.click();
        }
        Thread.sleep(1000);

        // Entering Account Details  

        // Enter Password
        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("T@1234");
        Thread.sleep(1000);

        // Confirm Password
        WebElement confirmPasswordField = driver.findElement(By.id("ConfirmPassword"));
        confirmPasswordField.sendKeys("T@1234");
        Thread.sleep(1000);

        // Click Register button
        WebElement registerButton = driver.findElement(By.id("register-button"));
        registerButton.click();
        Thread.sleep(2000);

        // Retrieve confirmation message
        WebElement confirmationMessage = driver.findElement(By.className("result"));
        String textCheck = confirmationMessage.getText();

        if (textCheck.contains("Your registration completed")) {
            System.out.println("TEST CASE PASSED");
        } else {
            System.out.println("TEST CASE FAILED");
        }

        // Close the browser
        tearDown();
    }

		
	}


		
		
		
		
		
		
		
		
		


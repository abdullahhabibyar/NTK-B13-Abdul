package demoHWS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.Hooks;
import java.util.Arrays;
import java.util.List;

public class DemoDatePickerPractice extends Hooks {

    public static void main(String[] args) throws InterruptedException {

        setUp("edge");

        driver.get("https://jqueryui.com/datepicker/#dropdown-month-year");

        Thread.sleep(2000);

        driver.switchTo().frame(0);

        // List of dates to practice selecting
        List<String[]> dates = Arrays.asList(
                new String[]{"Jan", "1", "2022"},
                new String[]{"Feb", "2", "2023"},
                new String[]{"March", "3", "2024"},
                new String[]{"April", "4", "2025"},
                new String[]{"May", "5", "2026"},
                new String[]{"June", "11", "2027"},
                new String[]{"July", "12", "2028"},
                new String[]{"Aug", "22", "2029"},
                new String[]{"Sep", "29", "2030"}
        );

        // Loop through each date and select it
        for (String[] date : dates) {
            System.out.println("Selecting Date: " + date[0] + " " + date[1] + ", " + date[2]);
            selectDate(date[0], date[1], date[2]);
            // Small delay for visibility
            Thread.sleep(2000); 
        }

        System.out.println("Practice completed. Closing browser.");
        
    }

    public static void selectDate(String month, String day, String year) {
        WebElement dateField = driver.findElement(By.id("datepicker"));
        dateField.click();

        // Select month
        WebElement monthDropdown = driver.findElement(By.xpath("//select[@data-handler='selectMonth']"));
        Select selectMonth = new Select(monthDropdown);
        selectMonth.selectByVisibleText(month);

        // Select year
        WebElement yearDropdown = driver.findElement(By.xpath("//select[@data-handler='selectYear']"));
        Select selectYear = new Select(yearDropdown);
        selectYear.selectByVisibleText(year);

        // Select day
        WebElement dayElement = driver.findElement(By.xpath("//a[text()='" + day + "']"));
        dayElement.click();

        // Print confirmation message
        System.out.println("Successfully selected: " + month + " " + day + ", " +year);
        
        
        tearDown();
        
        
    }
    
}

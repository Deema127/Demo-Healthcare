package day02;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class MakeAppointment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      ChromeDriver driver = new ChromeDriver();
      driver.get("https://katalon-demo-cura.herokuapp.com/");
      driver.manage().window().maximize();
//  	click on make appointment
  		driver.findElement(By.id("btn-make-appointment")).click();
  		
//  	Login
  		driver.findElement(By.id("txt-username")).sendKeys("John Doe");
  		driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
  		driver.findElement(By.id("btn-login")).click();

//     wait for page
  		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

  		WebElement title = wait.until(
  		        ExpectedConditions.visibilityOfElementLocated(By.tagName("h2"))
  		);

  		System.out.println(title.getText());
  		
  		
  		
  		
//       dropDown   
      WebElement selectElement = driver.findElement(By.id("combo_facility"));
      Select dropDown = new Select(selectElement);
      dropDown.selectByValue("Hongkong CURA Healthcare Center");
//      dropDown.selectByValue("Seoul CURA Healthcare Center");
//    checkbox
      driver.findElement(By.className("checkbox-inline")).click();
//    radio button
//      driver.findElement(By.id("radio_program_medicare")).click();
//      driver.findElement(By.id("radio_program_medicaid")).click();
      driver.findElement(By.id("radio_program_none")).click();
//    fill the date
      driver.findElement(By.id("txt_visit_date")).click();
      System.out.println("Select the date manually from the calender");
      Thread.sleep(10000);
           
     //      comment
      driver.findElement(By.id("txt_comment")).sendKeys("This is an automated test appointment.");
        
 //      book appointment
      driver.findElement(By.id("btn-book-appointment")).click();

//     confirmation
      WebElement message = wait.until(
              ExpectedConditions.visibilityOfElementLocated(
                      By.className("lead"))
      );

      System.out.println(message.getText());
//	driver.close();
	}

}

package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		driver.manage().window().maximize();
//	2-click on make appointment
		driver.findElement(By.id("btn-make-appointment")).click();
//		3-fill the username
		driver.findElement(By.id("txt-username")).sendKeys("John Doe");
//		4-fill the password
		driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
//		5-click on login
		driver.findElement(By.id("btn-login")).click();
//		6-close the driver
//		driver.close();
		String title = driver.findElement(By.tagName("h2")).getText();
		System.out.println(title);

	}

}

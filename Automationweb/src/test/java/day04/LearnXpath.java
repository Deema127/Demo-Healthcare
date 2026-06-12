package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		driver .manage().window().maximize();
//		driver.findElement(By.xpath("//a[@id='btn-make-appointment']")).click();
//		driver.findElement(By.xpath("//a[text()='Make Appointment']")).click();
//		driver.findElement(By.xpath("//a[contains(@id,'btn-make')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Make')]")).click();
//		driver.findElement(By.xpath("//a[starts-with(@id,'btn-make')]")).click();

	}

}

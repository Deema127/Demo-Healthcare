package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
//		simple Alert
//		driver.findElement(By.id("OKTab")).click();
//		String text = driver.switchTo().alert().getText();
//		System.out.print(text);
//		driver.switchTo().alert().accept();

//		confirmation Alert
		driver.findElement(By.partialLinkText("Alert with OK & Cancel")).click();
		driver.findElement(By.id("CancelTab")).click();
		driver.switchTo().alert().dismiss();
		
//		promt Alert
//		driver.findElement(By.partialLinkText("Alert with Textbox")).click();
//		driver.findElement(By.id("Textbox")).click();
//		driver.switchTo().alert().sendKeys("deem");
//		driver.switchTo().alert().accept();
		
		

	}

}

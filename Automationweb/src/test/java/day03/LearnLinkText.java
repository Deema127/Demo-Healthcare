package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		driver.manage().window().maximize();
		
//		driver.findElement(By.linkText("info@katalon.com")).click();
//		way2 if the link contain numbers used partial
		driver.findElement(By.partialLinkText("info@katalon.com")).click();

	}

}

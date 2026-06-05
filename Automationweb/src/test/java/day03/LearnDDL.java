package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDDL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
//		learn single DDL
		WebElement CourseDDL = driver.findElement(By.id("course"));
		Select dd = new Select(CourseDDL);
//		dd.selectByIndex(1);//		way1
//		dd.selectByValue("python");//		way2
        dd.selectByVisibleText("Dot Net");//		way3
		
//		multi DDL
        WebElement multiDDL = driver.findElement(By.id("ide"));
        Select mDDL = new Select(multiDDL);
        mDDL.selectByIndex(0);
        mDDL.selectByIndex(1);
        mDDL.selectByIndex(2);
        mDDL.deselectByIndex(2);
	}

}

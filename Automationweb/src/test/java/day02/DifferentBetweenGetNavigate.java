package day02;

import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentBetweenGetNavigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");
driver.manage().window().maximize();
driver.navigate().back();
	}

}

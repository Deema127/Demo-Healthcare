package day01;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriverManager.chromiumdriver().setup();
        ChromeDriver driver = new ChromeDriver();
//     way 01 LunchURL
//        driver.get("https://katalon-demo-cura.herokuapp.com/");
//       way 02 LunchBrowser
        driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");

	}

}

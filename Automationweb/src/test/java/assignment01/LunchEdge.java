package assignment01;

import org.openqa.selenium.edge.EdgeDriver;

public class LunchEdge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EdgeDriver edge = new EdgeDriver();
//edge.get("https://cura.com/demo-home-health/");
	edge.navigate().to("https://cura.com/demo-home-health/");;
	
	}

}

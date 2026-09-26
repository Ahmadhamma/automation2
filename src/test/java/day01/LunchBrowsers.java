package day01;

import org.openqa.selenium.chrome.ChromeDriver;

public class LunchBrowsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		//driver.get("Facebook.com");
		driver.navigate().to("Facebook.com");
		driver.navigate().back();
		driver.navigate().forward();
	}

}

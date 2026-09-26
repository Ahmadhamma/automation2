package day05;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	
	public static void main(String[] args) {
		
	ChromeDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.selenium.dev/selenium/web/alerts.html#");
	driver.manage().window().maximize();

//	driver.findElement(By.id("alert")).click();
//	String alerttext = driver.switchTo().alert().getText();
//	System.out.println(alerttext);
//	driver.switchTo().alert().accept();
	//confirmation alert
//	driver.findElement(By.id("confirm")).click();
//
//	driver.switchTo().alert().dismiss();
	
	driver.findElement(By.id("double-prompt")).click();
driver.switchTo().alert().sendKeys("Ahmad");
	//driver.switchTo().alert().accept();
	driver.switchTo().alert().dismiss();
	driver.close();
}
}
package day03;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {
	
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");
		driver.manage().window().maximize();

		driver.findElement(By.id("btn-make-appointment")).click();
		driver.findElement(By.name("username")).sendKeys("John Doe");
		driver.findElement(By.name("password")).sendKeys("ThisIsNotAPassword");
		driver.findElement(By.id("btn-login")).click();
		driver.findElement(By.id("txt_visit_date")).sendKeys("22/09/2026");
		driver.findElement(By.id("txt_comment")).sendKeys("don");
driver.findElement(By.id("btn-book-appointment")).click();
		
		String title = driver.findElement(By.tagName("h2")).getText();

		System.out.println(" title");


		driver.close();


		
		
		
		
	}

}

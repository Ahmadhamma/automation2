package day02;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("btn-make-appointment")).click();
		driver.findElement(By.name("username")).sendKeys("John Doe");
		driver.findElement(By.name("password")).sendKeys("ThisIsNotAPassword");
		driver.findElement(By.id("btn-login")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String title = driver.findElement(By.tagName("h2")).getText();
		System.out.println(title);
		driver.close();
		driver.quit();
//		driver.findElement(By.linkText("info@katalon.com")).click();

//		driver.findElement(By.partialLinkText("info@")).click();

	}
}

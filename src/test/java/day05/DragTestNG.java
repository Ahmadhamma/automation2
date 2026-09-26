package day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragTestNG {

	ChromeDriver driver;
	@BeforeMethod 

	public void dragTest() {
		 driver=new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void drop() {
		driver.switchTo().frame(0);
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		Actions dd=new Actions(driver);
		dd.dragAndDrop(draggable, droppable).perform();
	}
//	@AfterMethod
//	public void closebrwser() {
//		driver.quit();
//		
//	}
}

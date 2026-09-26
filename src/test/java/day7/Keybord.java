package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keybord {
	
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://jqueryui.com/selectable/");
		driver.switchTo().frame(0);
		WebElement item1 = driver.findElement(By.xpath("//li[text()=\"Item 1\"]"));
		WebElement item2 = driver.findElement(By.xpath("//li[text()=\"Item 2\"]"));
		WebElement item3 = driver.findElement(By.xpath("//li[text()=\"Item 3\"]"));
		Actions builder = new Actions (driver);
		builder.keyDown(Keys.CONTROL).click(item1).click(item2).click(item3).perform();

	}
}

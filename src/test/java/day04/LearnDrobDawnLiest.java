package day04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class LearnDrobDawnLiest {
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		driver.manage().window().maximize();

WebElement course = driver.findElement(By.id("course"));
Select dd = new Select(course);
//dd.selectByIndex(1);
dd.selectByValue("net");

WebElement ide = driver.findElement(By.id("ide"));
Select dd1 =new Select(ide);
dd1.selectByIndex(1);
dd1.selectByIndex(2);

dd1.selectByIndex(3);
dd1.deselectByIndex(1);


}}

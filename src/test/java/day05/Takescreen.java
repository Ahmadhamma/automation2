package day05;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takescreen {
public static void main(String[] args) throws IOException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		driver.manage().window().maximize();

		driver.findElement(By.id("btn-make-appointment")).click();
		File src = driver.getScreenshotAs(OutputType.FILE);
		File scree = new File("./screen/1.png");
		FileUtils.copyFile(src, scree);
		
}}

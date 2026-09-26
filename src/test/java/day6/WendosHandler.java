package day6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.util.List;

public class WendosHandler {
	public static void main(String[] args) {
		
	
//	String[] name = {"ahmad","mohamad","khaled"};
//	String [] name2 = new String(5);
//	//name2[0]="ahmad";
//	for(int i=0;i<name.length;i++)
//		System.out.println(name[i]);
//	+
		
//		ArrayList<Integer> Ar1 = new ArrayList<Integer>();
//		Ar1.add(10);
//		Ar1.add(20);
//		Ar1.add(30);
//		System.out.println(Ar1.get(0));
//		System.out.println(Ar1.size());
//		for(int num:Ar1) {
//			System.out.println(num);
//		}
		
//		HashSet<Integer>Ar2=new HashSet();
//		Ar2.add(11);
//		Ar2.add(12);
//		Ar2.add(13);
//		Ar2.add(14);
//		for(int num:Ar2) {
//			System.out.println(num);
//		}
//		
//		ArrayList <Integer> Ar1 =new ArrayList<Integer>(Ar2);
//		System.out.println(Ar1.get(0));
//		
		
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.w3schools.com/js/js_popup.asp");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Try it Yourself »")).click();
		String title = driver.getTitle();
		System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		ArrayList <String> ls = new ArrayList (windowHandles);
		driver.switchTo().window(ls.get(1));
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}}
package week5.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContectMerge {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		
		//its click current page first widget
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		
		//its goes to window(1)
		Set<String> WindowHandles =driver.getWindowHandles();
		List<String> window=new ArrayList<String>(WindowHandles);
		String newWindow=window.get(1);
		driver.switchTo().window(newWindow);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='DemoCustomer']")).click();
	
		//its return current window
		String j=window.get(0);
		driver.switchTo().window(j);
	
		//its click current page second widget
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		
		//its goes to window(1)
		Set<String> WindowHandle1 =driver.getWindowHandles();
		List<String> window1=new ArrayList<String>(WindowHandle1);
		String newWindow1=window1.get(1);
		driver.switchTo().window(newWindow1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='DemoLBCust']")).click();
		
	   //its return current window	
		String k=window.get(0);
		driver.switchTo().window(k);
		
		//click merge
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
	
		//accept the notification	
		 Alert simple = driver.switchTo().alert();
		 Thread.sleep(3000);
		 simple.accept();
	
		}

}

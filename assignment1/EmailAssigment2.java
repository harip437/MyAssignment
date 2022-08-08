package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EmailAssigment2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();//DOWNLOAADED DRIVER AND SET THE PATH
		ChromeDriver driver=new ChromeDriver();//INITIALIZE OBJ 
		driver.get("https://acme-test.uipath.com/login");//LOADING URL
		driver.manage().window().maximize();//BROWSER SIZE MINIMIZE TO MAXIMIZE
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		System.out.println("The title is "+driver.getTitle());
		if(driver.getTitle().contains("ACME")) 
		{
			System.out.println("I CONFIRMED THE TITLE");	
		}else
			System.out.println(" the title is not fit");
		
		driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
		driver.close();

	}

}

package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("hari");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String title="Find Lead";//its our manually its are not
		String title2=driver.getTitle();
		System.out.println(title2);
		if(title2.contains(title))//contains is used for partially its equal r not
		{
			System.out.println("CreateLead created successfully");
			
		}else {
			System.out.println("CreateLead not created successfully");
			}
		Thread.sleep(2000);
		driver.findElement(By.linkText("10502")).click();
		driver.findElement(By.linkText("Edit")).click();
		Thread.sleep(2000);
        driver.findElement(By.id("updateLeadForm_companyName")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Amazon");
        driver.findElement(By.name("submitButton")).click();
 
        
	}}

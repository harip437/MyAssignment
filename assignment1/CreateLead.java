package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Contact')]")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("hari");
		driver.findElement(By.id("lastNameField")).sendKeys("p");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("hari");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("p");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Computer science");
		driver.findElement(By.id("createContactForm_description")).sendKeys("i from chennai, i want to go US");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("plhari1999@gmail.com");
		WebElement createContactForm_generalStateProvinceGeoId = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select oj=new Select(createContactForm_generalStateProvinceGeoId);
		oj.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("i want to go goe");
		driver.findElement(By.xpath("//input[@class='smallSubmit'][1]")).click();
		String title="View Contect";//its our manually its are not
		String title2=driver.getTitle();
		System.out.println(title2);
		if(title2.contains(title))//contains is used for partially its equal r not
		{
			System.out.println("Createcontect created successfully");
			
		}else {
			System.out.println("Createcontect not created successfully");
			}
			}
	}



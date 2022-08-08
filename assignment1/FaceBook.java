package assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofHours(30));
		driver.findElement(By.xpath(("//a[contains(@class,'_42ft _4jy0 _6lt')]"))).click();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Hariharan");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("P");
		driver.findElement(By.name("reg_email__")).sendKeys("9876543210");
		driver.findElement(By.name("reg_passwd__")).sendKeys("plhari1999");
		WebElement day = driver.findElement(By.id("day"));
		Select dd4=new Select(day);
		dd4.selectByValue("1");
		WebElement month = driver.findElement(By.id("month"));
		Select dd5=new Select(month);
		dd5.selectByValue("11");
		WebElement year = driver.findElement(By.id("year"));
		Select dd6=new Select(year);
		dd6.selectByValue("1999");
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.name("websubmit")).click();
	
		
		
	}
	
}

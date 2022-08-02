package week3.seleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testleaflogin {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();//download the driver and set the path
		ChromeDriver driver=new ChromeDriver();//launch chrome driver
		driver.get("http://leaftaps.com/opentaps/control/main");//load the application url,so copy the url of the browser url
driver.manage().window().maximize();//window().maximize() its used for maximize the browser
driver.findElement(By.id("username")).sendKeys("Demosalesmanager");//sendkey is used for inputtext
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();//click is used to click the button
String text =driver.findElement(By.tagName("h2")).getText();//tagname is used for mention tag, its in string
System.out.println(text);
driver.findElement(By.linkText("CRM/SFA")).click();//link a.href so used linkText
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.partialLinkText("Create")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("hari");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("p");
driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("01/11/99");
driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("hariharan");
driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("p");
driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Computer science");
driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("3,50,000");
driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("100");
driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9876543210");
driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("hpph2109@gmail.com");
driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.testleaf.com");
driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("raju");
driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("No:30,Thiruvalur,chennai");
driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("No:30,Thiruvalur,chennai");
driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Rajesh");
driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("chennai");
driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("117");
driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("01");
WebElement createLeadForm_dataSourceId = driver.findElement(By.id("createLeadForm_dataSourceId"));
Select dd1=new Select(createLeadForm_dataSourceId);
dd1.selectByVisibleText("Employee");
WebElement createLeadForm_industryEnumId = driver.findElement(By.id("createLeadForm_industryEnumId"));
Select dd2=new Select(createLeadForm_industryEnumId);
dd2.selectByVisibleText("Computer Software");
WebElement createLeadForm_currencyUomId = driver.findElement(By.id("createLeadForm_currencyUomId"));
Select dd3=new Select(createLeadForm_currencyUomId);
dd3.selectByVisibleText("INR - Indian Rupee");
WebElement createLeadForm_ownershipEnumId = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
Select dd4=new Select(createLeadForm_ownershipEnumId);
dd4.selectByValue("OWN_PUBLIC_CORP");
WebElement createLeadForm_marketingCampaignId= driver.findElement(By.id("createLeadForm_marketingCampaignId"));
Select ojb=new Select(createLeadForm_marketingCampaignId);
ojb.selectByVisibleText("Affiliate Sites");
driver.findElement(By.name("submitButton")).click();
String title="View Lead";//its our manually its are not
String title2=driver.getTitle();
System.out.println(title2);
if(title2.contains(title))//contains is used for partially its equal r not
{
	System.out.println("CreateLead created successfully");
	
}else {
	System.out.println("CreateLead not created successfully");
	}
	}}

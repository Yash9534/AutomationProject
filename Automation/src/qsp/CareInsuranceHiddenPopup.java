package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CareInsuranceHiddenPopup {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
	driver.findElement(By.id("policynumber")).sendKeys("123");
	driver.findElement(By.id("dob")).click();
	WebElement month = driver.findElement(By.xpath("//select[@aria-label='Select month']"));
	Select m=new Select(month);
	m.selectByVisibleText("May");
	WebElement year = driver.findElement(By.xpath("//select[@aria-label='Select year']"));
	Select y=new Select(year);
	y.selectByValue("1998");
	driver.findElement(By.xpath("(//td[@data-handler='selectDay'])[25]")).click();
	driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
	driver.findElement(By.id("renew_policy_submit")).click();
	String text = driver.findElement(By.id("policynumberError")).getText();
	System.out.println(text);
	driver.close();
		}
}

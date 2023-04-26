package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CheckboxPresent {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com/");
	boolean checkbox = driver.findElement(By.xpath("//input[@name='remember']")).isSelected();
			if(checkbox==true)
			{
				System.out.println("pass");
			}
			else
			{
				System.out.println("fail");
			}
			driver.close();

		}
}

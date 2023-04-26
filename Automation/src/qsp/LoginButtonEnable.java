package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginButtonEnable {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			boolean login = driver.findElement(By.name("login")).isEnabled();
			if(login==true)
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

package qsp;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WithoutDuplicate {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Asus/Desktop/hotel.html");
	HashSet<String> al=new HashSet<String>();
	WebElement mtrListbox = driver.findElement(By.id("mtr"));
	Select s=new Select(mtrListbox);
	List<WebElement> allOpt = s.getOptions();
	int count = allOpt.size();
	System.out.println(count);
	for(int i=0;i<count;i++)
	{
		String text = allOpt.get(i).getText();
		al.add(text);
	}
	for(String text:al)
	{
		System.out.println(text);
	}
	driver.close();

		}
}

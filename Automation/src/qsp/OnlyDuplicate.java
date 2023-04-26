package qsp;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class OnlyDuplicate {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) {
			HashSet<String> hs=new HashSet<String>();
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Asus/Desktop/hotel.html");
	WebElement mtrListbox = driver.findElement(By.id("mtr"));
	Select s=new Select(mtrListbox);
	List<WebElement> allOption = s.getOptions();
	int count = allOption.size();
	System.out.println(count);
	for(int i=0;i<count;i++)
	{
		String text = allOption.get(i).getText();
		if(hs.add(text)==false) {
			System.out.println(text);
		}
	}
	driver.close();
		}
}

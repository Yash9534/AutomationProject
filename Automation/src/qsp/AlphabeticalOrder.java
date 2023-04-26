package qsp;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class AlphabeticalOrder {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		TreeSet<String>ts=new TreeSet<String>();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Asus/Desktop/hotel.html");
		WebElement mtrListbox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListbox);
		List<WebElement> allOptions = s.getOptions();
		int count = allOptions.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String text = allOptions.get(i).getText();
			ts.add(text);
		}
		for(String text:ts){
			System.out.println(text);
		}
		driver.close();

	}

}

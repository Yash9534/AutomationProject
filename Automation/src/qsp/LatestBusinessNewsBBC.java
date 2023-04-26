package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LatestBusinessNewsBBC {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
		List<WebElement> al = driver.findElements(By.xpath("(//a[@class='top-list-item__link'])[1]/../../li/a/h3[1]"));
		int count = al.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String text = al.get(i).getText();
			System.out.println(text);
		}
		driver.close();

	}
}

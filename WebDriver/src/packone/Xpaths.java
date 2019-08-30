package packone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpaths {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://rediff.com");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("html/body/div/div/div[2]/a")).click();

		driver.findElement(By.xpath("//a[@href='https://mail.rediff.com/cgi-bin/login.cgi' and @title='Lightning fast free email']")).click();
		
		List<WebElement> values=driver.findElements(By.xpath("//select[@id='day']/descendant::*"));
		System.out.println(values.size());
	}

}

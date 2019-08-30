package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Validations {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://bharatmatrimony.com");
		driver.manage().window().maximize();
		
		WebElement name=driver.findElement(By.id("NAME"));
		
		/*System.out.println(name.getAttribute("class"));
		System.out.println(name.getSize());
		System.out.println(name.getTagName());
		System.out.println(name.getLocation());*/
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle());
		
		driver.manage().window().fullscreen();
		driver.manage().window().getSize();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		
		/*driver.findElement(By.id("REGISTERED_BY")).sendKeys("Friend");
		boolean a=driver.findElement(By.id("NAME")).isDisplayed();
		if(a==true)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		boolean b=driver.findElement(By.id("NAME")).isEnabled();
		if(b==true)
			System.out.println("Pass");
		else
			System.out.println("Fail");*/
		
		
		

	}

}

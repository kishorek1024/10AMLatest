package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BO {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\10WD\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		/*driver.findElement(By.id("email")).sendKeys("Kishore");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("sdsdf");
		driver.findElement(By.id("email")).clear();*/
		
		WebElement uid=driver.findElement(By.id("email"));
		uid.sendKeys("Kishore");
		uid.clear();
		uid.sendKeys("sdfsdfs");
		uid.clear();
		
		WebElement pwd=driver.findElement(By.id("pass"));
		pwd.sendKeys("dsfsdfds");
		
		
		
		/*driver.findElement(By.id("pass")).sendKeys("abcdef");
		driver.findElement(By.id("day")).sendKeys("24");
		driver.findElement(By.id("month")).sendKeys("Apr");
		
		driver.findElement(By.id("u_0_9")).click();
		driver.findElement(By.id("pass")).clear();*/
		
		

	}

}

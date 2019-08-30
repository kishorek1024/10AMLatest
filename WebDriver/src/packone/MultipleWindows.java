package packone;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindows {
	public static WebDriver driver1;
	public static WebDriver driver2;
	public static WebDriver driver3;

	public static void main(String[] args) throws Exception{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		// CLicking On Data Policy Link
		driver.findElement(By.id("privacy-link")).click();
		// Clicking On Cookie Policy Link
		driver.findElement(By.id("cookie-use-link")).click();
		
		Set<String> windows=driver.getWindowHandles();
		ArrayList a=new ArrayList(windows);
		
		//driver.switchTo().window((String)a.get(1)).close();
		
		/*int i; int j;
		for(i=0; i<a.size(); i++){
			System.out.println(driver.switchTo().window((String)a.get(i)).getTitle());
			List<WebElement> links=driver.switchTo().window((String)a.get(i)).findElements(By.tagName("a"));
			   for(j=0; j<links.size(); j++){
				   System.out.println(links.get(j).getText());
			   }
			   System.out.println("-----------------------------------");
			   driver.close();			
		}


	
*/
		
		driver1=driver.switchTo().window((String)a.get(0));
		driver2=driver.switchTo().window((String)a.get(1));
		driver3=driver.switchTo().window((String)a.get(2));
		
		driver1.findElement(By.id("email")).sendKeys("Kishore");
		Thread.sleep(5000);
		driver2.findElement(By.id("pass")).sendKeys("abcdefgh");
		
		/*driver.switchTo().window((String)a.get(0)).findElement(By.id("email")).sendKeys("Kishore");
		Thread.sleep(5000);
		driver.switchTo().window((String)a.get(1)).findElement(By.id("pass")).sendKeys("Kishore");*/
	}		
}

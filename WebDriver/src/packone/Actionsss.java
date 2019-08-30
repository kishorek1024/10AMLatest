package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsss {

	public static void main(String[] args) throws Exception{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		// Importing Actions Class
		Actions a=new Actions(driver);
		WebElement element=driver.findElement(By.id("email"));
		
		a.contextClick(element).build().perform();
		
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(3000);
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(3000);
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(3000);
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(3000);
		
		a.sendKeys(Keys.ENTER).build().perform();
		
		a.dragAndDrop(element, element).build().perform();
		a.clickAndHold(element).build().perform();
		a.release().build().perform();
		
		
		
		/*WebElement button=driver.findElement(By.id("u_0_a"));
		a.doubleClick(button).build().perform();*/
		
		
		/*//a.sendKeys(Keys.F5).build().perform();
		//a.sendKeys(Keys.CONTROL+"t").build().perform();
		WebElement element=driver.findElement(By.id("email"));
		a.sendKeys(element, "abcdef").build().perform();*/
		
		
		
		/*// Creating Webelement for Companies
		WebElement companies=driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[3]/a/div"));
		
		// Importing Actions Class
		Actions a=new Actions(driver);
		
		// Move the cursor to Companies link
		a.moveToElement(companies).build().perform();
		
		// Clicking on About companies link under menu
		driver.findElement(By.xpath("//a[@href='https://www.ambitionbox.com/companies?utm_source=naukri&utm_medium=gnb']")).click();*/
		

	}

}

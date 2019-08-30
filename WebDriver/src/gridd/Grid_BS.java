package gridd;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Grid_BS {

	public static void main(String[] args) throws Exception{
		
		URL u=new URL("https://pallavi151:78opz6ZJZF2Mb2zp3z7x@hub-cloud.browserstack.com/wd/hub");

		DesiredCapabilities d=new DesiredCapabilities();
				
		d.setCapability("os", "WINDOWS");
		d.setCapability("os_version", "10");
		d.setCapability("browser", "Chrome");
		d.setCapability("browser_version", "75");
		d.setCapability("browserstack.debug", true);
		
		
		RemoteWebDriver r=new RemoteWebDriver(u, d);
		
		WebDriver driver=r;
		
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("email")).sendKeys("Kishore");
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		
		
	}

}

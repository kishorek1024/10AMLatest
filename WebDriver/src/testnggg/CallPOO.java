package testnggg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import packone.PO;

public class CallPOO {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		
		PO p=PageFactory.initElements(driver, PO.class);
		p.FN.sendKeys("ghjk");
		
		

	}

}

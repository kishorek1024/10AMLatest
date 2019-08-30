package packone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class CallPO {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		
		/*PO p=new PO();
		driver.findElement(p.fullname).sendKeys("Kishore");
		driver.findElement(p.RediffID).sendKeys("kishore");*/
		
		PO p=PageFactory.initElements(driver, PO.class);
		p.FN.sendKeys("Kishore");
		p.RID.sendKeys("sdfsdfsd");
		
		POLogin login=PageFactory.initElements(driver, POLogin.class);
		login.uid.sendKeys("sdfsdf");
		
		

	}

}

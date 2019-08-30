package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoITTT {

	public static void main(String[] args) throws Exception{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://transfer.pcloud.com/");
		driver.manage().window().maximize();
		
		// Clicking On Image
		driver.findElement(By.xpath("//*[@src='//pcdn-transfer.pcloud.com/Zfb/img/add_files_ico.png']")).click();
		// Executing AutoIT .exe file
		Runtime.getRuntime().exec("C:\\Users\\DELL\\Desktop\\10WD\\0727.exe");

	}

}

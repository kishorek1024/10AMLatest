package packone;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Misc {

	public static void main(String[] args) throws Exception{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\DELL\\Desktop\\10WD\\0808.png"));
		
		/*WebElement month=driver.findElement(By.id("month"));
		
		List<WebElement> values=month.findElements(By.tagName("option"));
		System.out.println(values.size());
		
		List<WebElement> values1=driver.findElements(By.tagName("option"));
		System.out.println(values1.size());
		
		Select s=new Select(month);
		s.selectByIndex(4);
		System.out.println(s.getAllSelectedOptions().size());*/

	}

}

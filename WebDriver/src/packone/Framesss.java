package packone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Framesss {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.manage().window().maximize();
		
		List<WebElement> frames=driver.findElements(By.tagName("frame"));
		
		int i;
		for(i=0; i<frames.size(); i++){
			List<WebElement> links=driver.switchTo().frame(i).findElements(By.tagName("a"));
			System.out.println(links.size());
			driver.switchTo().parentFrame();
		}
		
		/*// Creating WebElement for Frame
		WebElement f1=driver.findElement(By.name("packageListFrame"));
		// Switching focus to Frame
		driver.switchTo().frame(f1).findElement(By.xpath("//a[@href='java/applet/package-frame.html']")).click();

		driver.switchTo().parentFrame();
		// Creating WebElement for Frame2
		WebElement f2=driver.findElement(By.name("packageFrame"));
		driver.switchTo().frame(f2).findElement(By.xpath("//a[@href='AppletStub.html']")).click();*/
	}

}

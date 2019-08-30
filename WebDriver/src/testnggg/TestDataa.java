package testnggg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestDataa {
	public WebDriver driver;
	
	@DataProvider(name="TestData1")
	public Object[][] data(){
       Object[][] obj=new Object[3][2];
       obj[0][0]="Kishore"; obj[0][1]="abcdefgh";
       obj[1][0]="Kishore1"; obj[1][1]="abcdefgh123";
       obj[2][0]="Kishore2"; obj[2][1]="abcdefgh456";
       return obj;
	}
  @Test(dataProvider="TestData1")
  public void f(String uid, String pwd) {
	  driver.findElement(By.id("email")).sendKeys(uid);
	  driver.findElement(By.id("pass")).sendKeys(pwd);
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver=new FirefoxDriver();
	  driver.get("http://facebook.com");
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}

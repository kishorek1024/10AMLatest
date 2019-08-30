package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PO {
	
	// First Way to Create Page Objects
	/*By fullname=By.xpath("//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input");
	By RediffID=By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]");*/
	
	
	// Second Way To Create Page Objects
	public @FindBy(xpath="//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input") WebElement FN;
	public @FindBy(xpath="//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]") WebElement RID;
	
	
	

}
